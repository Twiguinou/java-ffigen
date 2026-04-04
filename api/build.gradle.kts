import org.openjdk.jmh.profile.GCProfiler
import kotlin.reflect.jvm.jvmName

plugins {
    alias(libs.plugins.jmh)
}

description = "Helper library for use of jpgen generated sources"
version = "0.2.3"

apply(plugin = "jpgen.publish-convention")

jmh {
    fork = 1
    jvmArgsAppend = listOf("--enable-native-access=ALL-UNNAMED")
    profilers.add(GCProfiler::class.jvmName)
}

tasks.compileJava {
    options.javaModuleVersion = project.version.toString()
    options.compilerArgs.add("-Xlint:-restricted")
}
