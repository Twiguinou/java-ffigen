plugins {
    `java-library`
}

description = "clang-c bindings for jpgen"
version = "0.2.0"

JpgenBuildScriptConfiguration.configureLibraryProject(project)

dependencies {
    implementation("$group:jpgen-api:0.2.0")
}

tasks.withType<JavaExec>().configureEach {
    jvmArgs(
        "--enable-native-access=ALL-UNNAMED"
    )

    environment("LIBCLANG_DISABLE_CRASH_RECOVERY" to 1)
}
