plugins {
    id("com.vanniktech.maven.publish")
}

mavenPublishing {
    coordinates(group.toString(), name, version.toString())
    pom {
        name = project.name
        description = project.description
        url = JpgenBuildScriptConfiguration.PROJECT_URL
        developers {
            developer {
                name = "kenlek"
                email = "akushiru@kenlek.fr"
                url = "https://github.com/Twiguinou"
            }
        }

        licenses {
            license {
                name = "Apache-2.0"
                url = "https://www.apache.org/licenses/LICENSE-2.0.txt"
            }
        }

        scm {
            connection = "scm:git:git://github.com/Twiguinou/java-ffigen.git"
            developerConnection = "scm:git:ssh://github.com:Twiguinou/java-ffigen.git"
            url = "${JpgenBuildScriptConfiguration.PROJECT_URL}/tree/main"
        }
    }

    publishToMavenCentral()
    signAllPublications()
}
