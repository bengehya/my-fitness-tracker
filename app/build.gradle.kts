plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.fitness_trackingcompany"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.fitness_trackingcompany"
        minSdk = 30
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    //Splash Screen API
    implementation ("androidx.core:core-splashscreen:1.0.1")

    implementation ("com.google.android.material:material:1.4.0") // For Material Design components
    implementation ("androidx.drawerlayout:drawerlayout:1.1.1") // For DrawerLayout
    implementation ("androidx.navigation:navigation-fragment-ktx:2.5.0")// or the latest version
    implementation ("androidx.navigation:navigation-ui-ktx:2.5.0") // or the latest version



}

