/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Scala application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.6/userguide/building_java_projects.html
 */

plugins {
    scala
    application
}

repositories { mavenCentral() }

dependencies {
    implementation("org.scala-lang:scala3-library_3:3.2.1")
}

application {
    mainClass.set("io.github.chess.Main")
}
