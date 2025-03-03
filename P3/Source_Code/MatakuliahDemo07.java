package P3.Source_Code;

import java.util.Scanner;

public class MatakuliahDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama;
        int sks, jumlahJam, panjangArray;

        System.out.print("Masukkan panjang array: ");
        panjangArray = sc.nextInt();
        sc.nextLine();
        Matakuliah07[] arrayOfMatakuliah = new Matakuliah07[panjangArray];

        // for (int i = 0; i < panjangArray; i++) {
        //     System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
        //     System.out.print("Kode       : ");
        //     kode = sc.nextLine();
        //     System.out.print("Nama       : ");
        //     nama = sc.nextLine();
        //     System.out.print("SKS        : ");
        //     sks = sc.nextInt();
        //     sc.nextLine();
        //     System.out.print("Jumlah Jam : ");
        //     jumlahJam = sc.nextInt();
        //     sc.nextLine();
        //     System.out.println("-----------------------------");

        //     arrayOfMatakuliah[i] = new Matakuliah07(kode, nama, sks, jumlahJam);
        // }

        // for (int i = 0; i < panjangArray; i++) {
        //     System.out.println("Data Matakuliah ke-" + (i + 1));
        //     System.out.println("Kode       : " + arrayOfMatakuliah[i].kode);
        //     System.out.println("Nama       : " + arrayOfMatakuliah[i].nama);
        //     System.out.println("SKS        : " + arrayOfMatakuliah[i].sks);
        //     System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam);
        //     System.out.println("-----------------------------");
        // }

        for (int i = 0; i < panjangArray; i++) {
            arrayOfMatakuliah[i] = new Matakuliah07();
            arrayOfMatakuliah[i].tambahData(arrayOfMatakuliah, i);
        }

        for (int i = 0; i < panjangArray; i++) {
            arrayOfMatakuliah[i].cetakInfo(arrayOfMatakuliah, i);
        }
        sc.close();
    }
}