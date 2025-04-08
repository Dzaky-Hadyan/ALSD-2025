package P7.Source_Code;

import java.util.Scanner;

public class MahasiswaDemo07 {
    public static void main(String[] args) {
        MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07();
        Scanner sc = new Scanner(System.in);
        int jumMhhs = 5;

        for (int i = 0; i < jumMhhs; i++) {
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
            System.out.println("------------------------------");
            list.tambah(new Mahasiswa07(nim, nama, kelas, ipk));
        }

        list.tampil();
        //melakakukan pencarian data sequential
        System.out.println("-------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}