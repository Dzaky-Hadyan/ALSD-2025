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
                // case 3 -> list.removeFirst();
                // case 4 -> list.removeLast();
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