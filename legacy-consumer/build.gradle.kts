plugins {
    kotlin("js")
}

kotlin {
    js(LEGACY)
}

dependencies {
    implementation(project(":lib-both"))
}