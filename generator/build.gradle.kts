val log4jVersion by extra("2.21.1")
dependencies {
    implementation(project(":api"))
    implementation("org.apache.logging.log4j:log4j-api:$log4jVersion")
    implementation("org.apache.logging.log4j:log4j-core:$log4jVersion")

    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
}

tasks.withType<JavaExec> {
    jvmArgs(listOf(
        "--enable-preview",
        "--enable-native-access=ALL-UNNAMED"
    ))
}