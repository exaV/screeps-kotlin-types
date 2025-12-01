rootProject.name = "screeps-kotlin-types"

System.setProperty("org.gradle.project.mavenCentralUsername", "abc")
System.setProperty("org.gradle.project.mavenCentralPassword", "def")
System.setProperty("org.gradle.project.signingInMemoryKey", System.getenv("SIGNING_KEY").orEmpty())
System.setProperty("org.gradle.project.signingInMemoryKeyPassword", System.getenv("SIGNING_KEY_PASSWORD").orEmpty())

