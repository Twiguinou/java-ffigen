val log4jVersion by extra("3.0.0-beta1")
val slf4jVersion = "2.0.13"
dependencies {
    implementation(project(":api"))

    // log4j2 dependencies
    implementation("org.apache.logging.log4j:log4j-api:$log4jVersion")

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
