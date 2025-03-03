package P3.Source_Code;

import java.util.Scanner;

public class Matakuliah07 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah07() {

    }

    public Matakuliah07(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(Matakuliah07[] arrayOfMatakuliah, int i) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
        System.out.print("Kode       : ");
        arrayOfMatakuliah[i].kode = sc.nextLine();
        System.out.print("Nama       : ");
        arrayOfMatakuliah[i].nama = sc.nextLine();
        System.out.print("SKS        : ");
        arrayOfMatakuliah[i].sks = sc.nextInt();
        sc.nextLine();
        System.out.print("Jumlah Jam : ");
        arrayOfMatakuliah[i].jumlahJam = sc.nextInt();
        sc.nextLine();
        System.out.println("-----------------------------");
        sc.close();
    }

    public void cetakInfo(Matakuliah07[] arrayOfMatakuliah, int i) {
        System.out.println("Data Matakuliah ke-" + (i + 1));
        System.out.println("Kode       : " + arrayOfMatakuliah[i].kode);
        System.out.println("Nama       : " + arrayOfMatakuliah[i].nama);
        System.out.println("SKS        : " + arrayOfMatakuliah[i].sks);
        System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam);
        System.out.println("-----------------------------");
    }
}
