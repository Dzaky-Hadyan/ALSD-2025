| | Algoritma dan Struktur Data|
|--|--|
| NIM | Dzaky Hadyan Eliyanta |
| Kelas | TI - 1H |

# Pertemuan 7 SEARCHING

## 1. Jawaban Praktikum Percobaan Sequential Search

Source code dari pertanyaan praktikum percobaan sequential search berada di Source_Code/Mahasiswa07.java, Source_Code/MahasiswaDemo07.java, dan Source_Code/MahasiswaBerprestasi07.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-04-08%20094917.png)
![Screenshot](Assets/Screenshot%202025-04-08%20102054.png)

**Jawaban Pertanyaan**

1. `tampilDataSearch()` dan `tampilPosisi()` memiliki perbedaan pada apa yang di-printnya. `tampilPosisi()` mengeprint indeks dari data yang dicari, sedangkan `tampilDataSearch()` mengeprint data yang dicari
2. `break` pada kode program tersebut berfungsi untuk menghentikan perulangan ketika ipk pada index `j` sama dengan ipk yang dicari, atau dengan kata lain ketika data yang dicari ditemukan

## 2. Jawaban Praktikum Percobaan Binary Search

Source code dari pertanyaan praktikum percobaan sequential search berada di Source_Code/Mahasiswa07.java, Source_Code/MahasiswaDemo07.java, dan Source_Code/MahasiswaBerprestasi07.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-04-08%20105627.png)
![Screenshot](Assets/Screenshot%202025-04-08%20105709.png)
![Screenshot](Assets/Screenshot%202025-04-08%20105751.png)

**Jawaban Pertanyaan**

1. Kode program yang mana proses divide dijalankan terletak pada 
```
mid = (left + right)/2;
```
2. Kode program yang mana proses conquer dijalankan terletak pada
```
if (cari == listMhs[mid].ipk) {
                return (mid);
            }
```
3. Program masih dapat berjalan, tetapi data yang dicari bisa jadi tidak dapat ditemukan, karena program bekerja dengan cara membandingkan nilai dicari dengan `mid`. Jika tidak sama, melihat apakah `mid` lebih besar/kecil dari yang dicari. Jika lebih besar maka pencarian dibawa ke sisi kanan/index yang lebih besar, namun jika lebih kecil maka pencarian dibawa ke sisi kiri/index yang lebih kecil. Namun, jika nilai ipk pada array tidak urut, maka bisa saja nilai yang dicari tidak berada pada sisi pencarian tersebut berjalan
4. Hasil dari binary search tidak sesuai, karena data tidak ditemukan. Hal ini dikarenakan program tersebut hanya sesuai jika data tersusun secara ascending. Kode program untuk hasil yang sesuai bisa didapatkan hanya dengan membalik `return findBinarySearch(cari, left, mid-1);` dan `return findBinarySearch(cari, mid+1, right);`. Kodenya saya letakkan pada Source_Code/MahasiswaDemo07.java
5. Saya tambahkan kode di bawah pada Source_Code/MahasiswaDemo07.java
```
System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07(jumMhs);
```
dan Source_Code/MahasiswaBerprestasi07.java
```
Mahasiswa07 listMhs[];

    MahasiswaBerprestasi07(int jumMhs) {
        listMhs = new Mahasiswa07[jumMhs];
    }
```

## 3. Jawaban Latihan Praktikum

Source code dari latihan praktikum berada di Source_Code/Dosen07.java, Source_Code/DosenDemo07.java, dan Source_Code/DataDosen07.java

**Alur Program**

1. Dikarenakan file-file yang digunakan ini merupakan salinan dari file di P6, maka bagian yang saya jelaskan adalah bagian yang baru dari P7 ini yaitu bagian searching
2. File Dosen07.java tidak mengalami modifikasi/penambahan
3. File DataDosen07.java mengalami modifikasi di mana class `DataDosen07` memiliki method baru, yaitu `int PencarianDataSequential07()` dengan parameter nama dosen yang dicari (`String cari`), `int PencarianDataBinary07()` dengan parameter nilai usia yang dicari (`int cari`), dan nilai index divide dari proses binary search (`int left, int right`)
4. `int PencarianDataSequential07(String cari)` berfungsi untuk mencari data pada array yang tidak terurut menggunakan sequential search. Hal ini dapat dilakukan secara brute force, yaitu dengan melakukan perulangan untuk membandingkan (`if (dataDosen[j].nama.equalsIgnoreCase(cari))`) satu persatu data dari ujung array dengan data yang dicari, modifikasi yang saya lakukan adalah dengan tidak langsung mengembalikan nilai index dimana data ditemukan, tetapi menyimpan nilai itu dan melanjutkan perulangan sampai akhir. Sehingga apabila ditemukan index dengan data yang sama, program akan mengembalikan -2 sebagai penanda bahwa hasil pencarian lebih dari 1
5. `int PencarianDataBinary07(int cari, int left, int right)` berfungsi untuk mencari data pada array yang terurut baik ascending/descending menggunakan sequential search. Hal ini dapat dilakukan menggunakan algoritma divide & conquer, yaitu dengan membandingkan nilai yang dicari dengan nilai index tengah dari `dataDosen[]` (`if (cari == dataDosen[mid].usia)`). Apabila nilai sama/sesuai, nilai tersebut dibandingkan lagi dengan index di depan dan belakangnya. Apabila nilai sama/sesuai lagi, maka program mengembalikan -2 sebagai penanda bahwa hasil pencarian lebih dari 1. Dan apabila nilai tidak sama, maka program akan mengembalikan `mid` sebagai posisi index data sesuai. Sedangkan apabila pada pemilihan pertama data pada `mid` tidak sama dengan data yang dicari, maka dilakukan pemilihan lagi. Apabila data pada `dataDosen[mid]` lebih besar dari data yang dicari, maka program akan melakukan recursion call ke arah kiri index (jika data ascending), yaitu dengan memanggil kembali fungsi tetapi menggunakan nilai `mid-1` sebagai parameter `int right` nya agar program mengecek nilai tengah pada sisi kiri sehingga "membagi" array tersebut. Sedangkan apabila data pada `dataDosen[mid]` lebih kecil dari data yang dicari, maka program akan melakukan recursion call ke arah kanan index (jika data ascending), yaitu dengan memanggil kembali fungsi tetapi menggunakan nilai `mid+1` sebagai parameter `int left` nya agar program mengecek nilai tengah pada sisi kanan