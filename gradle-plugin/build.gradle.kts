plugins {
    `java-gradle-plugin`
    id("com.gradle.plugin-publish") version "1.3.1"
}

version = "0.0.1"

java.toolchain.languageVersion.set(JavaLanguageVersion.of(24))

gradlePlugin.plugins.create("jpgen") {
    id = "$group.plugin"
    implementationClass = "fr.kenlek.jpgen.plugin.JpgenPlugin"
}

dependencies {
    implementation("$group:jpgen-api:0.1.2")
    implementation("$group:jpgen-clangc:0.1.2")
    implementation("$group:jpgen-generator:0.1.2")
}

publishing.repositories {
    mavenLocal()
}
