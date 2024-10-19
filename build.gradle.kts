plugins {
    kotlin("jvm") version "2.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven { url=uri( "https://maven.aliyun.com/repository/central") }
    maven { url=uri( "https://maven.aliyun.com/repository/public") }
    maven { url=uri( "https://maven.aliyun.com/repository/google") }
    maven { url=uri( "https://maven.aliyun.com/repository/gradle-plugin") }
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}