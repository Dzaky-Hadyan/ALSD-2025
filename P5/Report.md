| | Algoritma dan Struktur Data|
|--|--|
| NIM | Dzaky Hadyan Eliyanta |
| Kelas | TI - 1H |

# Pertemuan 5 BRUTE FORCE DAN DIVIDE CONQUER

## 1. Jawaban Praktikum Percobaan 1

Source code dari pertanyaan praktikum percobaan 1 berada di Source_Code/Faktorial07.java dan Source_Code/MainFaktorial07.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-03-17%20064703.png)

**Jawaban Pertanyaan**

1. Pada bagian if else, jika kondisi true saat `n` mencapai nilai 1, maka fungsi tidak lagi mengulangi pemanggilan dirinya, mengembalikan nilai 1, dan melakukan fase , sedangkan jika kondisi false fungsi mengembalikan `fakto` yang nilainya merupakan perkalian `n` dengan `faktorialDC(n-1)`, sehingga memanggil dirinya sendiri dengan parameter `n-1`
2. Memungkinkan, yaitu dengan menggunakan while.
```
    int fakto = 1, i = 1;
        // for (int i = 1; i <= n; i++) {
        //     fakto = fakto * i;
        // }
        while (i <= n) {
            fakto *= i;
            i++;
        }
```
3. `fakto *= i;` berarti `fakto` memiliki nilai perkalian antara `fakto` dengan `i`, sedangkan `int fakto = n * faktorialDC(n-1);` berarti `fakto` memiliki nili perkalian antara `n` dengan hasil kembalian dari fungsi `faktorialDC(n-1)`
4. method `faktorialBF()` bekerja dengan algoritma *brute force*, yaitu dengan melakukan operasi yang sama berulang-ulang sampai tercapai kondisi yang diinginkan. Seperti, 
```
fakto = 1 * 1
1 = 1 * 2
2 = 2 * 3
6 = 6 * 4
24 = 24 * 5
fakto = 120
```
Sedangkan method `faktorialDC()` bekerja dengan algoritma *divide conquer*, yaitu dengan memanggil dirinya sendiri dan melakukan decrement pada parameter `faktorialDC()` agar sampai pada base case `n == 1`, sehingga membagi operasi tersebut menjadi beberapa bagian kemudian menggabungkan hasilnya. Seperti, 
```
fakto = 5 * faktorialDC(4)
fakto = 5 * (4 * faktorialDC(3))
fakto = 5 * (4 * (3 * faktorialDC(2)))
fakto = 5 * (4 * (3 * (2 * faktorialDC(1))))
fakto = 5 * (4 * (3 * (2 * (1))))
fakto = 120
```

## 2. Jawaban Praktikum Percobaan 2

Source code dari pertanyaan praktikum percobaan 1 berada di Source_Code/Pangkat07.java dan Source_Code/MainPangkat07.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-03-17%20075309.png)

**Jawaban Pertanyaan**

1. method `pangkatBF()` bekerja dengan algoritma *brute force*, sedangkan method `pangkatDC()` bekerja dengan algoritma *divide conquer*
2. Ya, tahap combine sudah termasuk dalam kode tersebut yaitu pada bagian
```
        if (n % 2 == 1) {
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2) * a);
            } else {
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
            }
```
3. Method tersebut tidak relevan untuk memiliki parameter karena class tersebut sudah memiliki atribut yang bisa digunakan. Method tersebut bisa dibuat dengan tanpa parameter, seperti
```
int pangkatBF () {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil = hasil * nilai;
        }
        return hasil;
    }
```
4. method `pangkatBF()` bekerja dengan algoritma *brute force*, yaitu dengan melakukan operasi yang sama berulang-ulang sampai tercapai kondisi yang diinginkan. Seperti, 
```
hasil = 1 * 2
2 = 2 * 2
4 = 4 * 2
hasil = 8
```
Sedangkan method `pangkatDC()` bekerja dengan algoritma *divide conquer*, yaitu dengan memanggil dirinya sendiri berdasarkan kondisi ganjil genapnya `n` dan melakukan decrement pada parameter `pangkatDC()` dengan operasi `n/2` agar sampai base case `n == 1`, sehingga membagi operasi tersebut menjadi beberapa bagian kemudian menggabungkan hasilnya. Seperti, 
```
pangkatDC(2, 3)
pangkatDC(2, 1) * pangkatDC(2, 1) * 2
2 * 2 * 2
8
```
## 3. Jawaban Praktikum Percobaan 3

Source code dari pertanyaan praktikum percobaan 3 berada di Source_Code/Sum07.java dan Source_Code/MainSum07.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-03-17%20113954.png)

**Jawaban Pertanyaan**

1. Dibutuhkan variable `mid` pada method `totalDC()` karena kita membagi array `keuntungan[]` menjadi ukuran terkecilnya
2. Statement terseebut dilakukan dalam `totalDC()` untuk memanggil kembali `totalDC()` secara rekursif dengan parameter nilai yang sudah dibagi 2, agar bisa mencapai base case dengan nilai `l` dan `r` yang sama
3. `return lsum + rsum` berperan sebagai combine, untuk menjumlahkan hasil pemanggilan `arr[l]` dari setiap pemanggilan `totalDC()`
4. Base case dari `totalDC()` adalah ketika nilai `l` sama dengan nilai `r` pada pemanggilan tersebut
5. Method `totalDC()` bekerja dengan algoritma *divide conquer*, yaitu dengan memanggil dirinya sendiri dengan parameter, yang nantinya akan digunakan sebagai index array keuntungan[], terus dibagi menjadi 2, sampai pada base case nilai `l` sama dengan `r`, sehingga membagi operasi tersebut menjadi beberapa bagian kemudian menggabungkan hasilnya pada `return lsum + rsum`. Seperti, 
```
totalDC(keuntungan[], 0, 4)
      mid = (0 + 4)/2 = 2
      lsum = totalDC(keuntungan[], 0, 2)
              mid = (0 + 2)/2 = 1
              lsum = totalDC(keuntungan[], 0, 1)
                      mid = (0 + 1)/2 = 0
                      lsum = totalDC(keuntungan[], 0, 0)
                              keuntungan[0]
                      rsum = totalDC(keuntungan[], 1, 1)
                              keutungan[1]
              rsum = totalDC(keuntungan[], 2, 2)
                      keuntungan[2]
      rsum = totalDC(keuntungan[], 3, 4)
              mid = (3 + 4)/2 = 3
              lsum = totalDC(keuntungan[], 3, 3)
                      keuntungan[3]
              rsum = totalDC(keuntungan[], 4, 4)
                      keuntungan[4]
```

## 4. Jawaban Latihan Praktikum

Source code dari latihan praktikum berada di Source_Code/Latihan07.java dan Source_Code/MainLatihan07.java, dan berikut screenshot dari hasilnya

![Screenshot](Assets/Screenshot%202025-03-20%20093139.png)

**Alur Program**

1. Pada file Latihan07.java, buat class `Latihan07` dengan attribute `String nama`, dan `int nilaiUTS, nilaiUAS, tertinggiUTS`
2. Buat constructor ber-parameter dengan parameter berupa attribute class
3. Buat method `int tertinggiUTSDC(int arr[], int l, int r)`, `int terendahUTSDC(int arr[], int l, int r)`, dan `double rerataUASBF(Latihan07[] mahasiswa)`
4. Method `tertinggiUTSDC()` dan `terendahUTSDC()` bekerja dengan algoritma yang sama, yaitu *divide conquer*. Method akan memanggil dirinya sendiri dengan parameter `l` dan `r` yang berperan sebagai indikator pembagi index array `arr[]` dengan parameter `mid` sebagai indikator pemisah antara `l` dan `r`, sehingga membagi operasi tersebut menjadi beberapa bagian kemudian terus membandingkan hasil setiap pemanggilan menggunakan pemilihan, pada `tertinggiUTSDC()` menggunakan `lhighest > rhighest` sedangkan pada `terendahUTSDC()` menggunakan `llowest < rlowest`, dan mengembalikan hasilnya, sehingga secara tidak langsung meliputi bagian combine dari fungsi rekursi
5. Pada file MainLatihan07.java, buat class `DosenDemo07`, dan tambahkan class main
6. Inisialisasi array `int[] nilaiUTS` yang berperan sebagai tempat penyimpanan nilai uts setiap mahasiswa, dan `Latihan07[] mahasiswa` yang berperan sebagai tempat penyimpanan array of object yang berisi object dari setiap mahasiswa
7. Lakukan instansiasi untuk ke-8 mahasiswa sembari mengisi parameter `nama`, `nilaiUTS`, dan `nilaiUAS`
8. Buat perulangan untuk mengisi array `nilaiUTS[]` dengan nilai UTS dari array of object `mahasiswa[]`
9. Panggil method dari mahasiswa, yaitu `tertinggiUTSDC()`, `terendahUTSDC()`, dan `rerataUASBF()` dengan parameternya masing-masing. Di sini saya menggunkan `mahasiswa[0]` untuk memanggil method dari mahasiswa karena `mahasiswa[]` merupakan array, sehingga harus disertakan index yang dipanggil. Tetapi sejatinya tidak berpengaruh pada pemanggilan method-nya karena parameter yang saya gunakan tidak berasal dari atribut object tertentu di array `mahasiswa[]`, melainkan menggunakan semua nilai UTS dan nilai UAS dari semua anggota array `mahasiswa[]`