| | Algoritma dan Struktur Data|
|--|--|
| NIM | Dzaky Hadyan Eliyanta |
| Kelas | TI - 1H |

# Pertemuan 3 ARRAY OF OBJECT

## 1. Jawaban Praktikum Percobaan 1

Source code dari pertanyaan praktikum percobaan 1 berada di Source_Code/Mahasiswa07.java dan Source_Code/MahasiswaDemo07.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-02-27%20102014.png)

**Jawaban Pertanyaan**

1. Tidak, class yang akan dibuat array of object bisa hanya memiliki atribut, hanya memiliki method, maupun tidak memiliki apapun
2. Kode program tersebut menginisiasi array `arrayOfMahasiswa` dengan tipe data `Mahasiswa[]` dan panjang 3
3. Tidak, class `Mahasiswa` tidak memiliki konstruktor, namun bisa dilakukan pemanggilan konstruktor karena java secara otomatis memberikan konstruktor default ke class yang tidak diberi konstruktor
4. Kode program tersebut menginstansiasi/membentuk object `arrayOfMahasiswa[0]` dari class `Mahasiswa()` kemudian mengisi nilai atribut-atributnya secara manual
5. Class `Mahasiswa` dan `MahasiswaDemo` dipisahkan pada uji coba 3.2 karena class public harus memiliki nama yang sama dengan nama file, sedangkan classnya harus kita pisahkan karena kita membuat class `Mahasiswa` non-static, jadi hanya bisa dipanggil oleh class lain, yang berada di file lain

## 2. Jawaban Praktikum Percobaan 2

Source code dari pertanyaan praktikum percobaan 2 berada di Source_Code/Mahasiswa07.java dan Source_Code/MahasiswaDemo07.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-02-27%20105328.png)
![Screenshot](Assets/Screenshot%202025-02-27%20105746.png)

**Jawaban Pertanyaan**

1.     //pada class Mahasiswa07
        public void cetakInfo(Mahasiswa07[] arrayOfMahasiswa, int i) {
        System.out.println("Data Mahasiswa ke-" + (i + 1));
        System.out.println("NIM     : "+ arrayOfMahasiswa[i].nim);
        System.out.println("Nama    : "+ arrayOfMahasiswa[i].nama);
        System.out.println("Kelas   : "+ arrayOfMahasiswa[i].kelas);
        System.out.println("IPK     : "+ arrayOfMahasiswa[i].ipk);
        System.out.println("-------------------------------");
       }

        //Pada class MahasiswaDemo07
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i].cetakInfo(arrayOfMahasiswa, i);
        }
2. Karena `Mahasiswa[] myArrayOfMahasiswa = new Mahasiswa[3]` hanya menginisiasi array `myArrayOfMahasiswa` dengan tipe data `Mahasiswa[]` dan panjang 3, tetapi tidak menginstansiasi objek yang menjadi isi dari array tersebut dengan `myArrayOfMahasiswa[0] = new Mahasiswa()`

## 3. Jawaban Praktikum Percobaan 3

Source code dari pertanyaan praktikum percobaan 3 berada di Source_Code/Matakuliah07.java dan Source_Code/MatakuliahDemo07.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-02-27%20114717.png)
![Screenshot](Assets/Screenshot%202025-02-27%20114745.png)

**Jawaban Pertanyaan**

1. Ya, suatu class dapat memiliki lebih dari 1 contructor, contohnya terdapat pada P2/Source_Code/Dosen07.java di mana saya menggunakan constructor default dan constructor berparameter, kemudian memanggil keduanya pada P2/Source_Code/DosenMain07.java
2.     //Pada class Matakuliah07
       Scanner sc = new Scanner(System.in);
       void tambahData(Matakuliah07[] arrayOfMatakuliah, int i) {

        System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
        System.out.print("Kode       : ");
        arrayOfMatakuliah[i].kode = sc.nextLine();
        System.out.print("Nama       : ");
        arrayOfMatakuliah[i].nama = sc.nextLine();
        System.out.print("SKS        : ");
        arrayOfMatakuliah[i].sks = sc.nextInt();
        sc.nextLine();
        System.out.print("Jumlah Jam : ");
        arrayOfMatakuliah[i].jumlahJam = sc.nextInt();
        sc.nextLine();
        System.out.println("-----------------------------");
       }
       sc.close();

       //Pada class MatakuliahDemo07
       for (int i = 0; i < 3; i++) {
            arrayOfMatakuliah[i] = new Matakuliah07();
            arrayOfMatakuliah[i].tambahData(arrayOfMatakuliah, i);
       }
3.     //Pada class Matakuliah07
       public void cetakInfo(Matakuliah07[] arrayOfMatakuliah, int i) {
        System.out.println("Data Matakuliah ke-" + (i + 1));
        System.out.println("Kode       : " + arrayOfMatakuliah[i].kode);
        System.out.println("Nama       : " + arrayOfMatakuliah[i].nama);
        System.out.println("SKS        : " + arrayOfMatakuliah[i].sks);
        System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam);
        System.out.println("-----------------------------");
       }

       //Pada class MatakuliahDemo07
       for (int i = 0; i < 3; i++) {
       arrayOfMatakuliah[i].cetakInfo(arrayOfMatakuliah, i);
       }
4.     int sks, jumlahJam, panjangArray;

        System.out.print("Masukkan panjang array: ");
        panjangArray = sc.nextInt();
        Matakuliah07[] arrayOfMatakuliah = new Matakuliah07[panjangArray];
   Kode program yang berkaitan dengan panjang array, seperti pada kondisi perulangan i, disesuaikan menjadi `panjangArray`

## 4. Jawaben Tugas 1

Source code dari tugas 1 berada di Source_Code/Dosen07.java dan Source_Code/DosenDemo07.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-03-05%20131247.png)

**Alur Program**

1. Pada file Dosen07.java, buat class `Dosen07` dengan attribute `String kode, nama`, `Boolean jenisKelamin`, dan `int usia`
2. Buat constructor ber-parameter dengan parameter berupa attribute class
3. Pada file DosenDemo07.java, buat class `DosenDemo07`, dan tambahkan class main untuk menginput dan memanggil data dari class Dosen07
4. Inisiasi/mendeklarasikan array `arrayOfDosen[]` dengan tipe data `Dosen07` dan variabel `dummy` dengan tipe data `String`
5. Buat perulangan for untuk menginput data ke `arrayOfDosen[]`, dan khusus bagian `jenisKelamin` gunakan pemilihan jika pria maka true dan sebaliknya
6. Buat perulangan foreach untuk mencetak isi `arrayOfDosen[]`

## 5. Jawaban Tugas 2

Source code dari tugas 2 berada di Source_Code/Dosen07.java, Source_Code/DosenDemo07.java, dan Source_Code/DataDosen07.java dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-03-05%20151938.png)
![Screenshot](Assets/Screenshot%202025-03-05%20152032.png)

**Alur Program**

1. Pada file DataDosen07.java, buat class `DataDosen07` yang tidak memiliki attribute dan hanya memiliki method untuk dipanggil pada class `DosenDemo07`
2. Buat method `static void dataSemuaDosen(Dosen07[] arrayOfDosen)` yang berisi perulangan untuk menampilkan data semua dosen untuk dicetak di luar perulangan
3. Buat method `static void jumlahDosenPerJenisKelamin(Dosen07[] arrayOfDosen)` yang berisi pemilihan counter pria dan wanita di dalam perulangan untuk dicetak 
4. Buat method `static void rerataUsiaDosenPerJenisKelamin(Dosen07[] arrayOfDosen)` yang berisi variabel counter pria dan wanita, dan variabel penyimpan nilai total usia pria dan wanita. Kemudian membuat perulangan untuk mencari dari `arrayOfDosen[]` yang diseleksi berdasarkan `jenisKelamin` nya, kemudian disimpan nilai usia dan index `jenisKelamin` terkait ke variabel jumlah dan counter. Selanjutnya mencetak hasil pembagian dari jumlah usia pria dan wanita masing-masing dengan index kelamin terkait
5. Buat method `static void infoDosenPalingTua(Dosen07[] arrayOfDosen)` berisi perulangan yang di dalamnya terdapat pemilihan untuk menemukan dosen dengan usia tertua dengan indexnya. Kemudian ditampilkan data dari `arrayOfDosen[]` tertua dengan index terkait
6. Buat method `static void infoDosenPalingMuda(Dosen07[] arrayOfDosen)` berisi perulangan yang di dalamnya terdapat pemilihan untuk menemukan dosen dengan usia termuda dengan indexnya. Kemudian ditampilkan data dari `arrayOfDosen[]` termuda dengan index terkait