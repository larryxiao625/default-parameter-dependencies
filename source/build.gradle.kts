plugins {
    kotlin("jvm") version "1.7.21"
    id("java")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(files("libs/default-parameter-dependency-v0.0.7.jar"))
}

tasks.test {
    useJUnitPlatform()
}