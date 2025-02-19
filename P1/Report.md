| | Algoritma dan Struktur Data|
|--|--|
| NIM | Dzaky Hadyan Eliyanta |
| Kelas | TI - 1H |

# Pertemuan 1 KONSEP DASAR PEMROGRAMAN

## 1. Jawaban Praktikum Pemilihan

Source code dari pertanyaan praktikum pemilihan berada di Source Code\PraktikumPemilihan.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-02-14%20135437.png)

**Penjelasan Ringkas**

1. Input nilai tugas, kuis, UTS, dan UAS
2. Validasi Input apakah berada dalam range 0-100. Jika tidak, menampilkan "nilai tidak valid"
3. Menghitung dan mengkonversi nilai akhir ke nilai huruf dan kualifikasinya sesuai rasio yang disediakan, yaitu 20% nilai tugas, 20% nilai kuis, 30% nilai UTS, dan 30% nilai UAS
4. menampilkan nilai akhir dan keterangan apakah lulus/tidak lulus berdasarkan kualifikasinya

## 2. Jawaban Praktikum Perulangan

Source code dari pertanyaan praktikum perulangan berada di Source Code\PraktikumPerulangan.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-02-14%20195704.png)

**Penjelasan Ringkas**

1. Input NIM
2. Mendapatkan 2 digit terakhir dari NIM tersebut dengan cara membagi NIM dengan 100, membuat variabel baru dengan nilai hasil bagi NIM yang sudah dibulatkan, kemudian mengurangi keduanya, untuk mendapatkan 2 angka di belakang desimal yang selanjutnya kita kali dengan 100 agar kembali 
3. Menghitung dan mengkonversi nilai akhir ke nilai huruf dan kualifikasinya sesuai rasio yang disediakan, yaitu 20% nilai tugas, 20% nilai kuis, 30% nilai UTS, dan 30% nilai UAS
4. menampilkan nilai akhir dan keterangan apakah lulus/tidak lulus berdasarkan kualifikasinya

## 3. Jawaban Praktikum Array

Source code dari pertanyaan praktikum array berada di Source Code\PraktikumArray.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-02-19%20104848.png)

**Penjelasan Ringkas**

1. Inisiasi array-array yang dibutuhkan
2. Menggunakan pemilihan if-else untuk menentukan nilai huruf dan nilai setaranya
3. mendapatkan nilai total ip setiap mata kuliah dari perkalian nilai setara dan bobot sks
4. membagi ip dengan 18 untuk mendapatkan ipk
5. menampilkan mk, nilai angka, nilai huruf, nilai setara, dan ipk menggunakan perulangan

## 4. Jawaban Praktikum Fungsi

Source code dari pertanyaan praktikum fungsi berada di Source Code\PraktikumFungsi.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-02-19%20121846.png)

**Penjelasan Ringkas**

1. Membuat 3 fungsi, fungsi tampilPendapatan(), fungsi tampilStock(), dan fungsi main()
2. Pada fungsi main(), buat array stok berisi nilai dari stok setiap bunga setiap cabang
3. Di menu 1 - yaitu menu untuk menampilkan pendapatan tiap cabang dari perhitungan fungsi tampilPendapatan() - buat perulangan untuk memanggil tampilPendapatan() dengan parameter tetap yaitu stok[][] dan parameter yang berubah mengikuti perulangan yaitu i sebagai peubah baris array, dan di dalam perulangannya tambahkan juga totalPendapatan yang nilainya akan bertambah setiap perulangan karena totalPendapatan merupakan variabel global
4. Di menu 2 - yaitu menu untuk menampilkan stok setiap bunga pada cabang 4 setelah dilakukan perubahan dari perhitungan fungsi tampilStok() - buat perulangan untuk memanggil tampilStok() dengan parameter tetap yaitu stok[][] dan parameter yang berubah yaitu i sebagai kondisi peubah stok masing-masing bunga pada cabang ke-4
5. Pada fungsi tampilPendapatan() dengan parameter stok[][] dan i, dilakukan perulangan untuk menyimpan jumlah stok satu cabang untuk dikembalikan ke main()
6. Pada fungsi tampilStok() dengan parameter stok[][] dan i, dilakukan pemilihan pada i ke berapakah fungsi ini dipanggil, jika i == 0 maka stok bunga ke-1 dari cabang ke-4 - yaitu bunga aglonema - dikurangi 1, dan seterusnya

## 5. Jawaban Tugas 1

Source code dari pertanyaan tugas 1 berada di Source Code\Tugas1.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-02-19%20125814.png)

**Penjelasan Ringkas**

1. Buat array kode yang berisi kode plat nomor, dan array kota yang berisi nama kota
2. Membuat scanner untuk input kode plat nomor
3. Membuat perulangan berisi pemilihan dengan kondisi kesamaan antara input dengan kode plat nomor, jika sama, mencetak nama kota dari kode plat nomor itu

## 6. Jawaban Tugas 2

Source code dari pertanyaan tugas 2 berada di Source Code\Tugas2.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-02-19%20131335.png)

**Penjelasan Ringkas**

1. Buat fungsi volumeKubus(), luasPermukaanKubus(), kelilingKubus(), dan main()
2. Pada fungsi main(), buat menu beserta input panjang sisi dari kubus yang akan dihitung, sisi tersebut dijadikan parameter dari setiap fungsi yang akan dipanggil
3. Pada fungsi volumeKubus() dengan parameter sisi, dilakukan perhitungan volume kubus - yaitu sisi^3 - untuk dikembalikan ke main
4. Pada fungsi luasPermukaanKubus() dengan parameter sisi, dilakukan perhitungan luas permukaan kubus - yaitu 6 * sisi^2 - untuk dikembalikan ke main
5. Pada fungsi kelilingKubus() dengan parameter sisi, dilakukan perhitungan keliling kubus - yaitu 12 * sisi - untuk dikembalikan ke main

## 6. Jawaban Tugas 3

Source code dari pertanyaan tugas 3 berada di Source Code\Tugas3.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-02-19%20133520.png)

**Penjelasan Ringkas**

1. buat fungsi berdasarkan fiturnya, yaitu tampilSeluruh(), tampilHari(), tampilSemester(), dan main()
2. pada fungsi main(), input jumlah matakuliah untuk mengetahui panjang array yang dibutuhkan untuk nama matakuliah, sks, semester, dan hari kuliah masing-masing matakuliah. Buat perulangan untuk menginput nilai dari array-array di atas sebanyak jumlah matakuliah.
3. Setelah itu, tampilkan menu dengan pilihan untuk menampilkan jadwal kuliah ataukah untuk mencari matakuliah. Dari pilihan tersebut terdapat lagi pemilihan di dalamnya, dari tampil jadwal kuliah terdapat tampil seluruh jadwal yang memanggil tampilSeluruh(), tampil berdasarkan hari yang memanggil tampilHari(), dan tampil berdasarkan semester yang memanggil tampilSemester(), sedangkan dari pilihan tampil matakuliah hanya menggunakan pemilihan di dalam perulangan untuk mencocokkan input namaCari dengan nama di array namaMK
4. Pada fungsi tampilSeluruh() dengan parameter array-array yang sudah di input pada main(), dilakukan perulangan untuk menampilkan seluruh isi array secara berurutan
5. Pada fungsi tampilHari() dengan parameter yang sama dengan tampilSeluruh() tetapi ditambah hariCari sebagai kondisi pemilihan di dalam perulangan untuk mencari sekaligus menampilkan isi array yang memiliki hari yang sesuai
6. Pada fungsi tampilSemester() dengan parameter yang sama dengan tampilSeluruh() tetapi ditambah semesterCari sebagai kondisi pemilihan di dalam perulangan untuk mencari sekaligus menampilkan isi array yang memiliki semester yang sesuai