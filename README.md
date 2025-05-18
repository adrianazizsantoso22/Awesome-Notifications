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
   - Periksa file `pubspec.yaml` untuk menjamin bahwa semua dependensi yang diperlukan untuk menjalankan aplikasi ini telah ditambahkan dengan benar. Seharusnya file ini memiliki baris kodingan seperti ini:
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
   - Periksa file `android/settings.gradle` untuk memastikan modul aplikasi terdaftar. Seharusnya ada baris seperti ini:
     ```gradle
     include ':app'
     ```

e. Buka Proyek di Android Studio:
   - Buka Android Studio dan pastikan kamu membuka folder proyek Flutter (`awesome_notifications`) dan bukan hanya folder `android`.
   - Pastikan Android Studio mengenali modul aplikasi Android.

f. Sync Gradle:
   - Setelah melakukan perubahan, pastikan untuk menyinkronkan Gradle di Android Studio dengan mengklik "Sync Now" di bagian atas.

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
   - Clone repositori ini dengan mengetikkan perintah berikut:
     ```bash
     git clone https://github.com/username/Awesome-Notifications.git
     cd Awesome-Notifications
     ```
   - Install dependensi yang diperlukan untuk menjalankan aplikasi ini dengan mengetikkan perintah berikut:
     ```bash
     flutter pub get
     ```
   - Jalankan aplikasi dengan mengetikkan perintah berikut:
     ```bash
     flutter run
     ```
Jika aplikasi ini masih belum dapat dijalankan setelah melakukan prosedur di atas, lakukanlah cara kedua dengan membuka "Build" lalu mengklik "Generate App Bundles or APKs > Generate APKs":

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
