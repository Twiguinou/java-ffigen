package fr.kenlek.jpgen.data;

import fr.kenlek.jpgen.HostReference;
import fr.kenlek.jpgen.PathProvider;
import fr.kenlek.jpgen.data.impl.LayoutReference;
import fr.kenlek.jpgen.data.impl.TypeOp;
import fr.kenlek.jpgen.data.impl.TypeReference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class CodeUtils
{private CodeUtils() {}

    public static final String VALUE_LAYOUT = "java.lang.foreign.ValueLayout";
    public static final String MEMORY_LAYOUT = "java.lang.foreign.MemoryLayout";
    public static final String SEQUENCE_LAYOUT = "java.lang.foreign.SequenceLayout";
    public static final String FUNCTION_DESCRIPTOR = "java.lang.foreign.FunctionDescriptor";
    public static final String METHOD_HANDLE = "java.lang.invoke.MethodHandle";
    public static final String FOREIGN_UTILS = "fr.kenlek.jpgen.ForeignUtils";
    public static final String UNBOUNDED_POINTER = String.format("%s.UNBOUNDED_POINTER", FOREIGN_UTILS);
    public static final String MEMORY_SEGMENT = "java.lang.foreign.MemorySegment";
    public static final String ARENA = "java.lang.foreign.Arena";
    public static final String STRUCT_LAYOUT = "java.lang.foreign.StructLayout";
    public static final String UNION_LAYOUT = "java.lang.foreign.UnionLayout";
    public static final String SEGMENT_ALLOCATOR = "java.lang.foreign.SegmentAllocator";
    public static final String CONSUMER = "java.util.function.Consumer";
    public static final String THROWABLE = "java.lang.Throwable";
    public static final String ASSERTION_ERROR = "java.lang.AssertionError";
    public static final String LAYOUT_DATA = "fr.kenlek.jpgen.LayoutData";
    public static final String LIST = "java.util.List";
    public static final String HOST = "fr.kenlek.jpgen.Host";
    public static final String MEMBER = "fr.kenlek.jpgen.Member";
    public static final String FUNCTION = "java.util.function.Function";
    public static final String OVERRIDE = "java.lang.Override";

    public static String makeFunctionDescriptor(FunctionType functionType, LayoutReference.Descriptor reference)
    {
        StringBuilder code = new StringBuilder();
        code.append(FUNCTION_DESCRIPTOR);
        if (functionType.isVoid())
        {
            code.append(".ofVoid(");
        }
        else
        {
            code.append(".of(").append(functionType.returnType().process(reference));
            if (!functionType.parametersTypes().isEmpty()) code.append(", ");
        }

        code.append(functionType.parametersTypes().stream()
                .map(type -> type.process(reference))
                .collect(Collectors.joining(", ")));

        code.append(")");
        return code.toString();
    }

    public static String makeJavaParameters(TypeReference reference, List<FunctionType.Parameter> parameters)
    {
        return parameters.stream()
                .map(parameter -> String.format("%s %s", parameter.type().process(reference), parameter.name()))
                .collect(Collectors.joining(", "));
    }

    public static String processParameters(boolean wrap, List<FunctionType.Parameter> parameters)
    {
        return parameters.stream()
                .map(parameter -> parameter.type().process(new TypeOp(wrap, parameter.name())))
                .collect(Collectors.joining(", "));
    }

    public static Map<HostReference, EnumType.Decl> specializeEnums(
            Map<HostReference, EnumType.Decl> versions, HostReference globalHost, PathProvider.HostSpecific provider)
    {
        EnumType.Decl sample = versions.values().stream()
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("No version provided."));
        String sampleSymbolicName = sample.symbolicName();

        Set<EnumType.Constant> commonConstants = new LinkedHashSet<>(sample.constants);
        versions.values().forEach(v -> commonConstants.retainAll(v.constants));
        if (commonConstants.isEmpty() || versions.values().stream().anyMatch(v -> !v.symbolicName().equals(sampleSymbolicName)))
        {
            return versions.entrySet().stream()
                    .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, entry -> entry.getValue().withPath(provider.getPath(entry.getKey()))));
        }

        ArrayList<Inheritance.Element<EnumType.SpecializedDecl>> children = new ArrayList<>(versions.size());
        EnumType.SpecializedDecl base = new EnumType.SpecializedDecl(provider.getPath(globalHost), sample.underlying(),
                List.copyOf(commonConstants), new Inheritance.Base<>(children));

        Map<HostReference, EnumType.Decl> specs = new HashMap<>();
        specs.put(globalHost, base);

        Inheritance.Subclass<EnumType.SpecializedDecl> inheritance = new Inheritance.Subclass<>(new Inheritance.Element<>(globalHost, base));
        for (Map.Entry<HostReference, EnumType.Decl> entry : versions.entrySet())
        {
            HostReference host = entry.getKey();
            List<EnumType.Constant> exclusiveConstants = entry.getValue().constants.stream()
                    .filter(Predicate.not(commonConstants::contains))
                    .toList();

            if (!exclusiveConstants.isEmpty())
            {
                EnumType.SpecializedDecl value = new EnumType.SpecializedDecl(provider.getPath(host), exclusiveConstants, inheritance);
                children.add(new Inheritance.Element<>(host, value));
                specs.put(host, value);
            }
        }

        children.trimToSize();
        return Map.copyOf(specs);
    }

    public static Map<HostReference, CallbackDeclaration> specializeCallbacks(
            Map<HostReference, CallbackDeclaration> versions, HostReference globalHost, PathProvider.HostSpecific provider)
    {
        CallbackDeclaration sample = versions.values().stream()
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("No version provided."));
        FunctionType sampleType = sample.descriptorType();

        for (CallbackDeclaration callback : versions.values())
        {
            if (!callback.descriptorType().fuzzyEquals(sampleType))
            {
                return versions.entrySet().stream()
                        .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, entry -> entry.getValue().withPath(provider.getPath(entry.getKey()))));
            }
        }

        return Map.of(globalHost, new CallbackDeclaration(provider.getPath(globalHost), sample.descriptorType, sample.parametersNames(),
                sample.descriptorName, sample.stubName));
    }

    public static Map<HostReference, RecordType.Decl> specializeRecords(
            Map<HostReference, RecordType.Decl> versions, HostReference globalHost, PathProvider.HostSpecific provider)
    {
        RecordType.Decl sample = versions.values().stream()
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("No declaration provided."));

        Map<HostReference, List<FuzzyMember>> orderedMembers = versions.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, entry -> entry.getValue().members.stream()
                        .map(FuzzyMember::new)
                        .toList()));

        if (versions.values().stream().allMatch(v -> v.kind == sample.kind) && orderedMembers.values().stream()
                                                                                       .distinct().limit(2).count() < 2)
        {
            return Map.of(globalHost, sample.withPath(provider.getPath(globalHost)));
        }

        Set<FuzzyMember> commonMembers = sample.members.stream()
                .map(FuzzyMember::new)
                .collect(Collectors.toCollection(HashSet::new));
        orderedMembers.values().forEach(commonMembers::retainAll);

        ArrayList<Inheritance.Element<SpecializedRecordDeclaration>> children = new ArrayList<>(versions.size());
        SpecializedRecordDeclaration base = new SpecializedRecordDeclaration(provider.getPath(globalHost), sample.pointerName,
                commonMembers.stream().map(FuzzyMember::value).toList(), new Inheritance.Base<>(children));

        Map<HostReference, RecordType.Decl> specs = new HashMap<>();
        specs.put(globalHost, base);

        Inheritance.Subclass<SpecializedRecordDeclaration> inheritance = new Inheritance.Subclass<>(new Inheritance.Element<>(globalHost, base));
        for (Map.Entry<HostReference, RecordType.Decl> version : versions.entrySet())
        {
            HostReference host = version.getKey();
            RecordType.Decl ref = version.getValue();

            SpecializedRecordDeclaration value = new SpecializedRecordDeclaration(provider.getPath(host), ref.kind, ref.members, inheritance);
            children.add(new Inheritance.Element<>(host, value));
            specs.put(host, value);
        }

        children.trimToSize();
        return Map.copyOf(specs);
    }

    public static Map<HostReference, HeaderDeclaration> specializeHeaders(
            Map<HostReference, HeaderDeclaration> versions, HostReference globalHost, PathProvider.HostSpecific provider)
    {
        HeaderDeclaration sample = versions.values().stream()
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("No declaration provided."));

        Set<HeaderDeclaration.Constant> commonConstants = new LinkedHashSet<>(sample.constants);
        Set<FuzzyBinding> commonBindings = sample.bindings.stream()
                .map(FuzzyBinding::new)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        versions.values().forEach(v ->
        {
            commonConstants.retainAll(v.constants);
            commonBindings.retainAll(v.bindings.stream().map(FuzzyBinding::new).toList());
        });

        if (commonConstants.isEmpty() && commonBindings.isEmpty())
        {
            return versions.entrySet().stream()
                    .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, entry -> entry.getValue().withPath(provider.getPath(entry.getKey()))));
        }

        ArrayList<Inheritance.Element<HeaderDeclaration.Specialized>> children = new ArrayList<>(versions.size());
        HeaderDeclaration.Specialized base = new HeaderDeclaration.Specialized(provider.getPath(globalHost),
                commonBindings.stream().map(FuzzyBinding::value).toList(), List.copyOf(commonConstants), new Inheritance.Base<>(children));

        Map<HostReference, HeaderDeclaration.Specialized> specs = new HashMap<>();
        specs.put(globalHost, base);

        Inheritance.Subclass<HeaderDeclaration.Specialized> inheritance = new Inheritance.Subclass<>(new Inheritance.Element<>(globalHost, base));
        for (Map.Entry<HostReference, HeaderDeclaration> version : versions.entrySet())
        {
            HostReference host = version.getKey();
            HeaderDeclaration ref = version.getValue();

            List<HeaderDeclaration.Constant> exclusiveConstants = ref.constants.stream()
                    .filter(Predicate.not(commonConstants::contains))
                    .toList();
            List<HeaderDeclaration.Binding> exclusiveBindings = ref.bindings.stream()
                    .map(FuzzyBinding::new)
                    .filter(Predicate.not(commonBindings::contains))
                    .map(FuzzyBinding::value)
                    .toList();

            if (!exclusiveConstants.isEmpty() || !exclusiveBindings.isEmpty())
            {
                HeaderDeclaration.Specialized value = new HeaderDeclaration.Specialized(provider.getPath(host), exclusiveBindings,
                        exclusiveConstants, inheritance);
                children.add(new Inheritance.Element<>(host, value));
                specs.put(host, value);
            }
        }

        children.trimToSize();
        return Map.copyOf(specs);
    }

    public static Map<HostReference, ? extends Declaration<?>> specializeOpaque(
            Map<HostReference, ? extends Declaration<?>> versions, HostReference globalHost, PathProvider.HostSpecific provider)
    throws IllegalArgumentException
    {
        if (versions.values().stream().allMatch(declaration -> declaration instanceof EnumType.Decl))
        {
            return specializeEnums(versions.entrySet().stream()
                    .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, entry -> (EnumType.Decl)entry.getValue())),
                    globalHost, provider);
        }

        if (versions.values().stream().allMatch(declaration -> declaration instanceof RecordType.Decl))
        {
            return specializeRecords(versions.entrySet().stream()
                    .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, entry -> (RecordType.Decl)entry.getValue())),
                    globalHost, provider);
        }

        return versions.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, entry -> entry.getValue().withPath(provider.getPath(entry.getKey()))));
    }
}
