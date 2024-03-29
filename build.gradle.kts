plugins {
    id("java-library")
    id("maven-publish")
}

allprojects {
    group = "jpgen"
    version = "0"

    repositories {
        mavenCentral()
    }

    subprojects {
        apply(plugin = "java-library")
        apply(plugin = "maven-publish")

        java {
            sourceCompatibility = JavaVersion.VERSION_22
            targetCompatibility = JavaVersion.VERSION_22

            withSourcesJar()
        }

        tasks.withType<JavaCompile> {
            options.compilerArgs.addAll(listOf(
                    "--enable-preview"
            ))
        }
    }
}