plugins {
    kotlin("js")
}

kotlin {
    js(IR)
}

dependencies {
    implementation(project(":lib-both"))
}