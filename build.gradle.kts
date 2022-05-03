plugins {
    java
    kotlin("jvm") version "1.6.10"
}

group = "com.github.raink1208"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("net.dv8tion:JDA:5.0.0-alpha.11")
    implementation("org.junit.jupiter:junit-jupiter:5.8.2")
}