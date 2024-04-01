package jpgen.codegen;

import jpgen.data.EnumType;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.app.event.implement.IncludeRelativePath;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.Writer;
import java.util.Properties;

public class TemplateTransformer
{
    private final Template m_enumDeclTemplate;

    public TemplateTransformer()
    {
        Properties veProperties = new Properties();

        veProperties.setProperty("cp.resource.loader.class", ClasspathResourceLoader.class.getName());
        veProperties.setProperty("cp.resource.loader.cache", "true");
        veProperties.setProperty(RuntimeConstants.RESOURCE_LOADER, "cp");

        veProperties.setProperty(RuntimeConstants.EVENTHANDLER_INCLUDE, IncludeRelativePath.class.getName());

        VelocityEngine veEngine = new VelocityEngine(veProperties);
        veEngine.init();

        this.m_enumDeclTemplate = veEngine.getTemplate("templates/cenum_decl.vm");
    }

    public void writeEnum(String javaPackage, EnumType enumType, Writer writer)
    {
        VelocityContext veContext = new VelocityContext();
        veContext.put("DECL_PKG", javaPackage);
        veContext.put("DECL_NAME", enumType.name());
        veContext.put("INTEGER_TYPE", enumType.integerType().name());

        veContext.put("CONSTANTS", enumType.constants());

        this.m_enumDeclTemplate.merge(veContext, writer);
    }
}
