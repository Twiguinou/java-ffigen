description = "Helper library for use of jpgen generated sources"
version = "0.0.4"

JpgenBuildScriptConfiguration.configureLibraryProject(project)

tasks.withType<JavaExec>().configureEach {
    jvmArgs(
        "--enable-native-access=ALL-UNNAMED"
    )
}
