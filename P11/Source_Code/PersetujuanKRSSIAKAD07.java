package P11.Source_Code;

import java.util.Scanner;

public class PersetujuanKRSSIAKAD07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianPersetujuan07 antrian = new AntrianPersetujuan07(10);
        int pilihan;
        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1. Cek Antrian Kosong");;
            System.out.println("2. Cek Antrian Penuh");
            System.out.println("3. Mengosongkan Antrian");
            System.out.println("4. Menambah Antrian");
            System.out.println("5. Memanggil Antrian");
            System.out.println("6. Menampilkan Semua Antrian");
            System.out.println("7. Menampilkan 2 Antrian Terdepan");
            System.out.println("8. Menampilkan Antrian Akhir");
            System.out.println("9. Cetak Jumlah Antrian");
            System.out.println("10. Cetak Jumlah Terproses");
            System.out.println("11. Cetak Jumlah Belum Diproses");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();
            switch (pilihan) {
                case 1:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian Kosong");
                    }
                    break;
                case 2:
                    if (antrian.isFull()) {
                        System.out.println("Antrian Penuh");
                    }
                    break;
                case 3:
                    antrian.clear();
                    break;
                case 4:
                    System.out.print("NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa07 mhs = new Mahasiswa07(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 5:
                    Mahasiswa07[] terproses = antrian.panggilAntrian();
                    System.out.printf("Memanggil Antrian: \nNIM - Nama - Prodi - Kelas\n");
                    int i = -1;
                    do {
                        i++;
                        System.out.printf("%s - %s - %s - %s\n", terproses[i].nim, terproses[i].nama, terproses[i].prodi, terproses[i].kelas);
                    } while (terproses[i] != null && i < 1);
                    break;
                case 6:
                    antrian.tampilkanSemua();
                    break;
                case 7:
                    antrian.tampil2Terdepan();
                    break;
                case 8:
                    antrian.tampilAkhir();
                    break;
                case 9:
                    antrian.tampilJumlahAntrian();
                    break;
                case 10:
                    antrian.tampilJumlahTerproses();
                    break;
                case 11:
                    antrian.tampilBlmTerproses();
                    break;
                default:
                    break;
            }
        } while (pilihan != 0);
        sc.close();
    }
}
