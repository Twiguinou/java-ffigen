plugins {
    `java-library`
}

description = "clang-c bindings for jpgen"
version = "0.0.4"

JpgenBuildScriptConfiguration.configureLibraryProject(project)

dependencies {
    implementation(project(":jpgen-api"))

    compileOnly("org.jspecify:jspecify:1.0.0")
}
