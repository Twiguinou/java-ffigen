import JpgenBuildScriptConfiguration.configureDeployment

plugins {
    `java-library`
}

description = "clang-c bindings for jpgen"
version = "0.2.0"

configureDeployment(project)

dependencies {
    implementation("$group:jpgen-api:$version")
}

tasks.withType<JavaExec>().configureEach {
    jvmArgs(
        "--enable-native-access=ALL-UNNAMED"
    )

    environment("LIBCLANG_DISABLE_CRASH_RECOVERY" to 1)
}
