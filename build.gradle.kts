plugins {
    id("java-library")
    id("maven-publish")
}

subprojects {
    apply(plugin = "java-library")
    apply(plugin = "maven-publish")

    java {
        sourceCompatibility = JavaVersion.VERSION_23
        targetCompatibility = JavaVersion.VERSION_23

        withSourcesJar()
    }

    group = "fr.kenlek.jpgen"

    repositories {
        mavenCentral()
    }

    publishing {
        publications.create<MavenPublication>("mavenJava") {
            from(components["java"])
            groupId = "fr.kenlek.jpgen"
            artifactId = project.name
        }

        repositories {
            mavenLocal()
        }
    }
}
