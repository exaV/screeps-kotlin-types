plugins {
    kotlin("js") version "1.6.10"
    `maven-publish`
    signing
}

group = "io.github.exav"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test-js"))
}


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

            pom {
                name.set("screeps-kotlin-types")
                description.set("The repository for Screep's Kotlin type definitions. https://screeps.com/")
                url.set("https://github.com/exaV/screeps-kotlin-types")
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://opensource.org/licenses/mit-license.php")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/exaV/screeps-kotlin-types.git")
                    developerConnection.set("scm:git:ssh://github.com/exaV/screeps-kotlin-types.git")
                    url.set("https://github.com/exaV/screeps-kotlin-types")
                }
                developers {
                    developer {
                        name.set("Patrick Del Conte")
                        organizationUrl.set("https://github.com/exaV")
                    }
                }
            }

        }
    }

    repositories {
        maven {
            url = uri(System.getenv("MAVEN_URL") ?: "")
            credentials {
                username = System.getenv("MAVEN_USERNAME") ?: ""
                password = System.getenv("MAVEN_PASSWORD") ?: ""
            }
        }
    }
}

signing {
    val signingKey: String? by project
    val signingPassword: String? by project
    useInMemoryPgpKeys(signingKey, signingPassword)
    sign(publishing.publications["kotlin"])
}

