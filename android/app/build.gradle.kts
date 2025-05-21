apply plugin: 'com.android.application'

android {
    compileSdkVersion 33

    defaultConfig {
        applicationId "com.example.awesome_notifications"
        minSdkVersion 21
        targetSdkVersion 33
        versionCode 1
        versionName "1.0"
    }
}

dependencies {
    implementation "com.google.firebase:firebase-analytics"
    // Tambahkan dependensi lain sesuai kebutuhan
}
