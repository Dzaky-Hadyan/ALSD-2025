package P13.src;

import java.util.Scanner;

public class DLLMain07 {
    public static void main(String[] args) {
        DoubleLinkedList07 list = new DoubleLinkedList07();
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah setelah NIM");
            System.out.println("8. Tambah pada indeks");
            System.out.println("9. Hapus setelah NIM");
            System.out.println("10. Hapus pada indeks");
            System.out.println("11. Tampil awal");
            System.out.println("12. Tampil akhir");
            System.out.println("13. Tampil pada indeks");
            System.out.println("14. Tampil jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1 -> {
                    Mahasiswa07 mhs = inputMahasiswa(sc);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa07 mhs = inputMahasiswa(sc);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = sc.nextLine();
                    Node07 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 7 -> {
                    System.out.print("Masukkan NIM: ");
                    String key = sc.nextLine();
                    Mahasiswa07 mhs = inputMahasiswa(sc);
                    list.insertAfter(key, mhs);
                }
                case 8 -> {
                    System.out.print("Masukkan indeks: ");
                    int index = sc.nextInt();sc.nextLine();
                    Mahasiswa07 mhs = inputMahasiswa(sc);
                    list.add(index, mhs);
                }
                case 9 -> {
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    list.removeAfter(nim);
                }
                case 10 -> {
                    System.out.print("Masukkan index: ");
                    int index = sc.nextInt();
                    list.remove(index);
                }
                case 11 -> list.getFirst();
                case 12 -> list.getLast();
                case 13 -> {
                    System.out.print("Masukkan index: ");
                    int index = sc.nextInt();
                    list.get(index);
                }
                case 14 -> list.size();
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan invalid!");
            }
        } while (pilihan != 0);
        sc.close();
    }

    public static Mahasiswa07 inputMahasiswa(Scanner scan) {
        System.out.print("NIM: ");
        String nim = scan.nextLine();
        System.out.print("Nama: ");
        String nama = scan.nextLine();
        System.out.print("Kelas: ");
        String kls = scan.nextLine();
        System.out.print("IPK: ");
        Double ip = scan.nextDouble();
        Mahasiswa07 mhs = new Mahasiswa07(nim, nama, kls, ip);
        return mhs;
    }
}