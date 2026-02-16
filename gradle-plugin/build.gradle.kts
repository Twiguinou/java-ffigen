plugins {
    `java-gradle-plugin`
}

description = "A Gradle plugin to facilitate the generation of bindings to native libraries"
version = "0.0.1"

apply(plugin = "jpgen.publish-convention")

gradlePlugin {
    website = JpgenBuildScriptConfiguration.PROJECT_URL
    vcsUrl = JpgenBuildScriptConfiguration.VCS_URL

    plugins.create("jpgen") {
        id = "$group.plugin"
        implementationClass = "fr.kenlek.jpgen.plugin.JpgenPlugin"
        displayName = "Jpgen Gradle Plugin"
        description = project.description
        tags = listOf("jpgen", "java")
    }
}

dependencies {
    api(project(":jpgen-generator"))
    implementation(project(":jpgen-api"))
    implementation(project(":jpgen-clangc"))

    api(libs.javapoet)
}

tasks.compileJava {
    options.compilerArgs.add("-Xlint:-restricted,-this-escape")
}
