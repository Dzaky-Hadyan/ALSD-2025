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