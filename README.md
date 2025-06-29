# Yearbook-Kotlin-App

**Aplikasi Profil Angkatan STROD14NS (Strong in Radiance) - Angkatan Ke-14 SMA Terpadu Wira Bhakti Gorontalo**

[![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://developer.android.com/)
[![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white)](https://developer.android.com/studio)
[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/vspatabuga/Yearbook-Kotlin-App)

Aplikasi mobile ini dibuat khusus untuk mendokumentasikan profil seluruh siswa/i Angkatan ke-14 **SMA Terpadu Wira Bhakti Gorontalo**, yang dikenal dengan nama **STROD14NS**. Aplikasi ini berfungsi sebagai buku kenangan digital (digital yearbook) yang interaktif dan mudah diakses.

## Tentang STROD14NS

**Strong in Radiance (STROD14NS)** adalah nama angkatan ke-14 dari SMA Terpadu Wira Bhakti Gorontalo. Aplikasi ini menjadi media untuk mengabadikan kenangan dan profil setiap individu di angkatan kami.

## Fitur Aplikasi

* **Profil Siswa Interaktif:** Setiap siswa dapat mengisi dan melihat profil masing-masing, lengkap dengan data diri, foto, dan bio singkat.
* **Galeri Foto:** Bagian untuk menampilkan foto-foto kegiatan dan momen angkatan.
* **Pencarian Profil:** Fitur pencarian untuk menemukan profil teman dengan cepat.
* **Data Angkatan:** Informasi umum tentang angkatan ke-14.
* **Antarmuka Pengguna (UI) Intuitif:** Desain UI yang bersih dan mudah digunakan.

## Tumpukan Teknologi

* **Bahasa Pemrograman:** Kotlin
* **Platform:** Android
* **IDE:** **Android Studio**
* **Database (Opsional):** Firebase Realtime Database / Firestore (jika data disimpan secara online)

## Cara Menjalankan Aplikasi (Pengembangan)

Ikuti langkah-langkah di bawah ini untuk menjalankan proyek di lingkungan pengembangan Anda.

### 1. Prasyarat

* [**Android Studio**](https://developer.android.com/studio) terinstal di komputer Anda.
* Perangkat Android (fisik atau emulator) yang terhubung.

### 2. Clone Repositori

Clone repositori ini ke komputer Anda:

```bash
git clone https://github.com/vspatabuga/Yearbook-Kotlin-App.git
```
### 3. Buka Proyek di Android Studio
Buka Android Studio.

Pilih File > Open dan navigasi ke folder proyek yang baru saja Anda clone (Yearbook-Kotlin-App).

Android Studio akan secara otomatis mengunduh dependensi Gradle yang diperlukan. Tunggu hingga proses sinkronisasi Gradle selesai.

### 4. Konfigurasi Database (jika menggunakan Firebase)
Jika Anda menggunakan Firebase sebagai database, Anda perlu mengkonfigurasi proyek Firebase Anda.

Buat proyek baru di Firebase Console.

Tambahkan aplikasi Android ke proyek Firebase Anda.

Unduh file google-services.json dan letakkan di direktori app/ di proyek Android Studio Anda.

### 5. Jalankan Aplikasi
Di Android Studio, sambungkan perangkat Android Anda (melalui USB debugging) atau pilih emulator dari AVD Manager.

Klik tombol "Run 'app'" (ikon segitiga hijau) di toolbar.

Aplikasi akan di-build, diinstal, dan diluncurkan di perangkat yang Anda pilih.

## Tentang Pengembang
Aplikasi ini adalah inisiatif dari:

Virgiawan Sagarmata Patabuga
(Taruna Angkatan Ke-14 SMA Terpadu Wira Bhakti Gorontalo)

## Kontribusi
Meskipun ini adalah proyek pribadi, kontribusi untuk perbaikan atau penambahan fitur dipersilakan. Silakan ajukan pull request Anda.

## Lisensi
MIT License
