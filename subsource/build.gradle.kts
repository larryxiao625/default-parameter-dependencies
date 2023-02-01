plugins {
    id("java")
    kotlin("jvm") version "1.7.21"
}

dependencies {
    implementation(files(rootProject.file("libs/default-parameter-dependency-v0.0.8.jar")))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}