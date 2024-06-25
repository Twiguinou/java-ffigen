dependencies {
    implementation(project(":generator"))
    implementation(project(":api"))
}

tasks.withType<JavaExec> {
    jvmArgs(listOf(
            "--enable-native-access=ALL-UNNAMED"
    ))
}
