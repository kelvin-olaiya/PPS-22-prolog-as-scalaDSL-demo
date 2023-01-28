import wartremover.WartRemover

plugins {
    scala
    application
    alias(libs.plugins.spotless)
    alias(libs.plugins.kotlin.qa)
}

repositories { mavenCentral() }

dependencies {
    implementation(libs.scala)
    implementation(libs.bundles.scalafmt)
    testImplementation(libs.scalatest)
    scalaCompilerPlugins(libs.wartremover)
}

application {
    mainClass.set("io.github.chess.Main")
}

// Code Style (aesthetic...)
spotless {
    scala { scalafmt(libs.versions.scalafmt.version.get()).configFile(".scalafmt.conf") }
    // always apply formatting when building the project
    tasks.spotlessCheck.get().dependsOn(tasks.spotlessApply)
}

// Code Linting (error prevention...)
val wartRemoverCompileOptions = WartRemover.configFile(file(".wartremover.conf")).toCompilerOptions()

// Scala Compiler Options
tasks.withType(ScalaCompile::class.java) {
    scalaCompileOptions.additionalParameters = listOf("-Xtarget:8") + wartRemoverCompileOptions
}
