description = "clang-c bindings for jpgen"
version = "0.2.2"

apply(plugin = "jpgen.publish-convention")

dependencies {
    api(project(":jpgen-api"))
}

tasks.compileJava {
    options.javaModuleVersion = project.version.toString()
    options.compilerArgs.addAll(listOf("-Xlint:-restricted"))
}

tasks.withType<JavaExec>().configureEach {
    environment("LIBCLANG_DISABLE_CRASH_RECOVERY" to 1)
}
