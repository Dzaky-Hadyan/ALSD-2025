package P12.src.Tugas;

import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLLQueue07 sll = new SLLQueue07();
        int menu;
        do {
            System.out.println("1. Cek Antrian Kosong");
            System.out.println("2. Cek Antrian Penuh");
            System.out.println("3. Kosongkan Antrian");
            System.out.println("4. Tambah antrian");
            System.out.println("5. Panggil Antrian");
            System.out.println("6. Tampil Awal Antrian");
            System.out.println("7. Tampil Akhir Antrian");
            System.out.println("8. Tampil Jumlah Antrian");
            System.out.print("Menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    sll.cekKosong();
                    break;
                case 2:
                    sll.cekPenuh();
                    break;
                case 3:
                    sll.kosongAntrian();
                    break;
                case 4:
                    if (sll.antri == 3) {
                        System.out.println("Antrian penuh!");
                        break;
                    } else {
                        System.out.print("NIM: ");
                        String nim = sc.nextLine();
                        System.out.print("Nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Kelas: ");
                        String kls = sc.nextLine();
                        System.out.print("IPK: ");
                        Double ip = sc.nextDouble();
                        Mahasiswa07 mhs = new Mahasiswa07(nim, nama, kls, ip);
                        sll.tambahData(mhs);
                    }
                    break;
                case 5:
                    sll.panggilAntrian();
                    break;
                case 6:
                    sll.tampilDepan();
                    break;
                case 7:
                    sll.tampilBelakang();
                    break;
                case 8:
                    System.out.printf("Jumlah Antrian: %d\n", sll.antri);
                    break;
                default:
                    System.out.println("Input Invalid");
                    break;
            }
            System.out.println();
        } while (menu != 0);
        sc.close();
    }
}
