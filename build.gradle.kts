plugins {
    `java-library`
    id("io.deepmedia.tools.deployer") version "0.17.0"
}

subprojects {
    apply(plugin = "java-library")
    apply(plugin = "io.deepmedia.tools.deployer")

    java {
        toolchain.languageVersion = JavaLanguageVersion.of(23)

        withSourcesJar()
        withJavadocJar()
    }

    group = "fr.kenlek.jpgen"

    repositories {
        mavenCentral()
    }

    deployer {
        projectInfo {
            name = project.name
            groupId = project.group.toString()
            artifactId = project.name

            developer("kenlek", "akushiru@kenlek.fr")

            license {
                name = "The Apache License, Version 2.0"
                url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
            }

            url = "http://github.com/Twiguinou/java-ffigen"
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
