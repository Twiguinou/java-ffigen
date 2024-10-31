import org.apache.tools.ant.taskdefs.condition.Os
import java.lang.IllegalStateException

dependencies {
    implementation(project(":generator"))
    implementation(project(":api"))
}

tasks.withType<JavaExec> {
    jvmArgs(listOf(
            "--enable-native-access=ALL-UNNAMED"
    ))

    // This one prevents a JVM crash on POSIX platforms.
    val javaHome = System.getProperty("java.home")
        ?: throw IllegalStateException("JAVA_HOME environment variable is not set.")

    if (Os.isFamily(Os.FAMILY_MAC)) {
        environment("LD_PRELOAD", "$javaHome/lib/libjsig.dylib")
    }
    else if (Os.isFamily(Os.FAMILY_UNIX)) {
        environment("LD_PRELOAD", "$javaHome/lib/libjsig.so")
    }
}
