rootProject.name = "addresses-testers"
include("lob")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
}
