import java.util.Scanner;

public class PraktikumPemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tugas, kuis, uts, uas;
        double akhir;
        String huruf = "", keterangan = "";
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas: ");
        tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        uas = sc.nextInt();
        System.out.println("======================");
        System.out.println("======================");
        if (tugas >= 0 && tugas <= 100 && kuis >= 0 && kuis <= 100 && uts >= 0 && uts <= 100 && uas >= 0 && uas <= 100) {
            akhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
            if (akhir <= 39) {
                huruf = "E";
                keterangan = "TIDAK LULUS";
            } else if (akhir > 39 && akhir <= 50) {
                huruf = "D";
                keterangan = "TIDAK LULUS";
            } else if (akhir > 50 && akhir <= 60) {
                huruf = "C";
                keterangan = "LULUS";
            } else if (akhir > 60 && akhir <= 65) {
                huruf = "C+";
                keterangan = "LULUS";
            } else if (akhir > 65 && akhir <= 73) {
                huruf = "B";
                keterangan = "LULUS";
            } else if (akhir > 73 && akhir <= 80) {
                huruf = "B+";
                keterangan = "LULUS";
            } else if (akhir > 80 && akhir <= 100) {
                huruf = "A";
                keterangan = "LULUS";
            }
            System.out.printf("nilai akhir: %5.1f\n", akhir);
            System.out.printf("nilai huruf: %s\n", huruf);
            System.out.println("======================");
            System.out.println("======================");
            switch (keterangan) {
                case "LULUS":
                System.out.println("SELAMAT ANDA LULUS");
                    break;
                case "TIDAK LULUS":
                System.out.println("ANDA TIDAK LULUS");
                    break;
            }
        } else {
            System.out.println("nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
        }
        sc.close();
    }
}