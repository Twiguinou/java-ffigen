dependencies {
    implementation(project(":generator"))
    testImplementation(project(":api"))
}

tasks.withType<JavaExec> {
    jvmArgs(listOf(
            "--enable-preview",
            "--enable-native-access=ALL-UNNAMED",
            "-ea"
    ))
}