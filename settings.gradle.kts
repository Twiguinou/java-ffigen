pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
    }

    plugins {
        id("io.deepmedia.tools.deployer") version "0.18.0"
    }
}

include(":api", ":clangc", ":generator", ":gradle-plugin", ":examples")
rootProject.children.forEach { it.name = "jpgen-${it.name}" }
