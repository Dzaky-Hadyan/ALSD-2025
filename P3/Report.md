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
       void tambahData(Matakuliah07[] arrayOfMatakuliah, int i) {
        Scanner sc = new Scanner(System.in);

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
        sc.close();
       }

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

        System.out.println("Masukkan panjang array: ");
        panjangArray = sc.nextInt();
        Matakuliah07[] arrayOfMatakuliah = new Matakuliah07[panjangArray];
   Kode program yang berkaitan dengan panjang array, seperti pada kondisi perulangan i, disesuaikan menjadi `panjangArray`

## 4. Jawaban Tugas 1

Source code dari tugas 1 berada di Source_Code/Dosen07.java dan Source_Code/DosenDemo07.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-02-27%20114717.png)
![Screenshot](Assets/Screenshot%202025-02-27%20114745.png)

**Alur Program**

1.