# Awesome Notifications with Firebase in Flutter Apps
dibuat oleh Adrian Aziz Santoso (NRP 5025221229) untuk memenuhi tugas Pemrograman Perangkat Bergerak B

![image](https://github.com/user-attachments/assets/ece7830f-ab6e-4c51-8f9d-09bea190198d)

## Deskripsi

"Awesome Notifications with Firebase in Flutter Apps" merupakan aplikasi Flutter buatan saya yang mengintegrasikan Firebase Cloud Messaging (FCM) untuk mengelola dan menampilkan notifikasi secara real-time. Aplikasi ini dirancang untuk memberikan pengalaman pengguna yang interaktif [melalui notifikasi yang informatif dan menarik](https://somniosoftware.com/blog/how-to-effectively-implement-push-notifications-in-your-flutter-app).

## Fitur Utama
Aplikasi "Awesome Notifications with Firebase in Flutter Apps" dilengkapi dengan berbagai fitur unggulan yang dirancang untuk meningkatkan interaksi pengguna melalui notifikasi yang efektif. Berikut adalah beberapa fitur utama yang ditawarkan:
- **Notifikasi Push**: Menerima dan menampilkan notifikasi push dari Firebase.
- **UI Responsif**: Desain antarmuka yang responsif dan menarik.
- **Pengelolaan Notifikasi**: Kemampuan untuk mengelola dan menyesuaikan notifikasi yang diterima.
- **Integrasi Firebase**: Memanfaatkan Firebase untuk pengiriman dan pengelolaan notifikasi.

## Proses Pengerjaan

Inilah langkah-langkah yang telah saya lakukan agar tugas "Awesome Notifications with Firebase in Flutter Apps" cepat selesai:

### 1. **Setup Proyek Flutter**
   - Buat proyek Flutter baru dengan mengetikkan perintah berikut:
     ```bash
     flutter create awesome_notifications
     cd awesome_notifications
     ```

### 2. **Tambahkan Dependensi**
   - Buka `pubspec.yaml` dan tambahkan dependensi berikut:
     ```yaml
     dependencies:
       flutter:
         sdk: flutter
       firebase_core: ^2.3.0
       firebase_messaging: ^14.0.0
     ```
   - Periksa file `pubspec.yaml` untuk menjamin bahwa semua dependensi yang diperlukan untuk menjalankan aplikasi ini telah ditambahkan dengan benar. Seharusnya, file ini berisikan baris kodingan seperti ini:
     ```yaml
     name: awesome_notifications
     description: A new Flutter project.
      
     publish_to: 'none' # Remove this line if you wish to publish to pub.dev
      
     version: 1.0.0+1
      
     environment:
       sdk: ">=2.18.0 <3.0.0"
      
     dependencies:
       flutter:
         sdk: flutter
       firebase_core: ^2.3.0
       firebase_messaging: ^14.0.0
      
     dev_dependencies:
       flutter_test:
         sdk: flutter
      
     flutter:
       uses-material-design: true
     ```
   - Jalankan perintah berikut untuk menginstall dependensi
     ```bash
     flutter pub get
     ```

### 3. **Setup Firebase**

a. Periksa Struktur Proyek:
   - Pastikan folder `android` ada di dalam direktori proyek Flutter kamu (`awesome_notifications`).

b. Periksa File `build.gradle`:
   - Pastikan ada file `build.gradle` di dalam folder `android/app/`.
   - File ini harus berisi konfigurasi untuk modul aplikasi Android.

c. Verifikasi File `build.gradle`:
   - Buka `android/app/build.gradle` dan pastikan memiliki struktur yang benar. Contoh:
     ```gradle
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
     ```

d. Cek `settings.gradle`:
   - Sekarang, periksa file `android/settings.gradle` untuk memastikan modul aplikasi terdaftar. Seharusnya ada baris seperti ini:
     ```gradle
     include ':app'
     ```
   - Seharusnya, file ini berisikan baris kodingan seperti ini:
      ```
      pluginManagement {
          val flutterSdkPath = run {
              val properties = java.util.Properties()
              file("local.properties").inputStream().use { properties.load(it) }
              val flutterSdkPath = properties.getProperty("flutter.sdk")
              require(flutterSdkPath != null) { "flutter.sdk not set in local.properties" }
              flutterSdkPath
          }
      
          includeBuild("$flutterSdkPath/packages/flutter_tools/gradle")
      
          repositories {
              google()
              mavenCentral()
              gradlePluginPortal()
          }
      }
      
      plugins {
          id("dev.flutter.flutter-plugin-loader") version "1.0.0"
          id("com.android.application") version "8.9.0" apply false
          id("org.jetbrains.kotlin.android") version "1.8.22" apply false
      }
      
      include(":app")
      ```

e. Buka Proyek di Android Studio:
   - Buka Android Studio dan pastikan kamu membuka folder proyek Flutter (`awesome_notifications`) dan bukan hanya folder `android`.
   - Pastikan Android Studio mengenali modul aplikasi Android.

f. Sync Gradle:
   - Setelah melakukan perubahan, pastikan untuk menyinkronkan Gradle dengan Android Studio dengan mengklik "Sync Now" di bagian atas tampilan antarmuka Android Studio.

g. Navigasi ke [Firebase](https://www.geeksforgeeks.org/adding-firebase-to-android-app/) Assistant:
   - Buka menu "Tools" lalu klik "[Firebase](https://www.geeksforgeeks.org/adding-firebase-to-android-app/)".

![image](https://github.com/user-attachments/assets/b6e3f095-2369-4afb-8f17-9f49bb933608)

   - Ini akan membuka tab "[Firebase](https://www.geeksforgeeks.org/adding-firebase-to-android-app/) Assistant" di sisi kanan Android Studio.

![image](https://github.com/user-attachments/assets/a3b5da64-c64c-4444-91c6-d087eb62b74c)

h. Hubungkan ke [Firebase](https://www.geeksforgeeks.org/adding-firebase-to-android-app/):
   - Pilih "Authentication" pada tab "Assistant", lalu pilih "Authentication using Google".

![image](https://github.com/user-attachments/assets/44a260ad-bfe1-4548-a651-f46accd0933b)

   - Pilih "Connect to [Firebase](https://www.geeksforgeeks.org/adding-firebase-to-android-app/)".

![image](https://github.com/user-attachments/assets/b810c42a-24d3-4544-9e78-c06aaafb3432)

   - Ini akan membuka [Firebase Console](https://console.firebase.google.com/) di browser Anda.

![image](https://github.com/user-attachments/assets/00ae750f-428b-4122-aa3f-4e4ff96544cf)

   - Sekarang biarkan pembuatan proyek selesai. Anda akan dibawa ke halaman beranda proyek. Saat muncul _pop-up message_ berbunyi "[Your Firebase Android app has been created in Firebase.](https://stackoverflow.com/questions/61155717/fire-base-stuck-and-not-connecting-with-android-studio)", klik "Connect".

   ![image](https://github.com/user-attachments/assets/2b8aa824-f106-42a4-85f6-4efacc0a6f82)

   - Setelah itu, akan muncul tampilan berbunyi "[Your Android Studio project is connected to your Firebase Android app](https://medium.com/@mutebibrian256/firebase-authentication-with-email-and-password-in-android-using-kotlin-5fbe61ee6252)".

![image](https://github.com/user-attachments/assets/34df71ed-50fd-432f-8cff-5a41fb6179dd)

   - Sekarang, Anda dapat menutup browser.

### 4. **Konfigurasi Gradle**
   - Di `android/build.gradle`, tambahkan:
     ```kotlin
     buildscript {
         dependencies {
             classpath("com.google.gms:google-services:4.4.2")
         }
     }
     ```
   - Periksa file `android/app/build.gradle` untuk menjamin bahwa semua pengaturan yang diperlukan untuk integrasi Google Services telah ditambahkan dengan benar. Seharusnya, file ini berisikan baris kodingan seperti ini:
      ```
      buildscript {
          repositories {
              google()
              mavenCentral()
          }
          dependencies {
              classpath("com.google.gms:google-services:4.4.2") // Tambahkan ini
          }
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
      ```
   - Di `android/app/build.gradle`, tambahkan:
     ```kotlin
     apply plugin: 'com.google.gms.google-services'
     ```
   - Periksa file `android/app/build.gradle` untuk menjamin bahwa Kotlin telah diinisialisasi dengan benar. Seharusnya, file ini berisikan baris kodingan seperti ini:
      ```
      plugins {
          id("com.android.application")
          id("kotlin-android")
          id("dev.flutter.flutter-gradle-plugin")
          id("com.google.gms.google-services") // Tambahkan ini
      }
      
      android {
          namespace = "com.example.awesome_notifications"
          compileSdk = flutter.compileSdkVersion
          ndkVersion = flutter.ndkVersion
      
          compileOptions {
              sourceCompatibility = JavaVersion.VERSION_11
              targetCompatibility = JavaVersion.VERSION_11
          }
      
          kotlinOptions {
              jvmTarget = JavaVersion.VERSION_11.toString()
          }
      
          defaultConfig {
              applicationId = "com.example.awesome_notifications"
              minSdk = flutter.minSdkVersion
              targetSdk = flutter.targetSdkVersion
              versionCode = flutter.versionCode
              versionName = flutter.versionName
          }
      
          buildTypes {
              release {
                  signingConfig = signingConfigs.getByName("debug")
              }
          }
      }
      
      flutter {
          source = "../.."
      } 
      ```

### 5. **Inisialisasi Firebase**
   - Di `main.dart`, inisialisasi Firebase:
     ```dart
     import 'package:flutter/material.dart';
     import 'package:firebase_core/firebase_core.dart';

     void main() async {
       WidgetsFlutterBinding.ensureInitialized();
       await Firebase.initializeApp();
       runApp(MyApp());
     }

     class MyApp extends StatelessWidget {
       @override
       Widget build(BuildContext context) {
         return MaterialApp(
           title: 'Awesome Notifications',
           home: HomeScreen(),
         );
       }
     }
     ```
   - Periksa file `main.dart` untuk menjamin bahwa Firebase telah diinisialisasi dengan benar. Seharusnya file ini memiliki baris kodingan seperti ini:
      ```
      import 'package:flutter/material.dart';
      import 'package:firebase_core/firebase_core.dart';
      
      void main() async {
        WidgetsFlutterBinding.ensureInitialized();
        await Firebase.initializeApp();
        runApp(MyApp());
      }
      
      class MyApp extends StatelessWidget {
        @override
        Widget build(BuildContext context) {
          return MaterialApp(
            title: 'Awesome Notifications',
            theme: ThemeData(
              colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
            ),
            home: HomeScreen(),
          );
        }
      }
      
      class MyHomePage extends StatefulWidget {
        const MyHomePage({super.key, required this.title});
      
        final String title;
      
        @override
        State<MyHomePage> createState() => _MyHomePageState();
      }
      
      class _MyHomePageState extends State<MyHomePage> {
        int _counter = 0;
      
        void _incrementCounter() {
          setState(() {
            _counter++;
          });
        }
      
        @override
        Widget build(BuildContext context) {
          return Scaffold(
            appBar: AppBar(
              backgroundColor: Theme.of(context).colorScheme.inversePrimary,
              title: Text(widget.title),
            ),
            body: Center(
              child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                children: <Widget>[
                  const Text('You have pushed the button this many times:'),
                  Text(
                    '$_counter',
                    style: Theme.of(context).textTheme.headlineMedium,
                  ),
                ],
              ),
            ),
            floatingActionButton: FloatingActionButton(
              onPressed: _incrementCounter,
              tooltip: 'Increment',
              child: const Icon(Icons.add),
            ),
          );
        }
      }
      ```

### 6. **Implementasi Notifikasi**
   - Sekarang, buatlah `HomeScreen` untuk menangani notifikasi:
     ```dart
     import 'package:flutter/material.dart';
     import 'package:firebase_messaging/firebase_messaging.dart';

     class HomeScreen extends StatefulWidget {
       @override
       _HomeScreenState createState() => _HomeScreenState();
     }

     class _HomeScreenState extends State<HomeScreen> {
       @override
       void initState() {
         super.initState();
         FirebaseMessaging.onMessage.listen((RemoteMessage message) {
           print('Received message: ${message.notification?.title}');
           // Tampilkan notifikasi atau dialog sesuai kebutuhan
         });
       }

       @override
       Widget build(BuildContext context) {
         return Scaffold(
           appBar: AppBar(title: Text('Notifikasi Firebase')),
           body: Center(child: Text('Selamat datang!')),
         );
       }
     }
     ```

### 7. **Mengirim Notifikasi**
   - Gunakan Postman atau alat lain untuk mengirim notifikasi ke token FCM yang Anda peroleh dari aplikasi bertajuk "Awesome Notifications with Firebase in Flutter Apps" ini saat dijalankan.

### 8. **Uji Aplikasi**
   - _Clone_ repositori ini dengan mengetikkan perintah berikut:
     ```bash
     git clone https://github.com/username/Awesome-Notifications.git
     cd Awesome-Notifications
     ```
   - Install dependensi yang diperlukan untuk menjalankan aplikasi Flutter ini dengan mengetikkan perintah berikut:
     ```bash
     flutter pub get
     ```
   - Jalankan aplikasi ini dengan mengetikkan perintah berikut:
     ```bash
     flutter run
     ```
Jika aplikasi ini masih belum dapat dijalankan setelah melakukan prosedur di atas, lakukanlah cara kedua dengan membuka menu "Build" lalu mengklik "Generate App Bundles or APKs > Generate APKs":

![image](https://github.com/user-attachments/assets/d1b359f1-652d-4272-849d-679478ae9ab9)

## Prasyarat
- Flutter SDK
- Firebase Console untuk konfigurasi notifikasi

## Kontribusi
Kontribusi sangat diterima! Silakan buka issue atau kirim pull request untuk membantu meningkatkan proyek ini.

## Lisensi
Proyek ini dilisensikan di bawah [MIT License](LICENSE).

---

Jika ada pertanyaan lebih lanjut, silakan buka issue di repositori ini. Terima kasih telah berkunjung!
