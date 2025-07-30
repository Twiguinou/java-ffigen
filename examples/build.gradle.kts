import fr.kenlek.jpgen.generator.ElementFilter
import fr.kenlek.jpgen.generator.PathProvider
import fr.kenlek.jpgen.generator.data.Declaration
import fr.kenlek.jpgen.generator.data.HeaderDeclaration
import fr.kenlek.jpgen.generator.data.JavaPath
import fr.kenlek.jpgen.plugin.CompileNatives
import fr.kenlek.jpgen.plugin.ConfigureNatives
import fr.kenlek.jpgen.plugin.GenerateBindings
import fr.kenlek.jpgen.plugin.codegen.WriteInfo
import org.gradle.internal.os.OperatingSystem

plugins {
    java
    id("fr.kenlek.jpgen.plugin") version "0.0.1"
}

description = "Snippets on how to use the jpgen Gradle plugin and generator"
version = "1.0.0"

val bindingsArchiveName = "jpgen-test-natives.jar"
val bindingsDirectory = layout.buildDirectory.dir("bindings")
val bindingsSourceDirectory = bindingsDirectory.map { it.dir("src") }
val bindingsCompiledDirectory = bindingsDirectory.map { it.dir("classes") }

val commonsConfig = configurations.create("bindings")
configurations["implementation"].extendsFrom(commonsConfig)

dependencies {
    commonsConfig("fr.kenlek.jpgen:jpgen-api:0.1.2")

    implementation(files(bindingsDirectory.map { it.file(bindingsArchiveName) }))
}

tasks.register<ConfigureNatives>("configureNativeLibraries") {
    group = "jpgen"
}

val compileNativesTask = tasks.register<CompileNatives>("compileNativeLibraries") {
    group = "jpgen"
    dependsOn("configureNativeLibraries")
}

tasks.register<GenerateBindings>("generateBindings") {
    group = "jpgen"

    val testPackage = JavaPath.of("test")
    val testHeader = project.file("src/natives/test.h").toPath()
    outputDirectory = bindingsSourceDirectory

    parseOptions {
        pathProvider = PathProvider.ModuleTree(testHeader, testPackage)
        elementFilter = ElementFilter.ofConfined(testHeader)
        addHeader(testHeader)
    }

    resultsTransformer.set { results ->
        val declarations = arrayListOf<Declaration.Writable>()
        declarations += HeaderDeclaration(testPackage.child("Test"), listOf(), results.gatherBindings(testPackage))

        WriteInfo(JavaPath.EMPTY, declarations)
    }
}

tasks.register<JavaCompile>("compileBindings") {
    group = "jpgen"
    dependsOn("generateBindings")

    source(bindingsSourceDirectory)
    classpath = commonsConfig

    destinationDirectory = bindingsCompiledDirectory
}

tasks.register<Jar>("packBindings") {
    group = "jpgen"
    dependsOn("compileBindings")

    archiveFileName = bindingsArchiveName
    destinationDirectory = bindingsDirectory

    from(bindingsCompiledDirectory) {
        include("**/*.class")
    }
}

tasks.compileJava.configure {
    dependsOn("packBindings")
}

tasks.withType<JavaExec>().configureEach {
    dependsOn(compileNativesTask)

    val os = OperatingSystem.current()
    val libraryPrefix = if (os.isUnix) "lib" else ""
    systemProperty("test.path", compileNativesTask.map { "${it.buildDirectory.get()}/${libraryPrefix}test_lib${os.sharedLibrarySuffix}" }.get())

    jvmArgs(
        "--enable-native-access=ALL-UNNAMED",
        "--sun-misc-unsafe-memory-access=deny"
    )
}
