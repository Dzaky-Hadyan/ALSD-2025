package P6.Source_Code;

import java.util.Scanner;

public class MahasiswaDemo07 {
    public static void main(String[] args) {
        //modifikasi pertanyaan 5.3.4 no. 2
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07();
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("--------------------------------");
            list.tambah(new Mahasiswa07(nim, nama, kelas, ipk));
        }
        // Mahasiswa07 m1 = new Mahasiswa07("123", "Zidan", "2A", 3.2);
        // Mahasiswa07 m2 = new Mahasiswa07("123", "Ayu", "2A", 3.5);
        // Mahasiswa07 m3 = new Mahasiswa07("123", "Sofi", "2A", 3.1);
        // Mahasiswa07 m4 = new Mahasiswa07("123", "Sita", "2A", 3.9);
        // Mahasiswa07 m5 = new Mahasiswa07("123", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
        sc.close();
    }
}