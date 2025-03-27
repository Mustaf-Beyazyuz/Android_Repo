pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven {
            url = uri("https://raw.githubusercontent.com/oguzkaran/android-mar-2023-karandev-maven-repo/main")
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://raw.githubusercontent.com/oguzkaran/android-mar-2023-karandev-maven-repo/main")
        }
    }
}

rootProject.name = "PaymentApplication"
include(":app")
include(":RepositoryLib")
