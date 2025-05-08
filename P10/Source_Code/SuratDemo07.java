package P10.Source_Code;

import java.util.Scanner;

public class SuratDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat07 stack = new StackSurat07(5);
        int menu = -1;
        do {
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin: ");
                    char jenis = sc.nextLine().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    Surat07 srt = new Surat07(id, nama, kelas, jenis, durasi);
                    stack.push(srt);
                    System.out.printf("Surat Izin %s berhasil ditambahkan!\n", nama);
                    break;
                case 2:
                    System.out.printf("Berhasil memproses surat izin %s\n", stack.pop().namaMahasiswa);
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    System.out.print("Nama Mahasiswa yang Dicari: ");
                    String cari = sc.nextLine();
                    stack.search(cari);
                    break;
                default:
                System.out.println("Pilihan Invalid!");
                    break;
            }
        } while (menu != 0);
        sc.close();
    }
}