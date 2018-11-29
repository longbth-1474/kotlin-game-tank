import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


allprojects {
    repositories {
        maven {
            setUrl("https://jitpack.io")
        }
    }
}

plugins {
    kotlin("jvm") version "1.3.10"
}

group = "www.xuke.tank"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        setUrl("https://jitpack.io")
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("com.github.shaunxiao:kotlinGameEngine:v0.1.0")}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}