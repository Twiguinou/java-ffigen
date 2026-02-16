include(":api", ":clangc", ":generator", ":gradle-plugin")
rootProject.children.forEach { it.name = "jpgen-${it.name}" }
