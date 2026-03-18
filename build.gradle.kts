plugins {
    java
    id("com.gradleup.shadow") version "9.0.0-beta12"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.formdev:flatlaf:3.5.4")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

sourceSets {
    main {
        java {
            setSrcDirs(listOf("."))
            exclude("build/**", ".gradle/**", ".git/**", "docs/**")
        }
        resources {
            setSrcDirs(listOf("."))
            include(
                "images/**",
                "help/**",
                "mars/**/*.properties",
                "mars/**/*.txt",
                "mars/**/*.xml",
                "mars/**/*.png",
                "mars/**/*.jpg",
                "mars/**/*.gif",
                "mars/**/*.html",
                "Config.properties",
                "Settings.properties",
                "Syscall.properties",
                "PseudoOps.txt",
                "MARSlicense.txt",
                "MipsXRayOpcode.xml",
                "registerDatapath.xml",
                "controlDatapath.xml",
                "ALUcontrolDatapath.xml",
            )
            exclude("build/**", ".gradle/**", ".git/**")
        }
    }
}

tasks.compileJava {
    options.encoding = "ISO-8859-1"
    options.release.set(11)
}

tasks.shadowJar {
    archiveBaseName.set("mars-dark")
    archiveClassifier.set("")
    archiveVersion.set("")

    manifest {
        attributes("Main-Class" to "MarsLauncher")
    }

    mergeServiceFiles()

    // Exclude source files and unnecessary files from the JAR
    exclude("**/*.java")
    exclude("**/*.bat")
    exclude("docs/**")
    exclude("mainclass.txt")
}
