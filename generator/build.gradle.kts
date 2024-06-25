dependencies {
    implementation(project(":api"))

    // source-scope annotations
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            groupId = "jpgen"
            artifactId = "generator"
            version = "0"
        }
    }

    repositories {
        mavenLocal()
    }
}
