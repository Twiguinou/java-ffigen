rootProject.name = "java-ffigen"

include("api")
include("clangc")
include("generator")

rootProject.children.forEach { it.name = "jpgen-${it.name}" }
