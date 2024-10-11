dependencies {
    compileOnly("org.jspecify:jspecify:1.0.0")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            groupId = "fr.kenlek.jpgen"
            artifactId = "api"
            version = "0"
        }
    }

    repositories {
        mavenLocal()
    }
}
