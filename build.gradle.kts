plugins {
    id("java-library")
    id("maven-publish")
}

allprojects {
    group = "fr.kenlek.jpgen"
    version = "0"

    repositories {
        mavenCentral()
    }

    subprojects {
        apply(plugin = "java-library")
        apply(plugin = "maven-publish")

        java {
            sourceCompatibility = JavaVersion.VERSION_23
            targetCompatibility = JavaVersion.VERSION_23

            withSourcesJar()
        }
    }
}
