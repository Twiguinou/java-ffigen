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
    implementation(project(":jpgen-generator"))
}

publishing.repositories {
    mavenLocal()
}
