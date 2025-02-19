import java.util.Scanner;

public class Tugas3 {
    public static void tampilSeluruh(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.printf("%-20s%-10s%-10s%-10s\n", "MK", "SKS", "Semester", "Hari Kuliah");
        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("%-20s%-10d%-10d%-10s\n", namaMK[i], sks[i], semester[i], hariKuliah[i]);
        }
    }
    public static void tampilHari(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, String hariCari) {
        for (int i = 0; i < namaMK.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hariCari)) {
                System.out.printf("%-20s%-10d%-10d%-10s\n", namaMK[i], sks[i], semester[i], hariKuliah[i]);
            }
        }
    }
    public static void tampilSemester(String[] namaMK, int[] sks, int[] semester, String[] hariKuliah, int semesterCari) {
        for (int i = 0; i < namaMK.length; i++) {
            if (semesterCari == semester[i]) {
                System.out.printf("%-20s%-10d%-10d%-10s\n", namaMK[i], sks[i], semester[i], hariKuliah[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah mata kuliah: ");
        byte jumlahMK = sc.nextByte();
        sc.nextLine();
        String[] namaMK = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        int[] semester = new int[jumlahMK];
        String[] hariKuliah = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Nama Mata Kuliah: ");
            namaMK[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }
        do {
        System.out.print("Menu\n1. Tampil Jadwal Kuliah\n2. Cari Mata Kuliah\n3. Keluar\n=====================\nMenu: ");
        byte menuUtama = sc.nextByte();
        sc.nextLine();
        switch (menuUtama) {
            case 1:
            System.out.print("1. Tampil seluruh jadwal\n2. Tampil berdasarkan hari\n3. Tampil berdasarkan semester\nMenu: ");
            byte menu = sc.nextByte();
            sc.nextLine();
            switch (menu) {
                case 1:
                    tampilSeluruh(namaMK, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Hari: ");
                    String hariCari = sc.nextLine();
                    tampilHari(namaMK, sks, semester, hariKuliah, hariCari);
                    break;
                case 3:
                    System.out.print("Semester: ");
                    int semesterCari = sc.nextInt();
                    sc.nextLine();
                    tampilSemester(namaMK, sks, semester, hariKuliah, semesterCari);
                    break;
            }
                break;
            case 2:
            System.out.print("Nama Mata Kuliah: ");
            String namaCari = sc.nextLine();
            for (int i = 0; i < namaMK.length; i++) {
                if (namaCari.equalsIgnoreCase(namaMK[i])) {
                    System.out.printf("%-20s%-10d%-10d%-10s\n", namaMK[i], sks[i], semester[i], hariKuliah[i]);
                }
            }
                break;
        }
        if (menuUtama == 3) {
            break;
        }
        } while (true);
        sc.close();
    }
}
