publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            groupId = "jpgen"
            artifactId = "api"
            version = "0"
        }
    }

    repositories {
        mavenLocal()
    }
}