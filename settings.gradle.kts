rootProject.name = "openai-kotlin"
includeBuild("build-support")

include(":openai-core")
include(":openai-client")
include(":openai-client-bom")

// Exclude sample projects on JitPack to avoid libcurl dependency issues
if (System.getenv("JITPACK") == null) {
    include(":sample:jvm")
    include(":sample:js")
    include(":sample:native")
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}
