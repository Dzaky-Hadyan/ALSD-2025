import java.util.Scanner;

public class PraktikumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mk = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        double[] nilaiAngka = new double[mk.length];
        String[] nilaiHuruf = new String[mk.length];
        double[] nilaiSetara = new double[mk.length];
        double ip = 0;
        byte[] bobotSKS = {2, 2, 2, 3, 2, 2, 3, 2};
        System.out.println("=====================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=====================");
        for (int i = 0; i < mk.length; i++) {
            System.out.printf("masukkan nilai Angka untuk MK %s: ", mk[i]);
            nilaiAngka[i] = sc.nextDouble();
            sc.nextLine();
            if (nilaiAngka[i] <= 39) {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            }
            ip += nilaiSetara[i] * bobotSKS[i];
        }
        ip /= 18;
        System.out.println("=====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=====================");
        System.out.printf("%-40s %-20s %-20s %-20s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < mk.length; i++) {
            System.out.printf("%-40s%-20.2f%-20s%-20.2f\n", mk[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }
        System.out.println("=====================");
        System.out.printf("IP: %.2f", ip);
        sc.close();
    }
}