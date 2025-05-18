# Awesome Notifications
Awesome Notifications merupakan aplikasi Flutter buatan kami yang mengintegrasikan FCM (Firebase Cloud Messaging) untuk mengelola dan menampilkan notifikasi secara real-time. Aplikasi ini dirancang untuk memberikan pengalaman pengguna yang interaktif dengan notifikasi yang informatif dan menarik.

## Fitur Utama
- **Notifikasi Push:** Menerima dan menampilkan notifikasi push dari Firebase.
- **UI Responsif:** Desain antarmuka yang responsif dan menarik.
- **Pengelolaan Notifikasi:** Kemampuan untuk mengelola dan menyesuaikan notifikasi yang diterima.
- **Integrasi Firebase:** Memanfaatkan Firebase untuk pengiriman dan pengelolaan notifikasi.

## Proses Pembuatan
Berikut adalah langkah-langkah yang telah kami lakukan menyelesaikan tugas "Awesome Notifications with Firebase in Flutter Apps" dengan cepat, berikut adalah langkah-langkah yang bisa kamu ikuti:

### 1. **Setup Proyek Flutter**

   - Buat proyek Flutter baru:
     ```bash
     flutter create awesome_notifications
     cd awesome_notifications
     ```

### 2. **Tambahkan Dependensi**

   - Periksa file `pubspec.yaml` untuk menjamin bahwa semua dependensi yang diperlukan untuk proyek telah ditambahkan dengan benar. Seharusnya terdapat baris seperti ini:
     ```yaml
     dependencies:
       flutter:
         sdk: flutter
       firebase_core: ^2.3.0
       firebase_messaging: ^14.0.0
     ```
   - Sehingga, isi file `pubspec.yaml` seharusnya adalah sebagai berikut:
     ```
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
   - Jalankan perintah berikut untuk menginstall dependensi:
     ```bash
     flutter pub get
     ```

### 3. **Setup Firebase**

a. Periksa Struktur Proyek:
   - Pastikan folder `android` ada di dalam direktori proyek Flutter kamu (`awesome_notifications`).

b. Periksa File `build.gradle`:
   - Pastikan ada file `build.gradle` di dalam folder `android/app/`.
   - File ini harus berisi konfigurasi untuk modul aplikasi Android.
   - Agar tidak terjadi "gagal sync" di Android Studio, pastikan `android/app/build.gradle` memiliki isi sebagai berikut

c. Verifikasi File `build.gradle`:
   - Buka `android/app/build.gradle` dan pastikan memiliki struktur yang benar. Contoh:
     ```gradle
     plugins {
         id("com.android.application")
         id("kotlin-android")
         id("dev.flutter.flutter-gradle-plugin")
     //  id("com.google.gms.google-services") // Tambahkan ini
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

d. Cek `settings.gradle`:
   - Periksa file `android/settings.gradle` untuk memastikan modul aplikasi terdaftar. Seharusnya terdapat baris seperti ini:
     ```gradle
     include ':app'
     ```
   - Sehingga, isi file `android/settings.gradle` seharusnya adalah sebagai berikut:
   ```
   ```

e. Buka Proyek di Android Studio:
   - Buka Android Studio dan pastikan kamu membuka folder proyek Flutter (`awesome_notifications`) dan bukan hanya folder `android`.
   - Pastikan Android Studio mengenali modul aplikasi Android.

f. Sync Gradle:
   - Setelah melakukan perubahan, pastikan untuk menyinkronkan Gradle di Android Studio dengan mengklik "Sync Now" di bagian atas.
   - Buat proyek di [Firebase Console](https://console.firebase.google.com/).
   - Tambahkan aplikasi Android dan unduh `google-services.json`.
   - Tempatkan file `google-services.json` di folder `android/app`.

g. Navigasi ke Firebase Assistant:

   - Buka "Tools" dan pilih "Firebase"

     ![image](https://github.com/user-attachments/assets/414c2e83-9277-408e-b222-25916c3e5ac2)

   - Ini akan membuka tab "Firebase Assistant" di sisi kanan Android Studio.

     ![image](https://github.com/user-attachments/assets/738aa512-27d8-4672-9ac2-aa5a651ad197)

h. Hubungkan ke Firebase:

   - Pilih "Authentication" pada tab asisten, lalu pilih "Authentication with Google".

     ![image](https://github.com/user-attachments/assets/5e61e185-2bf8-43d3-b2ff-93df1b15e009)
 
   - Pilih "Connect to Firebase".

     ![image](https://github.com/user-attachments/assets/2c8fb498-d28f-4ca4-8348-cb365c6856ae)

   - Setelah melakukan tahapan di atas, Anda akan dibawa ke halaman beranda [Firebase Console](https://console.firebase.google.com/).

      ![image](https://github.com/user-attachments/assets/1ece3309-4367-45b9-8ae6-941cbd63d383)

   - Saat muncul _pop-up_ yang menampilkan "[Your Firebase Android app has been created in Firebase](https://stackoverflow.com/questions/61155717/fire-base-stuck-and-not-connecting-with-android-studio)", klik "Connect".

      ![image](https://github.com/user-attachments/assets/438d4b37-79ab-43b6-88e9-b5d778bfdf1c)

   - Setelah itu, akan muncul layar yang menampilkan "[Your Android Studio project is connected to your Firebase Android app](https://medium.com/@mutebibrian256/firebase-authentication-with-email-and-password-in-android-using-kotlin-5fbe61ee6252)".

      ![image](https://github.com/user-attachments/assets/1bc291d4-1085-49f5-86da-f75868ecdee6)

   - Sekarang Anda dapat menutup browser.

### 4. **Konfigurasi Gradle**

   - Di `android/build.gradle`, tambahkan:
     ```kotlin
     buildscript {
         dependencies {
             classpath("com.google.gms:google-services:4.4.2")
         }
     }
     ```
   - Di `android/app/build.gradle`, tambahkan:
     ```kotlin
     apply plugin: 'com.google.gms.google-services'
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

### 6. **Implementasi Notifikasi**

   - Buat `HomeScreen` untuk menangani notifikasi:
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

   - Gunakan Postman atau alat lain untuk mengirim notifikasi ke token FCM yang kamu dapatkan dari aplikasi saat dijalankan.

### 8. **Uji Aplikasi**

   - Clone repositori ini:   
     ```bash
     git clone https://github.com/username/Awesome-Notifications.git
     cd Awesome-Notifications
     ```
     
   - Install dependensi:
     ```bash
     flutter pub get
     ```

   - Jalankan aplikasi menggunakan:
     ```bash
     flutter run
     ```
