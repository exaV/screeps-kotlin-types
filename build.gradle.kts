import com.jfrog.bintray.gradle.BintrayExtension
import com.jfrog.bintray.gradle.tasks.BintrayUploadTask
import org.gradle.api.publish.maven.internal.artifact.FileBasedMavenArtifact

plugins {
    kotlin("js") version "1.4.10"
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
        register<MavenPublication>("kotlin") {
            from(components["kotlin"])
            artifact(tasks.getByName<Zip>("jsLegacySourcesJar"))
        }
    }
}

val bintrayUser: String? by project
val bintrayApiKey: String? by project

tasks.withType<BintrayUploadTask> {
    doFirst {
        publishing.publications
            .filterIsInstance<MavenPublication>()
            .forEach { publication ->
                val moduleFile = buildDir.resolve("publications/${publication.name}/module.json")
                if (moduleFile.exists()) {
                    publication.artifact(object : FileBasedMavenArtifact(moduleFile) {
                        override fun getDefaultExtension() = "module"
                    })
                }
            }
    }
}

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
