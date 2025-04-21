plugins {
    `java-gradle-plugin`
}

java.toolchain.languageVersion = JavaLanguageVersion.of(24)

gradlePlugin {
    website = "http://github.com/Twiguinou/java-ffigen"
    vcsUrl = "http://github.com/Twiguinou/java-ffigen.git"
    plugins.create("jpgen-plugin") {
        id = "$group.plugin"
        displayName = "jpgen Gradle plugin"
        description = ""
        implementationClass = "fr.kenlek.jpgen.plugin.JpgenPlugin"
    }
}

dependencies {
    implementation(project(":jpgen-generator"))
}
