version = "0"

dependencies {
    implementation(project(":api"))
    implementation(project(":clang-bindings"))

    compileOnly("org.jspecify:jspecify:1.0.0")
}

tasks.withType<JavaExec> {
    jvmArgs(
        "--enable-native-access=ALL-UNNAMED"
    )
}

publishing.publications.named<MavenPublication>("mavenJava") {
    version = project.version.toString()
}
