val log4jVersion by extra("3.0.0-beta1")
dependencies {
    implementation(project(":api"))

    // log4j2 dependencies
    implementation("org.apache.logging.log4j:log4j-api:$log4jVersion")
    testImplementation("org.apache.logging.log4j:log4j-core:$log4jVersion")

    // velocity
    implementation("org.apache.velocity:velocity-engine-core:2.3")

    // source-scope annotations
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
}

tasks.test {
    jvmArgs(listOf(
            "--enable-preview",
            "--enable-native-access=ALL-UNNAMED"
    ))
}

tasks.withType<JavaExec> {
    jvmArgs(listOf(
            "--enable-preview",
            "--enable-native-access=ALL-UNNAMED",
            "-ea"
    ))
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            groupId = "jpgen"
            artifactId = "generator"
            version = "0"
        }
    }

    repositories {
        mavenLocal()
    }
}
