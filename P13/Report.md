| | Algoritma dan Struktur Data|
|--|--|
| NIM | Dzaky Hadyan Eliyanta |
| Kelas | TI - 1H |

# Pertemuan 13 Double Linked List

## 1. Praktikum Percobaan 1

Source code dari praktikum percobaan 1 berada di src/Node07.java, src/Mahasiswa07, src/DoubleLinkedList07.java, dan src/DLLMain07.java, dan berikut screenshot dari hasilnya

![Screenshot](img/Screenshot%202025-05-26%20114745.png)

**Jawaban Pertanyaan**

1. Perbedaan antara single linked list dengan double linked list ialah single linked list hanya memiliki 1 pointer, yaitu `next`, sehingga ketika menggunakan single linked list kita hanya bisa untuk mengakses data secara satu arah, sedangkan double linked list memiliki 2 pointer, yaitu `next` dan `prev`, sehingga ketika menggunakan double linked list kita bisa untuk mengakses data dua arah

2. Kedua atribut digunakan untuk mengakses node sebelum dan setelah node sekarang

3. konstruktor tersebit berguna untuk menginstansiasi object dari class `DoubleLinkedList01` dengan atribut `head` dan `tail` null karena belum merujuk ke node manapun

4. Kode tersebut memanggil method `isEmpty()` dan apabila mengembalikan nilai true akan assign nilai `newNode` ke head dan tail

5. Statement tersebut meng-assign nilai `newNode` ke atribut `prev` dari `head`, essentially menyambungkan newNode dengan head

6. 
```
if (isEmpty()) {
            System.out.println("Linked List kosong!");
        } else {
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
```

7. Kode tersebut merupakan statement untuk meng-assign `prev` dari `next`-nya `current`, atau `prev` dari node setelah `current`, dengan `newNode`, sehingga menghubungkan `newNode` dengan node setelah current

8. 
```
                case 7 -> {
                    System.out.print("Masukkan NIM: ");
                    String key = sc.nextLine();
                    Mahasiswa07 mhs = inputMahasiswa(sc);
                    list.insertAfter(key, mhs);
                }
```

## 2. Praktikum Percobaan 2

Source code dari praktikum percobaan 2 berada di src/Node07.java, src/Mahasiswa07, src/DoubleLinkedList07.java, dan src/DLLMain07.java, dan berikut screenshot dari hasilnya

![Screenshot](img/Screenshot%202025-05-28%20204534.png)

**Jawaban Pertanyaan**

1. Statement `head = head.next;` meng-assign `head` dengan `next` dari `head`, sehingga memindah head ke node setelahnya, sedangkan statement `head.prev = null;` meng-assign `prev` dari `head` dengan null, sehingga menghapus referensi dari `head` kepada node tersebut

2. Pada `removeFirst()`
```
} else {
            System.out.printf("Data sudah berhasil dihapus. Data yang terhapus adalah %s", head.data.nama);
            head = head.next;
            head.prev = null;
        }
```
Pada `removeLast()`
```
        } else {
            System.out.printf("Data sudah berhasil dihapus. Data yang terhapus adalah %s", tail.data.nama);
            tail = tail.prev;
            tail.next = null;
        }
```

## Tugas

Source code dari tugas berada di src/Node07.java, src/Mahasiswa07, src/DoubleLinkedList07.java, dan src/DLLMain07.java, dan berikut screenshot dari hasilnya

![Screenshot](img/Screenshot%202025-05-29%20114003.png)
![Screenshot](img/Screenshot%202025-05-29%20114055.png)
![Screenshot](img/Screenshot%202025-05-29%20114132.png)
![Screenshot](img/Screenshot%202025-05-29%20114157.png)
![Screenshot](img/Screenshot%202025-05-29%20114229.png)