| | Algoritma dan Struktur Data|
|--|--|
| NIM | Dzaky Hadyan Eliyanta |
| Kelas | TI - 1H |

# Pertemuan 6 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

## 1. Jawaban Praktikum Percobaan 1

Source code dari pertanyaan praktikum percobaan 1 berada di Source_Code/Sorting07.java dan Source_Code/SortingMain07.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-03-20%20110220.png)

**Jawaban Pertanyaan**

1. Fungsi kode program tersebut adalah 
2. Kode program yang merupakan algoritma pencarian nilai minimum pada selection sort adalah
```
for (int j = i + 1; j < jumData; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
```
3. Maksud dari kondisi pada perulangan tersebut adalah perulangan tersebut terjadi selama jika dan hanya jika nilai `j` lebih dari negatif dan nilai data pada indeks ke `j` lebih dari nilai `temp`
4. Tujuan dari perintah tersebut adalah untuk "menggeser" nilai pada index `j` ke sebelah kanan dengan cara menyalin nilainya

## 2. Jawaban Praktikum Percobaan 2

Source code dari pertanyaan praktikum percobaan 2 berada di Source_Code/Mahasiswa07.java, Source_Code/MahasiswaBerprestasi07.java, dan Source_Code/MahasiswaDemo07.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-03-20%20113528.png)
![Screenshot](Assets/Screenshot%202025-03-21%20041313.png)

**Jawaban Pertanyaan 5.3.4**

1. a. Syarat dari perulangan `i` adalah `i<listMhs.length-1` karena perulangan dimulai dari index `i = 0`, sehingga mencegah kita mengakses array index yang tidak ada  
b. Syarat dari perulangan `j` adalah `j<listMhs.length-i` agar inner loop nya berlangsung semakin sedikit semakin outer loop nya berulang. Jadi dalam 6 kali outer loop, inner loop nya akan berjalan 6, 5, 4, 3, 2, dan 1 kali perulangan. Hal ini dikarenakan kita mengurutkan data dari belakang array      
c. Perulangan `i` akan berlangsung 49 kali, dan ada 48 tahap bubble sort yang ditempuh
2. Modifikasi untuk input data saya sertakan di Source_Code/MahasiswaDemo07.java dengan menambahkan perulangan scanner

**Jawaban Pertanyaan 5.3.7**

1. Proses tersebut digunakan untuk mencari index dengan nilai data terkecil dengan membandingkan nilai `ipk` dari array di index `j` dengan array di index `idxMin` yang nilai awalnya yaitu `i`, dari index ke `i+1` sampai akhir array, untuk kemudian disimpan indexnya ke `idxMin` jika ditemukan

**Jawaban Pertanyaan 5.4.3**

1. Modifikasi untuk insertionSort descending saya sertakan di Source_Code/MahasiswaBerprestasi07.java dengan mengubah kondisi while nya menjadi `j > 0 && listMhs[j - 1].ipk < temp.ipk`

## 3. Jawaban Latihan Praktikum

Source code dari latihan praktikum berada di Source_Code/Dosen07.java, Source_Code/DosenDemo07.java, dan Source_Code/DataDosen07.java

**Alur Program**

1. File Dosen07.java berisi class `Dosen07` yang digunakan untuk menyimpan objek dosen (satuan) beserta atribut-atributnya, yaitu `kode`, `nama`, `jenisKelamin`, dan `usia`
2. class Dosen07 juga memiliki method `tampil()` yang berfungsi untuk menampilkan informasi dosen (satuan) menggunakan sout
3. File DataDosen07.java berisi class DataDosen07 yang memiliki atribut array of object `dataDosen[]` dengan tipe data `Dosen07`, array inilah yang akan kita gunakan untuk menyimpan kumpulan instansiasi dari class `Dosen07` (array)
4. class DataDosen07 juga memiliki berbagai method yang berfungsi untuk memanipulasi `dataDosen[]`. Seperti `tambah()` yang berfungsi untuk mengisi `dataDosen[]` dengan instansiasi `Dosen07`, `tampil()` yang berfungsi untuk menampilkan elemen dari `dataDosen[]` dengan melakukan perulangan pada pemanggilan method `dsn.tambah()` (memanggil method tambah() milik class Dosen07 atau yang kita panggil sebagai dsn), `sortingASC()` yang berfungsi untuk mengurutkan data pada `dataDosen[]` secara ascending/meningkat berdasarkan usia dengan menggunakan bubble sort, hal ini dapat dilakukan dengan menggunakan nested loop dengan panjang outer loop dan inner loop yang sama namun index inner loop berada di depan outer loop dan terdapat pemilihan di dalam inner loop tersebut (`if (dataDosen[j].usia < dataDosen[j - 1].usia)`) untuk menukar nilai saat ini dengan nilai sebelahnya apabila nilai tersebut lebih kecil
5. Kemudian terdapat juga `sortingDSC()` yang berfungsi untuk mengurutkan data pada `dataDosen[]` secara descending/menurun berdasarkan usia dengan menggunakan selection sort, hal ini dapat dilakukan dengan menggunakan nested loop dengan panjang outer loop dan inner loop yang sama namun index inner loop berada di depan outer loop karena akan dibandingkan nilai antara index `i` dan `j` sebelahnya, apabila `j` lebih besar maka ditukar, dan jika tidak inner loop akan terus berjalan membandingkan sampai elemen terakhir `dataDosen[]`
6. Terakhir, terdapat `insertionSort()` yang berfungsi untuk mengurutkan data pada `dataDosen[]` secara ascending/meningkat berdasarkan usia dengan menggunakan insertion sort, hal ini dapat dilakukan dengan menggunakan nested loop for dan while, dengan index outer loop = 1 karena index ke-0 dianggap bagian terurut. Kemudian membandingkan nilai-nilai di kanannya menggunakan perulangan while dan sekaligus terus menukarnya dengan nilai di bagian sorted yang lebih kecil