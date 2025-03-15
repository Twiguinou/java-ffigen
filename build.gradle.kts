plugins {
    `java-library`
    id("io.deepmedia.tools.deployer") version "0.17.0"
}

subprojects {
    apply(plugin = "java-library")
    apply(plugin = "io.deepmedia.tools.deployer")

    group = "fr.kenlek.jpgen"

    java {
        toolchain.languageVersion = JavaLanguageVersion.of(23)

        withSourcesJar()
        withJavadocJar()
    }

    repositories {
        mavenCentral()
    }

    tasks.compileJava {
        options.javaModuleVersion = provider { version as String }
    }

    deployer {
        projectInfo {
            name = project.name
            groupId = project.group.toString()
            artifactId = project.name
            url = "http://github.com/Twiguinou/java-ffigen"

            license(apache2)
            developer("kenlek", "akushiru@kenlek.fr")
            scm.fromGithub("Twiguinou", "java-ffigen")
        }

        content.component {
            fromJava()
        }

        localSpec {
            signing {
                key = absent()
                password = absent()
            }
        }

        centralPortalSpec {
            auth {
                user = secret("CENTRAL_PORTAL_USER")
                password = secret("CENTRAL_PORTAL_PASSWORD")
            }

            signing {
                key = secret("SIGNING_KEY")
                password = secret("SIGNING_PASSWORD")
            }

            allowMavenCentralSync = false
        }
    }
}
