plugins {
    `java-library`
}

subprojects {
    apply(plugin = "java-library")

    group = "fr.kenlek.jpgen"
    version = "0.2.0"

    java {
        sourceCompatibility = JavaVersion.VERSION_25
        targetCompatibility = JavaVersion.VERSION_25

        withSourcesJar()
        withJavadocJar()
    }

    repositories {
        mavenCentral()
        mavenLocal()
    }

    tasks.compileJava.configure {
        options.javaModuleVersion.set(project.version.toString())
        options.compilerArgs.addAll(listOf(
            "-Xlint:all,-restricted,-serial",
            "-Werror"
        ))
    }

    tasks.withType<JavaExec>().configureEach {
        jvmArgs(
            "--enable-native-access=ALL-UNNAMED"
        )
    }
}
