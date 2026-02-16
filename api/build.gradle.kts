plugins {
    alias(libs.plugins.jmh)
}

description = "Helper library for use of jpgen generated sources"
version = "0.2.1"

apply(plugin = "jpgen.publish-convention")

jmh {
    fork = 1
    jvmArgsAppend = listOf("--enable-native-access=ALL-UNNAMED")
}

tasks.compileJava {
    options.javaModuleVersion = project.version.toString()
    options.compilerArgs.add("-Xlint:-serial,-restricted")
}
