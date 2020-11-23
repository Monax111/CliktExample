plugins {
    kotlin("jvm") version "1.3.72"

    id("com.bmuschko.docker-java-application") version "6.6.1"

    id("com.dorongold.task-tree") version "1.5"

}

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    implementation(group = "org.jetbrains.kotlin", name = "kotlin-reflect", version = "1.3.72")
    implementation(group = "com.github.ajalt", name = "clikt", version = "2.8.0")

}

tasks.test {
    useJUnitPlatform()
}

docker{
    javaApplication{
        baseImage.set("openjdk:8-alpine")
        images.set(setOf("demo-helper:local"))
    }
}
