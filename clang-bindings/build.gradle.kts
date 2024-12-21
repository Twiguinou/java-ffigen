version = "0"

dependencies {
    implementation(project(":api"))
}

publishing.publications.named<MavenPublication>("mavenJava") {
    version = project.version.toString()
}
