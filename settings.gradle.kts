include(":api", ":clangc", ":generator")
rootProject.children.forEach { it.name = "jpgen-${it.name}" }
