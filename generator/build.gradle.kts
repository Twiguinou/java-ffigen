plugins {
    `java-library`
}

description = "Base generator and data model of jpgen"
version = "0.2.0"

JpgenBuildScriptConfiguration.configureLibraryProject(project)

dependencies {
    implementation("$group:jpgen-api:0.2.0")
    implementation("$group:jpgen-clangc:0.2.0")

    implementation("com.palantir.javapoet:javapoet:0.7.0")

    compileOnly("org.jspecify:jspecify:1.0.0")
}
