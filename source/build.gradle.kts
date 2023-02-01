plugins {
    kotlin("jvm") version "1.7.21"
    id("java")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(project(":subsource"))
    implementation(files(rootProject.file("libs/default-parameter-dependency-v0.0.10.jar")))
}

tasks.test {
    useJUnitPlatform()
}