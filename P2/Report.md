| | Algoritma dan Struktur Data|
|--|--|
| NIM | Dzaky Hadyan Eliyanta |
| Kelas | TI - 1H |

# Pertemuan 2 OBJECT

## 1. Jawaban Praktikum Percobaan 1

Source code dari pertanyaan praktikum percobaan 1 berada di Source_Code/Mahasiswa07.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-02-21%20160513.png)

**Jawaban Pertanyaan**

1. Karakteristik dari class atau object adalah attribute dan method
2. 4; nama, nim, ipk, dan kelas
3. 4; `tampilkanInformasi()`, `ubahKelas()`, `updateIpk()`, dan `nilaiKinerja()`
4.      void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }
5. method `nilaikerja()` bekerja dengan menggunakan pemilihan dan kriteria atau kondisi yang menentukan keluarannya adalah nilai ipk. Jika `ipk >= 3.5`, mengembalikan `"Kinerja sangat baik"`, sedangkan jika `ipk >= 3.0 `, mengembalikan `"Kinerja baik"`, et cetera

## 2. Jawaban Praktikum Percobaan 2

Source code dari pertanyaan praktikum percobaan 2 berada di Source_Code/MahasiswaMain07.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-02-21%20161820.png)

**Jawaban Pertanyaan**

1.     Mahasiswa07 mhs1 = new Mahasiswa07();
Nama object yang dihasilkan adalah mhs1  
2. `<namaObject>.<namaAtribut>` dan `<namaObject>.<namaMethod(tipeData namaParameter)>`  
3. Karena setelah pemanggilan method `tampilkanInformasi()` pertama dipanggil method `ubahKelas()` dan `updateIpk()` yang mengubah nilai atribut `kelas` dan `ipk` dari object `mhs1`

## 3. Jawaban Praktikum Percobaan 3

Source code dari pertanyaan praktikum percobaan 3 berada di Source_Code/Mahasiswa07.java dan Source_Code/MahasiswaMain07.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-02-21%20163526.png)

**Jawaban Pertanyaan**

1.     public Mahasiswa07(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
       }
2. Yang dilakukan pada baris program tersebut adalah menginstansiasi pembuatan object mhs2 dari class Mahasiswa ber-parameter, jadi object dibuat dengan memiliki nilai-nilai atribut
3. Hasilnya adalah terjadi error karena konstruktor Mahasiswa07() tidak terdefinisi. Jika kita menghapus konstruktor default, yang terpanggil adalah konstruktor ber-parameter, sehingga menyebabkan instansiasi yang kita lakukan mengalami error karena parameternya kosong
4. Tidak, karena method di dalam class hanya dapat diakses ketika dipanggil setelah instansiasi
5.     Mahasiswa07 mhsDzaky = new Mahasiswa07("Dzaky Hadyan Eliyanta", "244107020117", 3.86, "TI 1H");   
