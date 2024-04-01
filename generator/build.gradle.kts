val log4jVersion by extra("2.23.1")
dependencies {
    implementation(project(":api"))

    // log4j2 dependencies
    implementation("org.apache.logging.log4j:log4j-api:$log4jVersion")
    implementation("org.apache.logging.log4j:log4j-core:$log4jVersion")

    // velocity
    implementation("org.apache.velocity:velocity-engine-core:2.3")
    runtimeOnly("org.apache.logging.log4j:log4j-slf4j-impl:$log4jVersion")


    // source-scope annotations
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
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