dependencies {
    implementation(project(":generator"))
    implementation(project(":api"))

    implementation("org.apache.logging.log4j:log4j-core:3.0.0-beta1")
}

tasks.withType<JavaExec> {
    jvmArgs(listOf(
            "--enable-native-access=ALL-UNNAMED"
    ))
}
