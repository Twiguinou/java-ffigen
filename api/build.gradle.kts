import JpgenBuildScriptConfiguration.configureDeployment

plugins {
    id("me.champeau.jmh") version "0.7.3"
}

description = "Helper library for use of jpgen generated sources"

configureDeployment(project)

jmh {
    fork = 1
    jvmArgsAppend = listOf(
        "--enable-native-access=ALL-UNNAMED"
    )
}
