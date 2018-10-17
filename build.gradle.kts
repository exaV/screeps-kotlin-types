import com.jfrog.bintray.gradle.BintrayExtension
import com.moowork.gradle.node.NodeExtension
import com.moowork.gradle.node.npm.NpmInstallTask
import com.moowork.gradle.node.npm.NpmSetupTask
import com.moowork.gradle.node.npm.NpmTask
import com.moowork.gradle.node.task.NodeTask
import com.moowork.gradle.node.task.SetupTask
import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile


plugins {
    id("kotlin2js") version "1.2.71"
    `maven-publish`
    id("com.jfrog.bintray") version "1.8.1"
    id("com.moowork.node") version "1.2.0"
}
repositories {
    jcenter()
}


dependencies {
    implementation(kotlin("stdlib-js"))
    testCompile(kotlin("test-js"))
}

group = "ch.delconte.screeps-kotlin"
version = "1.0.0"

val sourcesJar by tasks.registering(Jar::class) {
    classifier = "sources"
    from(sourceSets["main"].allSource)
}

tasks {

    val compileKotlin2Js by named<Kotlin2JsCompile>("compileKotlin2Js") {
        kotlinOptions {
            sourceMap = true
            moduleKind = "umd"
        }
    }

    val compileTestKotlin2Js by named<Kotlin2JsCompile>("compileTestKotlin2Js") {
        kotlinOptions {
            sourceMap = true
            moduleKind = "commonjs"
        }
    }

    val installMocha by registering(NpmTask::class) {
        setArgs(listOf("install", "mocha"))
    }

    val populateNodeModules by registering(Copy::class) {
        from(compileKotlin2Js.outputFile)
        configurations.testCompile.forEach {
            from(zipTree(it.absolutePath).matching { include("*.js") })
        }

        into("${buildDir}/node_modules")
    }

    val runMocha by registering(NodeTask::class) {
        dependsOn(installMocha, compileTestKotlin2Js, populateNodeModules)

        setScript(File("node_modules/mocha/bin/mocha"))
        setArgs(listOf(compileTestKotlin2Js.outputFile.absolutePath))
    }

    named<Test>("test") {
        dependsOn(runMocha)
    }
}

publishing {
    publications {
        register("mavenJava", MavenPublication::class) {
            from(components["java"])
            artifact(sourcesJar.get())
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
