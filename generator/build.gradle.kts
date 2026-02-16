description = "Base generator and data model of jpgen"
version = "0.2.1"

apply(plugin = "jpgen.publish-convention")

dependencies {
    api(project(":jpgen-clangc"))
    api(libs.javapoet)
}

tasks.compileJava {
    options.javaModuleVersion = project.version.toString()
    options.compilerArgs.add("-Xlint:-serial,-requires-automatic")
}

tasks.withType<JavaExec>().configureEach {
    environment("LIBCLANG_DISABLE_CRASH_RECOVERY" to 1)
}
