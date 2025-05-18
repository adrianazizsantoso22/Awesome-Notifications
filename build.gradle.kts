plugins {
    // Tidak perlu menambahkan plugin di sini untuk project-level
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

// Jika ingin mengatur build directory, bisa gunakan ini
val newBuildDir = rootProject.layout.buildDirectory.dir("build").get()
rootProject.layout.buildDirectory.value(newBuildDir)

subprojects {
    val newSubprojectBuildDir = newBuildDir.dir(project.name)
    project.layout.buildDirectory.value(newSubprojectBuildDir)
}

tasks.register<Delete>("clean") {
    delete(newBuildDir)
}