package P6.Source_Code;

import java.util.Scanner;

public class DosenDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen07 list = new DataDosen07();
        Dosen07 d1 = new Dosen07("001", "alpha", true, 19);
        Dosen07 d2 = new Dosen07("002", "beta", false, 23);
        Dosen07 d3 = new Dosen07("003", "gamma", false, 20);
        Dosen07 d4 = new Dosen07("004", "delta", true, 21);
        Dosen07 d5 = new Dosen07("005", "epsilon", true, 36);
        Dosen07 d6 = new Dosen07("006", "zeta", false, 37);
        Dosen07 d7 = new Dosen07("007", "eta", true, 24);
        Dosen07 d8 = new Dosen07("008", "theta", true, 18);
        Dosen07 d9 = new Dosen07("009", "iota", false, 23);
        Dosen07 d10 = new Dosen07("010", "kappa", true, 23);
        int menu;
        do {
            System.out.println("--------------------------");
            System.out.println("1. Tambah data");
            System.out.println("2. Tampil data");
            System.out.println("3. Sorting ASC");
            System.out.println("4. Sorting DSC");
            System.out.print("Menu (0 untuk keluar): ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    list.tambah(d1);
                    list.tambah(d2);
                    list.tambah(d3);
                    list.tambah(d4);
                    list.tambah(d5);
                    list.tambah(d6);
                    list.tambah(d7);
                    list.tambah(d8);
                    list.tambah(d9);
                    list.tambah(d10);
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("Tersortir ascending menggunakan bubble sort");
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Tersortir descending menggunakan selection sort");
                    break;
            }
        } while (menu != 0);
        sc.close();
    }
}
