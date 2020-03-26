import com.jfrog.bintray.gradle.BintrayExtension

plugins {
    kotlin("js") version "1.3.71"
    `maven-publish`
    id("com.jfrog.bintray") version "1.8.1"
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    testImplementation(kotlin("test-js"))
}

group = "ch.delconte.screeps-kotlin"
version = "1.7.0"

kotlin {
    target {
        useCommonJs()
        nodejs()
    }
}


val kotlinSourcesJar by tasks

publishing {
    publications {
        register("kotlin", MavenPublication::class) {
            from(components["kotlin"])
            artifact(kotlinSourcesJar)
        }
    }
}

val bintrayUser: String? by project
val bintrayApiKey: String? by project

bintray {
    user = bintrayUser ?: ""
    key = bintrayApiKey ?: ""
    publish = true
    setPublications("kotlin")
    pkg(delegateClosureOf<BintrayExtension.PackageConfig> {
        repo = "screeps-kotlin"
        name = "screeps-kotlin-types"
        websiteUrl = "https://github.com/exaV/screeps-kotlin-types"
        githubRepo = "exaV/screeps-kotlin-types"
        vcsUrl = "https://github.com/exaV/screeps-kotlin-types"
        setLabels("kotlin")
        setLicenses("MIT")
    })
}
