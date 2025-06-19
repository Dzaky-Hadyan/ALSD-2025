| | Algoritma dan Struktur Data|
|--|--|
| NIM | Dzaky Hadyan Eliyanta |
| Kelas | TI - 1H |

# Pertemuan 16 Collection

## 1. Praktikum - Implementasi ArrayList

Source code dari kegiatan praktikum ArrayList berada di src/Customer.java dan src/DemoArrayList.java, dan berikut screenshot dari hasilnya

![Screenshot](img/praktikum1.png)

**Jawaban Pertanyaan**

4. Bisa, object dapat ditambahk an meskipun melebihi kapasitas

5. Di akhir collection

6. Dari 0

10. Ya, ArrayList dapat diinstansiasi tanpa harus menentukan size di awal

## 2. Praktikum - Implementasi Stack

Source code dari kegiatan Praktikum - Implementasi Stack berada di src/Book.java dan src/StackDemo.java, dan berikut screenshot dari hasilnya

![Screenshot](img/praktikum1.png)

**Jawaban Pertanyaan**

5. Pengecekan `temp != null` diperlukan agar kita tidak memanggil object kosong 

8. Pencarian elemen pada stack menggunakan method `search()` dilakukan dengan memanggil variable stack of object-nya (pada kasus ini, `books`), kemudian memanggil method `search()` dengan parameter object yang dicari (misal book1). Jadi `books.search(book1);` dan statement tersebut akan mengembalikan index dari object yang dicari, dengan stack memiliki sistem index di mana index 1 berada di paling atas. Dan apabila object yang dicari tidak ditemukan, method akan mengembalikan nilai `-1`

## 3. Praktikum - Implementasi Treeset

Source code dari kegiatan Praktikum - Implementasi Treeset berada di src/TreeSetDemo.java, dan berikut screenshot dari hasilnya

![Screenshot](img/praktikum1.png)

**Jawaban Pertanyaan**

4. Urutan yang ditampilkan berbeda dengan urutan penambahan data ke dalam TreeSet fruits karena class TreeSet jika tidak diberikan argument pada object-nya, akan secara otomatis menyimpan secara lexicographical order

6. Method `first()` mengembalikan nilai pertama pada TreeSet, method `last()` mengembalikan nilai terakhir pada Treeset, method `remove()` mengembalikan nilai object yang dihapus kemudian menghapus object tersebut dari TreeSet, method `pollFirst()` mengembalikan nilai object pertama di TreeSet kemudian menghapus object tersebut dari TreeSet, method `pollLast()` mengembalikan nilai object terakhir di TreeSet kemudian menghapus object tersebut dari TreeSet

## 4. Praktikum - Sorting

Source code dari kegiatan Praktikum - Sorting berada di src/Sorting.java, dan berikut screenshot dari hasilnya

![Screenshot](img/praktikum1.png)
