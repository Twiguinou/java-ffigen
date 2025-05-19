plugins {
    id("me.champeau.jmh") version "0.7.3"
}

description = "Helper library for use of jpgen generated sources"
version = "0.1.0"

JpgenBuildScriptConfiguration.configureLibraryProject(project)

tasks.withType<JavaExec>().configureEach {
    jvmArgs(
        "--enable-native-access=ALL-UNNAMED"
    )
}

jmh {
    fork = 1
    jvmArgsAppend = listOf(
        "--enable-native-access=ALL-UNNAMED"
    )
}
