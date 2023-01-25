plugins {
    kotlin("jvm") version "1.7.21"
    id("java")
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://maven.pkg.github.com/larryxiao625/default-parameter-dependencies")
        credentials {
            username = "larryxiao625"
            password = "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"
        }
    }
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.example.larryxiao625:default-parameter-dependency:v0.0.1")
}

tasks.test {
    useJUnitPlatform()
}