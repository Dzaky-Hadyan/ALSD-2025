| | Algoritma dan Struktur Data|
|--|--|
| NIM | Dzaky Hadyan Eliyanta |
| Kelas | TI - 1H |

# Pertemuan 10 STACK

## 1. Praktikum Percobaan 1

Source code dari praktikum percobaan 1 berada di Source_Code/Mahasiswa07.java, Source_Code/MahasiswaDemo07.java, dan Source_Code/StackTugasMahasiswa07.java, dan berikut screenshot dari hasilnya

![Screenshot](Image/Screenshot%202025-05-02%20144128.png)
![Screenshot](Image/Screenshot%202025-05-02%20144145.png)

**Jawaban Pertanyaan**

1. Untuk membuat keluaran yang dihasilkan sama dengan verifikasi hasil percobaan, bagian yang perlu diperbaiki adalah bagian fungsi `stack.print()`. Karena pada verifikasi daftar tugasnya ditampilkan secara descending, sedangkan pada kode program dilakukan secara ascending. Berikut adalah perubahannya
```
for(int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
```

2. Data tugas mahasiswa yang dapat ditampung di dalam stack adalah sesuai yang kita masukkan pada saat inisialisasi array of object `StackTugasMahasiswa07`, yaitu `StackTugasMahasiswa07 stack = new StackTugasMahasiswa07(5);`

3. Pengecekan tersebut diperlukan karena jika kita memasukkan data pada stack yang penuh, akan terjadi error ArrayIndexOutOfBoundsException, akibat memanggil di luar array

4. Pada `StackTugasMahasiswa()`
```
public Mahasiswa07 pook() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }
```
Pada `MahasiswaDemo()`
```
case 5:
                    Mahasiswa07 mirsani = stack.pook();
                    if (mirsani != null) {
                        System.out.printf("Tugas pertama dikumpulkan oleh %s", mirsani.nama);
                    }
                    break;
                default:
                System.out.println("Pilihan tidak valid");
            }
        } while (pilih >= 1 && pilih <= 5);
```
5. Pada `StackTugasMahasiswa07()`
```
public void tugasTerkumpul() {
        System.out.printf("%s tugas sudah terkumpul saat ini", top+1);
    }
```
Pada `MahasiswaDemo07()`
```
case 6:
                    stack.tugasTerkumpul();
                    break;
```

2. Praktikum Percobaan 2