version = "0"

dependencies {
    implementation(project(":api"))

    compileOnly("org.jspecify:jspecify:1.0.0")
}

publishing.publications.named<MavenPublication>("mavenJava") {
    version = project.version.toString()
}
