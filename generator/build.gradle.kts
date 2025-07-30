plugins {
    `java-library`
}

description = "Base generator and data model of jpgen"
version = "0.1.2"

JpgenBuildScriptConfiguration.configureLibraryProject(project)

dependencies {
    implementation("$group:jpgen-api:0.1.2")
    implementation("$group:jpgen-clangc:0.1.2")

    compileOnly("org.jspecify:jspecify:1.0.0")
}
