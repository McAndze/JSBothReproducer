pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "JSBothReproducer"

include("lib-both")
include("ir-consumer")
include("legacy-consumer")
include("both-consumer")