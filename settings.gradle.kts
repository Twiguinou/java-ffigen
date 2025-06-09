pluginManagement {
    plugins {
        id("io.deepmedia.tools.deployer") version "0.17.0"
    }
}

include(":api", ":clangc", ":generator", ":gradle-plugin")
rootProject.children.forEach { it.name = "jpgen-${it.name}" }
