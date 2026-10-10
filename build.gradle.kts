
    plugins {
id("fabric-loom") version "1.15.5"
"maven-publish"
}

    
version = project.property("mod_version") as String
group = project.property("maven_group") as String

base { archivesName.set("DarkPrime") }

dependencies {
    minecraft("com.mojang:minecraft:${property("minecraft_version")}")
    mappings("net.fabricmc:yarn:${property("yarn_mappings")}:v2")
    modImplementation("net.fabricmc:fabric-loader:${property("loader_version")}")
    modImplementation("meteordevelopment:meteor-client:${property("meteor_version")}")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
    withSourcesJar()
}

tasks.processResources {
    inputs.property("version", project.version)
    filesMatching("fabric.mod.json") { expand("version" to project.version) }
}
