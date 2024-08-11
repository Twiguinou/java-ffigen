dependencies {
    implementation("org.apache.commons:commons-lang3:3.16.0")
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
