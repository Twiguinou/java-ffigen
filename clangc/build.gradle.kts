description = "clang-c bindings for jpgen"
version = "0.0.4"

dependencies {
    implementation(project(":jpgen-api"))
    compileOnly("org.jspecify:jspecify:1.0.0")
}

deployer {
    release.version = project.version.toString()
    projectInfo.description = project.description
}
