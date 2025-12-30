import JpgenBuildScriptConfiguration.configureDeployment

plugins {
    `java-library`
}

description = "clang-c bindings for jpgen"

configureDeployment(project)

dependencies {
    implementation("$group:jpgen-api:$version")
}

tasks.withType<JavaExec>().configureEach {
    environment("LIBCLANG_DISABLE_CRASH_RECOVERY" to 1)
}
