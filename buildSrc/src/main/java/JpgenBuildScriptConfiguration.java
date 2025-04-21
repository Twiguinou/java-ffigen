import io.deepmedia.tools.deployer.DeployerExtension;
import io.deepmedia.tools.deployer.DeployerPlugin;
import io.deepmedia.tools.deployer.model.Component;
import org.gradle.api.Project;
import org.gradle.api.plugins.JavaLibraryPlugin;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.tasks.compile.JavaCompile;
import org.gradle.jvm.toolchain.JavaLanguageVersion;

public final class JpgenBuildScriptConfiguration
{private JpgenBuildScriptConfiguration() {}

    public static void configureLibraryProject(Project project)
    {
        project.getPluginManager().apply(JavaLibraryPlugin.class);
        project.getPluginManager().apply(DeployerPlugin.class);

        JavaPluginExtension java = project.getExtensions().getByType(JavaPluginExtension.class);
        java.getToolchain().getLanguageVersion().set(JavaLanguageVersion.of(24));
        java.withSourcesJar();
        java.withJavadocJar();

        project.getTasks().named("compileJava", JavaCompile.class).configure(task ->
            task.getOptions().getJavaModuleVersion().set((String) project.getVersion()));

        DeployerExtension deployer = project.getExtensions().getByType(DeployerExtension.class);
        deployer.projectInfo(info ->
        {
            info.getName().set(project.getName());
            info.getGroupId().set(project.getGroup().toString());
            info.getArtifactId().set(project.getName());
            info.getUrl().set("http://github.com/Twiguinou/java-ffigen");

            info.getDescription().set(project.getDescription());
            info.license(info.getApache2());
            info.developer("kenlek", "akushiru@kenlek.fr", null, null);
        });
        deployer.getRelease().getVersion().set(project.getVersion().toString());

        deployer.getContent().component(Component::fromJava);

        deployer.localSpec("local", spec -> spec.signing(signing ->
        {
            signing.getKey().set(signing.absent());
            signing.getPassword().set(signing.absent());
        }));

        deployer.centralPortalSpec("centralPortal", spec ->
        {
            spec.auth(auth ->
            {
                auth.getUser().set(auth.secret("CENTRAL_PORTAL_USER"));
                auth.getPassword().set(auth.secret("CENTRAL_PORTAL_PASSWORD"));
            });
            spec.signing(signing ->
            {
                signing.getKey().set(signing.secret("SIGNING_KEY"));
                signing.getPassword().set(signing.secret("SIGNING_PASSWORD"));
            });
            spec.getAllowMavenCentralSync().set(false);
        });
    }
}
