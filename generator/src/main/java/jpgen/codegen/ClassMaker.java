package jpgen.codegen;

import jpgen.data.ConstantMacro;
import jpgen.data.EnumType;
import jpgen.data.FunctionType;
import jpgen.data.RecordType;
import jpgen.data.TypeManifold;

import java.lang.foreign.GroupLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.PaddingLayout;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static jpgen.codegen.CommonFunctions.*;

public final class ClassMaker
{private ClassMaker() {}
/*
    public static String generateEnum(EnumType enumType, TypeTranslation translation, String packageName, String className)
    {
        StringBuilder source = new StringBuilder();

        // HEADER
        source.append(STR."package \{packageName};\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."public final class \{className}\{LINE_SEPARATOR}");
        source.append(STR."{private \{className}() {}\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);

        // CONSTANTS
        String typeSpelling = javaType(enumType, translation);
        for (EnumType.Constant constant : enumType.constants())
        {
            withIndent(source, 1, STR."public static final \{typeSpelling} \{constant.name()} = \{constant.value()};\{LINE_SEPARATOR}");
        }

        source.append(STR."}\{LINE_SEPARATOR}");
        return source.toString();
    }

    public static String generateCallback(TypeManifold startType, TypeTranslation translation, String packageName, String className, String descriptorName, String stubName)
    {
        FunctionType.Callback callback = (FunctionType.Callback) flattenType(startType);
        StringBuilder source = new StringBuilder();
        boolean needsTranslation = callbackNeedsTranslation(callback);
        String[] resolvedArgNames = resolveFunctionArgNames(callback.innerType(), callback.argNames());

        // HEADER
        source.append(STR."package \{packageName};\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."public interface \{className}\{LINE_SEPARATOR}");
        source.append(STR."{\{LINE_SEPARATOR}");

        // TYPE INFO
        withIndent(source, 1, STR."\{FUNCTION_DESCRIPTOR_CLASSPATH} \{descriptorName} = \{functionDescriptor(callback.innerType(), translation)};\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."\{METHOD_HANDLE_CLASSPATH} \{stubName} = \{NATIVE_TYPES_CLASSPATH}.initUpcallStub(\{descriptorName}, \"invoke\", \{className}.class);\{LINE_SEPARATOR}");

        // USER INVOKE
        source.append(LINE_SEPARATOR);
        withIndent(source, 1, STR."\{javaType(callback.innerType().resultType(), translation)} invoke(");
        if (resolvedArgNames.length > 0)
        {
            source.append(STR."\{javaType(callback.innerType().argTypes()[0], translation)} \{resolvedArgNames[0]}");
            for (int i = 1; i < resolvedArgNames.length; i++)
            {
                source.append(STR.", \{javaType(callback.innerType().argTypes()[i], translation)} \{resolvedArgNames[i]}");
            }
        }
        source.append(STR.");\{LINE_SEPARATOR}");

        if (needsTranslation)
        {
            // TRANSLATION FOR RECORD TYPES
            source.append(LINE_SEPARATOR);
            withIndent(source, 1, STR."default \{nativeType(callback.innerType().resultType())} invoke(");
            if (resolvedArgNames.length > 0)
            {
                source.append(STR."\{nativeType(callback.innerType().argTypes()[0])} \{resolvedArgNames[0]}");
                for (int i = 1; i < callback.innerType().argTypes().length; i++)
                {
                    source.append(STR.", \{nativeType(callback.innerType().argTypes()[i])} \{resolvedArgNames[i]}");
                }
            }
            source.append(STR.")\{LINE_SEPARATOR}");
            withIndent(source, 1, STR."{\{LINE_SEPARATOR}");

            withIndent(source, 2, flattenType(callback.innerType().resultType()) == TypeManifold.VOID ? "this.invoke(" : "return this.invoke(");
            if (resolvedArgNames.length > 0)
            {
                source.append(flattenType(callback.innerType().argTypes()[0]) instanceof RecordType ? STR."new \{translation.recordInfo(callback.innerType().argTypes()[0]).classpath()}(\{resolvedArgNames[0]})" : resolvedArgNames[0]);
                for (int i = 1; i < callback.innerType().argTypes().length; i++)
                {
                    source.append(flattenType(callback.innerType().argTypes()[i]) instanceof RecordType ? STR.", new \{translation.recordInfo(callback.innerType().argTypes()[i]).classpath()}(\{resolvedArgNames[i]})" : STR.", \{resolvedArgNames[i]}");
                }
            }
            source.append(")");
            if (flattenType(callback.innerType().resultType()) instanceof RecordType)
            {
                source.append(STR.".\{translation.recordInfo(callback.innerType().resultType()).segmentField()}()");
            }
            source.append(STR.";\{LINE_SEPARATOR}");

            withIndent(source, 1, STR."}\{LINE_SEPARATOR}");
        }

        // HANDLE MAKER
        source.append(LINE_SEPARATOR);
        withIndent(source, 1, STR."default \{MEMORY_SEGMENT_CLASSPATH} makeHandle(\{ARENA_CLASSPATH} arena)\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."{\{LINE_SEPARATOR}");
        withIndent(source, 2, STR."return \{translation.headerInfo().linkerClasspath()}.upcallStub(\{stubName}.bindTo(this), \{descriptorName}, arena);\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."}\{LINE_SEPARATOR}");

        source.append(STR."}\{LINE_SEPARATOR}");
        return source.toString();
    }

    public static String generateRecord(TypeManifold startType, TypeTranslation translation)
    {
        RecordType recordType = (RecordType) flattenType(startType);
        GroupLayout layout = (GroupLayout) recordType.getLayout().orElseThrow();
        RecordInformation information = translation.recordInfo(startType);
        StringBuilder source = new StringBuilder();

        // HEADER
        source.append(STR."package \{information.packageName()};\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."public record \{information.name()}(\{MEMORY_SEGMENT_CLASSPATH} \{information.segmentField()})\{LINE_SEPARATOR}");
        source.append(STR."{\{LINE_SEPARATOR}");

        // MEMBER LAYOUT INFO
        int unnamedIndex = 0;
        for (RecordType.Field field : recordType.fields())
        {
            if (field.bitfield())
            {
                continue;
            }

            String layoutClass = layoutClass(field.type()), layoutInstance = layoutInstance(field.type(), translation);
            if (field.name().isPresent())
            {
                String fieldName = field.name().get();
                withIndent(source, 1, STR."public static final \{layoutClass} LAYOUT$\{fieldName} = \{layoutInstance};\{LINE_SEPARATOR}");
                withIndent(source, 1, STR."public static final long OFFSET$\{fieldName} = \{field.offset() / 8}L;\{LINE_SEPARATOR}");
            }
            else
            {
                withIndent(source, 1, STR."private static final \{layoutClass} UNNAMED_LAYOUT\{unnamedIndex} = \{layoutInstance};\{LINE_SEPARATOR}");
                ++unnamedIndex;
            }
        }

        // RECORD LAYOUT
        source.append(LINE_SEPARATOR);
        if (recordType.shape() == RecordType.Shape.STRUCT)
        {
            withIndent(source, 1, STR."public static final \{STRUCT_LAYOUT_CLASSPATH} \{information.layoutName()} = \{MEMORY_LAYOUT_CLASSPATH}.structLayout(\{LINE_SEPARATOR}");
        }
        else
        {
            withIndent(source, 1, STR."public static final \{UNION_LAYOUT_CLASSPATH} \{information.layoutName()} = \{MEMORY_LAYOUT_CLASSPATH}.unionLayout(\{LINE_SEPARATOR}");
        }
        unnamedIndex = 0;
        for (int i = 0; i < layout.memberLayouts().size(); i++)
        {
            String suffix = i == layout.memberLayouts().size() - 1 ? "" : ",";
            MemoryLayout memberLayout = layout.memberLayouts().get(i);
            Optional<String> name = memberLayout.name();
            if (memberLayout instanceof PaddingLayout)
            {
                withIndent(source, 3, STR."\{MEMORY_LAYOUT_CLASSPATH}.paddingLayout(\{memberLayout.byteSize()})\{suffix}\{LINE_SEPARATOR}");
            }
            else if (name.isPresent())
            {
                withIndent(source, 3, STR."LAYOUT$\{name.get()}\{suffix}\{LINE_SEPARATOR}");
            }
            else
            {
                withIndent(source, 3, STR."UNNAMED_LAYOUT\{unnamedIndex}\{suffix}\{LINE_SEPARATOR}");
                ++unnamedIndex;
            }
        }
        recordType.name().ifPresentOrElse(
                name -> withIndent(source, 1, STR.").withName(\"\{name}\");\{LINE_SEPARATOR}"),
                () -> withIndent(source, 1, STR.");\{LINE_SEPARATOR}")
        );

        // ALLOCATOR
        source.append(LINE_SEPARATOR);
        withIndent(source, 1, STR."public \{information.name()}(\{SEGMENT_ALLOCATOR_CLASSPATH} allocator)\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."{\{LINE_SEPARATOR}");
        withIndent(source, 2, STR."this(allocator.allocate(\{information.layoutName()}));\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."}\{LINE_SEPARATOR}");

        // BUFFER ACCESSOR
        source.append(LINE_SEPARATOR);
        withIndent(source, 1, STR."public static \{information.name()} getAtIndex(\{MEMORY_SEGMENT_CLASSPATH} buffer, int i)\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."{\{LINE_SEPARATOR}");
        withIndent(source, 2, STR."return new \{information.name()}(buffer.asSlice(i * \{information.layoutName()}.byteSize(), \{information.layoutName()}));\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."}\{LINE_SEPARATOR}");

        // FIELD ACCESS
        for (RecordType.Field field : recordType.fields())
        {
            if (field.bitfield())
            {
                continue;
            }

            field.name().ifPresent(fieldName ->
            {
                TypeManifold flattened = flattenType(field.type());
                switch (flattened)
                {
                    case TypeManifold.Primitive _, TypeManifold.Pointer _, FunctionType.Callback _, EnumType _ ->
                    {
                        String typeClasspath = javaType(flattened, translation);
                        String returnPrefix = "", assignPrefix = "";
                        if (typeClasspath.equals("char"))
                        {
                            returnPrefix = "(char)";
                            assignPrefix = "(byte)";
                        }

                        source.append(LINE_SEPARATOR);
                        withIndent(source, 1, STR."public \{typeClasspath} \{fieldName}() {return \{returnPrefix}this.\{information.segmentField()}.get(LAYOUT$\{fieldName}, OFFSET$\{fieldName});}\{LINE_SEPARATOR}");
                        withIndent(source, 1, STR."public void \{fieldName}(\{typeClasspath} value) {this.\{information.segmentField()}.set(LAYOUT$\{fieldName}, OFFSET$\{fieldName}, \{assignPrefix}value);}\{LINE_SEPARATOR}");
                        withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{fieldName}_ptr() {return this.\{information.segmentField()}.asSlice(OFFSET$\{fieldName}, LAYOUT$\{fieldName});}\{LINE_SEPARATOR}");
                    }
                    case TypeManifold.Array(_, TypeManifold elementType) ->
                    {
                        TypeManifold flattenedElementType = flattenType(elementType);
                        source.append(LINE_SEPARATOR);
                        withIndent(source, 1, STR."public \{MEMORY_SEGMENT_CLASSPATH} \{fieldName}() {return this.\{information.segmentField()}.asSlice(OFFSET$\{fieldName}, LAYOUT$\{fieldName});}\{LINE_SEPARATOR}");
                        if (flattenedElementType instanceof RecordType)
                        {
                            String classpath = translation.recordInfo(elementType).classpath();
                            withIndent(source, 1, STR."public \{classpath} \{fieldName}(int i) {return new \{classpath}(this.\{information.segmentField()}.asSlice(OFFSET$\{fieldName} + i * LAYOUT$\{fieldName}.byteSize(), LAYOUT$\{fieldName}));}\{LINE_SEPARATOR}");
                            withIndent(source, 1, STR."public void \{fieldName}(int i, \{CONSUMER_CLASSPATH}<\{classpath}> consumer) {consumer.accept(this.\{fieldName}(i));}\{LINE_SEPARATOR}");
                            withIndent(source, 1, STR."public void \{fieldName}(int i, \{classpath} value) {\{MEMORY_SEGMENT_CLASSPATH}.copy(value.\{information.segmentField()}(), 0, this.\{information.segmentField()}, OFFSET$\{fieldName} + i * LAYOUT$\{fieldName}.byteSize(), LAYOUT$\{fieldName}.byteSize());}\{LINE_SEPARATOR}");
                        }
                        else if (!(flattenedElementType instanceof TypeManifold.Array))
                        {
                            String typeClasspath = javaType(flattenedElementType, translation), layoutInstance = layoutInstance(flattenedElementType, translation);
                            String returnPrefix = "", assignPrefix = "";
                            if (typeClasspath.equals("char"))
                            {
                                returnPrefix = "(char)";
                                assignPrefix = "(byte)";
                            }

                            withIndent(source, 1, STR."public \{typeClasspath} \{fieldName}(int i) {return \{returnPrefix}this.\{fieldName}().getAtIndex(\{layoutInstance}, i);}\{LINE_SEPARATOR}");
                            withIndent(source, 1, STR."public void \{fieldName}(int i, \{typeClasspath} value) {this.\{fieldName}().setAtIndex(\{layoutInstance}, i, \{assignPrefix}value);}\{LINE_SEPARATOR}");
                        }
                    }
                    case RecordType _ ->
                    {
                        String classpath = translation.recordInfo(field.type()).classpath();
                        source.append(LINE_SEPARATOR);
                        withIndent(source, 1, STR."public \{classpath} \{fieldName}() {return new \{classpath}(this.\{information.segmentField()}.asSlice(OFFSET$\{fieldName}, LAYOUT$\{fieldName}));}\{LINE_SEPARATOR}");
                        withIndent(source, 1, STR."public void \{fieldName}(\{CONSUMER_CLASSPATH}<\{classpath}> consumer) {consumer.accept(this.\{fieldName}());}\{LINE_SEPARATOR}");
                        withIndent(source, 1, STR."public void \{fieldName}(\{classpath} value) {\{MEMORY_SEGMENT_CLASSPATH}.copy(value.\{information.segmentField()}(), 0, this.\{information.segmentField()}, OFFSET$\{fieldName}, LAYOUT$\{fieldName}.byteSize());}\{LINE_SEPARATOR}");
                    }
                    default -> {}
                }
            });
        }

        source.append(STR."}\{LINE_SEPARATOR}");
        return source.toString();
    }

    private static String defaultUnwrapParameter(String name, TypeManifold type, TypeTranslation translation)
    {
        if (flattenType(type) instanceof RecordType)
        {
            return STR."\{name}.\{translation.recordInfo(type).segmentField()}()";
        }

        return name;
    }

    public static String generateHeader(TypeTranslation translation, String libName, Collection<FunctionImport> imports, Collection<ConstantMacro> constants)
    {
        HeaderInformation information = translation.headerInfo();
        List<FunctionImport> staticImports = imports.stream().filter(FunctionImport::staticInit).toList();
        StringBuilder source = new StringBuilder();

        // HEADER
        source.append(STR."package \{information.packageName()};\{LINE_SEPARATOR}");
        source.append(LINE_SEPARATOR);
        source.append(STR."public final class \{information.name()}\{LINE_SEPARATOR}");
        source.append(STR."{private \{information.name()}() {}\{LINE_SEPARATOR}");

        // CONSTANTS
        if (!constants.isEmpty())
        {
            source.append(LINE_SEPARATOR);
            for (ConstantMacro macro : constants)
            {
                withIndent(source, 1, STR."public static final \{javaType(macro.integerType(), translation)} \{macro.identifier()} = \{macro.value()};\{LINE_SEPARATOR}");
            }
        }

        // HELPER VARIABLES
        source.append(LINE_SEPARATOR);
        withIndent(source, 1, STR."public static final \{LINKER_CLASSPATH} \{information.linkerName()};\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."public static final \{SYMBOL_LOOKUP_CLASSPATH} \{information.symbolTableName()};\{LINE_SEPARATOR}");

        // IMPORTS INFO
        if (!staticImports.isEmpty())
        {
            source.append(LINE_SEPARATOR);
            for (FunctionImport function : staticImports)
            {
                String fname = function.declaration().fname();
                withIndent(source, 1, STR."public static final \{MEMORY_SEGMENT_CLASSPATH} MTD_ADDRESS$\{fname};\{LINE_SEPARATOR}");
                withIndent(source, 1, STR."public static final \{METHOD_HANDLE_CLASSPATH} MTD$\{fname};\{LINE_SEPARATOR}");
            }
        }

        for (FunctionImport function : imports)
        {
            FunctionType.Declaration declaration = function.declaration();
            String[] resolvedArgNames = resolveFunctionArgNames(declaration.innerType(), declaration.argNames());
            boolean needsAllocator = flattenType(declaration.innerType().resultType()) instanceof RecordType;
            source.append(LINE_SEPARATOR);

            if (!declaration.commentBlock().isBlank())
            {
                declaration.commentBlock().lines().forEach(commentLine -> withIndent(source, 1, STR."\{commentLine}\{LINE_SEPARATOR}"));
            }

            withIndent(source, 1, STR."public static \{function.returnClasspath(javaType(declaration.innerType().resultType(), translation))} \{declaration.fname()}(");
            if (needsAllocator)
            {
                source.append(STR."\{SEGMENT_ALLOCATOR_CLASSPATH} allocator");
            }
            if (resolvedArgNames.length > 0)
            {
                String firstPrefix = needsAllocator ? ", " : "";
                source.append(STR."\{firstPrefix}\{function.parameterClasspath(0, javaType(declaration.innerType().argTypes()[0], translation))} \{resolvedArgNames[0]}");
                for (int i = 1; i < resolvedArgNames.length; i++)
                {
                    source.append(STR.", \{function.parameterClasspath(i, javaType(declaration.innerType().argTypes()[i], translation))} \{resolvedArgNames[i]}");
                }
            }
            source.append(STR.")\{LINE_SEPARATOR}");

            withIndent(source, 1, STR."{\{LINE_SEPARATOR}");

            // ACTUAL CALL
            String handle = function.handleReference(resolvedArgNames)
                    .or(() -> function.staticInit() ? Optional.of(STR."MTD$\{declaration.fname()}") : Optional.empty())
                    .orElseThrow();
            TypeManifold flattenedResultType = flattenType(declaration.innerType().resultType());
            StringBuilder callSequence = new StringBuilder();
            if (flattenedResultType == TypeManifold.VOID)
            {
                callSequence.append(STR."\{handle}.invokeExact(");
            }
            else if (flattenedResultType instanceof RecordType)
            {
                callSequence.append(STR."new \{javaType(declaration.innerType().resultType(), translation)}((\{MEMORY_SEGMENT_CLASSPATH})\{handle}.invokeExact(");
            }
            else
            {
                callSequence.append(STR."(\{javaType(declaration.innerType().resultType(), translation)})\{handle}.invokeExact(");
            }
            if (needsAllocator)
            {
                callSequence.append("allocator");
            }
            if (resolvedArgNames.length > 0)
            {
                String firstPrefix = needsAllocator ? ", " : "";
                callSequence.append(STR."\{firstPrefix}\{function.unwrapParameter(0, resolvedArgNames[0], defaultUnwrapParameter(resolvedArgNames[0], declaration.innerType().argTypes()[0], translation))}");
                for (int i = 1; i < resolvedArgNames.length; i++)
                {
                    callSequence.append(STR.", \{function.unwrapParameter(i, resolvedArgNames[i], defaultUnwrapParameter(resolvedArgNames[i], declaration.innerType().argTypes()[i], translation))}");
                }
            }
            callSequence.append(")");
            if (flattenedResultType instanceof RecordType)
            {
                callSequence.append(")");
            }

            if (flattenedResultType == TypeManifold.VOID)
            {
                withIndent(source, 2, STR."try {\{callSequence};}\{LINE_SEPARATOR}");
            }
            else
            {
                withIndent(source, 2, STR."try {return \{function.wrapReturnValue(callSequence.toString())};}\{LINE_SEPARATOR}");
            }

            withIndent(source, 2, STR."catch (\{THROWABLE_CLASSPATH} _) {throw new \{ASSERTION_ERROR_CLASSPATH}();}\{LINE_SEPARATOR}");
            withIndent(source, 1, STR."}\{LINE_SEPARATOR}");
        }

        // STATIC INIT 1
        source.append(LINE_SEPARATOR);
        withIndent(source, 1, STR."static\{LINE_SEPARATOR}");
        withIndent(source, 1, STR."{\{LINE_SEPARATOR}");
        withIndent(source, 2, STR."\{SYSTEM_CLASSPATH}.loadLibrary(\"\{libName}\");\{LINE_SEPARATOR}");
        withIndent(source, 2, STR."\{information.linkerName()} = \{LINKER_CLASSPATH}.nativeLinker();\{LINE_SEPARATOR}");
        withIndent(source, 2, STR."\{information.symbolTableName()} = name -> \{SYMBOL_LOOKUP_CLASSPATH}.loaderLookup().find(name).or(() -> \{information.linkerName()}.defaultLookup().find(name));\{LINE_SEPARATOR}");

        // STATIC INIT 2
        if (!staticImports.isEmpty())
        {
            source.append(LINE_SEPARATOR);
            for (FunctionImport function : staticImports)
            {
                FunctionType.Declaration declaration = function.declaration();
                String downcallSuffix = function.criticalCall() ? STR.", \{LINKER_OPTION_CLASSPATH}.isTrivial()" : "";
                withIndent(source, 2, STR."MTD_ADDRESS$\{declaration.fname()} = \{information.symbolTableName()}.find(\"\{declaration.fname()}\").orElseThrow();\{LINE_SEPARATOR}");
                withIndent(source, 2, STR."MTD$\{declaration.fname()} = \{information.linkerName()}.downcallHandle(MTD_ADDRESS$\{declaration.fname()}, \{functionDescriptor(declaration.innerType(), translation)}\{downcallSuffix});\{LINE_SEPARATOR}");
            }
        }
        withIndent(source, 1, STR."}\{LINE_SEPARATOR}");

        source.append(STR."}\{LINE_SEPARATOR}");
        return source.toString();
    }*/
}
