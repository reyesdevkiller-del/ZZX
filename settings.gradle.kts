pluginManagement {
    repositories {
        maven("https://maven.fabricmc.net/")
        gradlePluginPortal()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven("https://maven.fabricmc.net/")
        mavenCentral()
        maven("https://maven.meteorclient.com/releases")
        maven("https://maven.meteorclient.com/snapshots")
    }
}
rootProject.name = "DarkPrime"
