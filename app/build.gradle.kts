plugins {
    scala
    application
    alias(libs.plugins.spotless)
}

repositories { mavenCentral() }

dependencies {
    implementation(libs.scala)
    implementation(libs.bundles.scalafmt)
    testImplementation(libs.scalatest)
}

application {
    mainClass.set("io.github.chess.Main")
}

spotless {
    scala { scalafmt(libs.versions.scalafmt.version.get()).configFile(".scalafmt.conf") }
    tasks.spotlessCheck.get().dependsOn(tasks.spotlessApply)    // always apply formatting when building the project
}