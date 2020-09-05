import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        gradlePluginPortal()
    }

    dependencies {
        classpath("me.champeau.gradle:jmh-gradle-plugin:0.5.1")
    }
}

plugins {
	kotlin("jvm") version "1.4.0"
    id("me.champeau.gradle.jmh") version "0.5.1"
}

repositories {
    mavenCentral()
}

dependencies {
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.6"
}

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.6"
}