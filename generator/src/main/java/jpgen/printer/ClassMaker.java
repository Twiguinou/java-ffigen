package jpgen.printer;

import jpgen.data2.EnumType;
import jpgen.data2.RecordType;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.app.event.implement.IncludeRelativePath;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ClassMaker
{
    private static final String ENUM_STYLE_PATH = "templates/enum-style.vm";
    private static final String RECORD_STYLE_PATH = "templates/record-style.vm";

    private final Template m_enumTemplate;
    private final Template m_recordTemplate;

    public ClassMaker()
    {
        Properties veProperties = new Properties();

        veProperties.setProperty("resource.loader.cp.class", ClasspathResourceLoader.class.getName());
        veProperties.setProperty("resource.loader.cp.cache", "true");
        veProperties.setProperty(RuntimeConstants.RESOURCE_LOADERS, "cp");

        veProperties.setProperty(RuntimeConstants.EVENTHANDLER_INCLUDE, IncludeRelativePath.class.getName());

        VelocityEngine veEngine = new VelocityEngine(veProperties);
        veEngine.init();

        this.m_enumTemplate = veEngine.getTemplate(ENUM_STYLE_PATH);
        this.m_recordTemplate = veEngine.getTemplate(RECORD_STYLE_PATH);
    }

    public void writeEnum(Writer writer, String declarationPackage, EnumType.Decl declaration)
    {
        VelocityContext veContext = new VelocityContext();
        veContext.put("declaration_package", declarationPackage);
        veContext.put("declaration_name", declaration.name());

        veContext.put("integer_type", declaration.integralType.javaType());
        veContext.put("constants", declaration.constants);

        this.m_enumTemplate.merge(veContext, writer);
    }

    public void writeRecord(Writer writer, String declarationPackage, RecordType.Decl declaration)
    {
        VelocityContext veContext = new VelocityContext();
        veContext.put("declaration_package", declarationPackage);
        veContext.put("declaration_name", declaration.name());

        veContext.put("pointer_name", "foreignPtr");
        veContext.put("layout_name", "gStructLayout");
        veContext.put("is_union", declaration.kind == RecordType.Kind.UNION);

        List<RecordMember> members = new ArrayList<>();
        for (RecordType.Member member : declaration.members)
        {
            if (member instanceof RecordType.Padding padding)
            {
                members.add(RecordMember.ofPadding(padding.size()));
            }
            else if (member instanceof RecordType.Field field)
            {
            }
            else
            {
                throw new UnsupportedOperationException("Bitfields are not supported.");
            }
        }

        veContext.put("members", members);

        this.m_recordTemplate.merge(veContext, writer);
    }
}
