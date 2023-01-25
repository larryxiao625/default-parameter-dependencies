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
    implementation("org.example.larryxiao625:default-parameter-dependency:v0.0.2")
}

tasks.test {
    useJUnitPlatform()
}