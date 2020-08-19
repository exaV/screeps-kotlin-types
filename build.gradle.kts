import com.jfrog.bintray.gradle.BintrayExtension

plugins {
    kotlin("js") version "1.4.0"
    `maven-publish`
    id("com.jfrog.bintray") version "1.8.5"
}

repositories {
    jcenter()
}

dependencies {
    testImplementation(kotlin("test-js"))
}

group = "ch.delconte.screeps-kotlin"

kotlin {
    js(BOTH) {
        useCommonJs()
        nodejs()
    }
}


publishing {
    publications {
        create<MavenPublication>("kotlin") {
            from(components["kotlin"])
            groupId = project.group.toString()
            artifactId = project.name

            artifact(tasks.getByName<Zip>("jsLegacySourcesJar"))
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
