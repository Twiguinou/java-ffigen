plugins {
    `java-library`
    jpgen.`publish-convention` apply false
}

subprojects {
    group = "fr.kenlek.jpgen"

    apply(plugin = "java-library")

    java {
        sourceCompatibility = JavaVersion.VERSION_26
        targetCompatibility = JavaVersion.VERSION_26

        withSourcesJar()
    }

    repositories {
        mavenCentral()
        mavenLocal()
    }

    tasks.compileJava {
        options.compilerArgs.addAll(listOf("-Xlint:all", "-Werror"))
    }

    tasks.withType<JavaExec>().configureEach {
        jvmArgs("--enable-native-access=ALL-UNNAMED")
    }
}
