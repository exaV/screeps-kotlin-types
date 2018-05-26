import com.jfrog.bintray.gradle.BintrayExtension
import com.jfrog.bintray.gradle.BintrayUploadTask
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile


plugins {
    id("kotlin2js") version "1.2.41"
    `maven-publish`
    id("com.jfrog.bintray") version "1.8.0"
}
repositories {
    jcenter()
}


dependencies {
    implementation(kotlin("stdlib-js"))
}

group = "ch.delconte.screeps-kotlin"
version = "0.9.1"

val sourcesJar by tasks.creating(Jar::class) {
    classifier = "sources"
    from(java.sourceSets["main"].allSource)
}

tasks {

    "compileKotlin2Js"(Kotlin2JsCompile::class) {
        kotlinOptions {
            sourceMap = true
            moduleKind = "umd"
        }
    }
}

publishing {
    (publications) {
        "mavenJava"(MavenPublication::class) {
            from(components["java"])
            artifact(sourcesJar)
        }
    }
}

val bintrayUser: String? by project
val bintrayApiKey: String? by project

bintray {
    user = bintrayUser ?: ""
    key = bintrayApiKey ?: ""
    publish = true
    setPublications("mavenJava")
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
