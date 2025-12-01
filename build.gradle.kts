plugins {
    kotlin("multiplatform") version "2.2.21"
    id("com.vanniktech.maven.publish") version "0.35.0"
}

group = "io.github.exav"

repositories {
    mavenCentral()
}


kotlin {

    sourceSets {
        jsMain {
        }
        jsTest {
            dependencies {
                implementation(kotlin("test"))
            }

        }
    }
    js {
        nodejs {
            binaries.library()
            testTask {
            }
        }
    }
}

mavenPublishing {
    signAllPublications()
    publishToMavenCentral(automaticRelease = true)

    coordinates("io.github.exav", "screeps-kotlin-types", project.version.toString())

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


