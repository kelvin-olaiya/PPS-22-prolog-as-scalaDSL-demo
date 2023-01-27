plugins {
    scala
    application
}

repositories { mavenCentral() }

dependencies {
    implementation(libs.scala)
    testImplementation(libs.scalatest)
}

application {
    mainClass.set("io.github.chess.Main")
}
