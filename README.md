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
   - Periksa file pubspec.yaml untuk menjamin bahwa semua dependensi yang diperlukan untuk menjalankan aplikasi ini telah ditambahkan dengan benar. Seharusnya terdapat baris seperti ini:
     ```yaml
     dependencies:
        flutter:
          sdk: flutter
        firebase_core: ^2.3.0
        firebase_messaging: ^14.0.0
     ```
   - Jalankan perintah berikut untuk menginstall dependensi
     ```bash
     flutter pub get
     ```

### 3. **Setup Firebase**
   - Buat proyek di [Firebase Console](https://console.firebase.google.com/).
   - Tambahkan aplikasi Android dan unduh `google-services.json`.
   - Tempatkan file `google-services.json` di folder `android/app`.

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
Jika aplikasi ini masih belum dapat dijalankan setelah melakukan prosedur di atas, lakukanlah cara kedua dengan meng

## Prasyarat
- Flutter SDK
- Firebase Console untuk konfigurasi notifikasi

## Kontribusi
Kontribusi sangat diterima! Silakan buka issue atau kirim pull request untuk membantu meningkatkan proyek ini.

## Lisensi
Proyek ini dilisensikan di bawah [MIT License](LICENSE).

---

Jika ada pertanyaan lebih lanjut, silakan buka issue di repositori ini. Terima kasih telah berkunjung!
