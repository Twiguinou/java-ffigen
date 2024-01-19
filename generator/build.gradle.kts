val log4jVersion by extra("2.22.1")
dependencies {
    implementation(project(":api"))

    implementation("org.apache.logging.log4j:log4j-api:$log4jVersion")
    implementation("org.apache.logging.log4j:log4j-core:$log4jVersion")

    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
}