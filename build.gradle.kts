pluginManagement {
repositories {
maven { url = uri("https://maven.fabricmc.net/") }
gradlePluginPortal()
mavenCentral()
}
}

dependencyResolutionManagement {
repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
repositories {
maven { url = uri("https://maven.fabricmc.net/") }
mavenCentral()
maven { url = uri("https://maven.meteorclient.com/releases") }
maven { url = uri("https://maven.meteorclient.com/snapshots") }
}
}

rootProject.name = "DarkPrime"
