| | Algoritma dan Struktur Data|
|--|--|
| NIM | Dzaky Hadyan Eliyanta |
| Kelas | TI - 1H |

# Pertemuan 12 LINKED LIST

## 1. Praktikum Pembuatan Single Linked List

Source code dari praktikum pembuatan single linked list berada di src/Node07.java, src/Mahasiswa07, src/SingleLinkedList0707.java, dan src/SLLMain07.java, dan berikut screenshot dari hasilnya

![Screenshot](img/Screenshot%202025-05-22%20115047.png)

**Jawaban Pertanyaan**

1. Hasil compile kode program di baris pertama menghasilkan "Linked List Kosong" karena pada method `print()` di class `SingleLinkedList07` terdapat pemilihan `!ifEmpty()` yang dimana method tersebut mengecek apakah `head==null` alias linked list kosong, dan class print() mencetak peringatan apabila `!ifEmpty()` false, atau `ifEmpty()` true
2. Variable temp berguna ketika kita ingin mengakses suatu node pada linked list tanpa memindah-mindah `head`-nya, karena titik referensi yang kita punya hanya `head`
3. Berikut modifikasi pada class `SLLMain07`
```
int menu = -1;
        while (menu != 0) {
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Tambah data setelah nama");
            System.out.println("4. Tambah data pada index");
            System.out.println("5. Tampil data");
            System.out.println("0. Keluar");
            System.out.print("Menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            if (menu >= 1 && menu <=4) {
                System.out.print("NIM: ");
                String nim = sc.nextLine();
                System.out.print("Nama: ");
                String nama = sc.nextLine();
                System.out.print("Kelas: ");
                String kelas = sc.nextLine();
                System.out.print("IPK: ");
                Double ip = sc.nextDouble();
                Mahasiswa07 mhs = new Mahasiswa07(nim, nama, kelas, ip);
                switch (menu) {
                    case 1:
                        sll.addFirst(mhs);
                        break;
                    case 2:
                        sll.addLast(mhs);
                        break;
                    case 3:
                        System.out.print("Tambah setelah: ");
                        String key = sc.nextLine();
                        sll.insertAfter(key, mhs);
                        break;
                    case 4:
                        System.out.print("Tambah pada index: ");
                        int idx = sc.nextInt();
                        sll.insertAt(idx, mhs);
                        break;
                    default:
                        System.out.println("Menu invalid");
                        break;
                }
            } else if (menu == 5) {
                sll.print();
            } else if (menu == 0) {
                System.out.println("Terima kasih");
                break;
            }
        }
        sc.close();
```

## 2. Modifikasi Elemen pada Single Linked List

Source code dari praktikum pembuatan single linked list berada di src/Node07.java, src/Mahasiswa07, src/SingleLinkedList0707.java, dan src/SLLMain07.java, dan berikut screenshot dari hasilnya

![Screenshot](img/Screenshot%202025-05-22%20115047.png)

**Jawaban Pertanyaan**

1. Digunakan keyword break pada fungsi `remove()` karena jika sudah ditemukan node yang ingin dihapus pada perulangan while, maka break berguna untuk keluar dari perulangan
2. Kode di atas berguna untuk menyambung node `temp` dengan node setelah yang akan di hapus, atau 2 node setelah temp, secara efektif menghapus referensi dengan node yang dihapus, kemudian memindah tail apabila node selanjutnya tidak ada, atau ketika `next` dari `temp` adalah `null`

## Tugas

Source code dari tugas berada di src/Node07.java, src/Mahasiswa07, src/SingleLinkedList0707.java, dan src/SLLMain07.java, dan berikut screenshot dari hasilnya

![Screenshot](img/Screenshot%202025-05-22%20115047.png)
