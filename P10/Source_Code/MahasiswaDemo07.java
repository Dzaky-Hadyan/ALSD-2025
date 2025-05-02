package P10.Source_Code;

import java.util.Scanner;

public class MahasiswaDemo07 {
    public static void main(String[] args) {
        StackTugasMahasiswa07 stack = new StackTugasMahasiswa07(5);
        Scanner sc = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("Nama: ");
                    String nama = sc.nextLine();
                    System.out.println("NIM: ");
                    String nim = sc.nextLine();
                    System.out.println("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa07 mhs = new Mahasiswa07(nama, nim, kelas);
                    break;
                case 2:
                    Mahasiswa07 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.printf("Menilai tugas dari %s", dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
                case 3:
                    Mahasiswa07 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.printf("Tugas terakhir dikumpulkan oleh %s", lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                System.out.println("Pilihan tidak valid");
            }
        } while (pilih >= 1 && pilih <= 4);
        sc.close();
    }
}