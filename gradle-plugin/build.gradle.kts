plugins {
    `java-gradle-plugin`
    id("com.gradle.plugin-publish") version "1.3.1"
}

version = "0.0.1"

java {
    sourceCompatibility = JavaVersion.VERSION_24
    targetCompatibility = JavaVersion.VERSION_24
}

gradlePlugin.plugins.create("jpgen") {
    id = "fr.kenlek.jpgen.plugin"
    implementationClass = "fr.kenlek.jpgen.plugin.JpgenPlugin"
}

dependencies {
    implementation("$group:jpgen-api:0.1.3")
    implementation("$group:jpgen-clangc:0.1.3")
    implementation("$group:jpgen-generator:0.1.3")
}

publishing.repositories {
    mavenLocal()
}
