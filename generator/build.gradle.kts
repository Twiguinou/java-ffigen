description = "Base generator and data model of jpgen"
version = "0.0.2"

dependencies {
    implementation(project(":jpgen-api"))
    implementation(project(":jpgen-clangc"))

    compileOnly("org.jspecify:jspecify:1.0.0")
}

tasks.withType<JavaExec> {
    jvmArgs(
        "--enable-native-access=ALL-UNNAMED"
    )
}

deployer.projectInfo {
    description = project.description
    version = project.version
}
