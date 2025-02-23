description = "clang-c bindings for jpgen"
version = "0.0.3"

dependencies {
    implementation(project(":jpgen-api"))

    compileOnly("org.jspecify:jspecify:1.0.0")
}

deployer.projectInfo {
    description = project.description
    version = project.version
}
