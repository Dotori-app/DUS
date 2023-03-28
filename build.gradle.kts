// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id (Plugins.androidApplication).version(ProjectProperties.AndroidVersion).apply(false)
    id (Plugins.androidLibrary).version(ProjectProperties.AndroidVersion).apply(false)
    id (Plugins.jetBrainsKotlinAndroid).version(ProjectProperties.JetbrainsKotlin).apply(false)
    id (Plugins.jetbrainsKotlinJvm).version(ProjectProperties.JetbrainsKotlin).apply(false)
}