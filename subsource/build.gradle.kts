plugins {
    id("java")
    kotlin("jvm") version "1.7.21"
}

dependencies {
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}