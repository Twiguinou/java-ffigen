dependencies {
    implementation(project(":api"))

    compileOnly("org.jspecify:jspecify:1.0.0")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            groupId = "fr.kenlek.jpgen"
            artifactId = "generator"
            version = "0"
        }
    }

    repositories {
        mavenLocal()
    }
}
