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
3. 