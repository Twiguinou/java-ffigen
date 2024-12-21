version = "0"

publishing.publications.named<MavenPublication>("mavenJava") {
    version = project.version.toString()
}
