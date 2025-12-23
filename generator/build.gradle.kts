import JpgenBuildScriptConfiguration.configureDeployment

plugins {
    `java-library`
}

description = "Base generator and data model of jpgen"

configureDeployment(project)

dependencies {
    implementation("$group:jpgen-api:$version")
    implementation("$group:jpgen-clangc:$version")

    implementation("com.palantir.javapoet:javapoet:0.7.0")
}

tasks.compileJava.configure {
    options.compilerArgs.add("-Xlint:-requires-automatic")
}

tasks.withType<JavaExec>().configureEach {
    jvmArgs(
        "--enable-native-access=ALL-UNNAMED"
    )
}
