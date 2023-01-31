plugins {
    kotlin("js")
}

kotlin {
    js(BOTH)
}

dependencies {
    implementation(project(":lib-both"))
}