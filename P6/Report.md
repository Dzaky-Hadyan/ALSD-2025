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