plugins {
    id("java-library")
}

allprojects {
    group = ""
    version = "0"

    repositories {
        mavenCentral()
    }

    subprojects {
        apply(plugin = "java-library")

        java {
            sourceCompatibility = JavaVersion.VERSION_21
            targetCompatibility = JavaVersion.VERSION_21
        }

        tasks.withType<JavaCompile> {
            options.compilerArgs.addAll(listOf(
                    "--enable-preview"
            ))
        }
    }
}