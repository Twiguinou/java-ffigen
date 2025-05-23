plugins {
    `java-library`
}

description = "Base generator and data model of jpgen"
version = "0.1.0"

JpgenBuildScriptConfiguration.configureLibraryProject(project)

dependencies {
    implementation(project(":jpgen-api"))
    implementation(project(":jpgen-clangc"))

    compileOnly("org.jspecify:jspecify:1.0.0")
}
