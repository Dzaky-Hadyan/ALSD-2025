package P12.src;

// import java.util.Scanner;

public class SLLMain07 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        SingleLinkedList07 sll = new SingleLinkedList07();
        Mahasiswa07 mhs1 = new Mahasiswa07("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa07 mhs2 = new Mahasiswa07("23212201", "Bimon", "2B", 3.8);
        Mahasiswa07 mhs3 = new Mahasiswa07("22212202", "Cintia", "3C", 3.5);
        Mahasiswa07 mhs4 = new Mahasiswa07("21212203", "Dirga", "4D", 3.6);
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
        // int menu = -1;
        // while (menu != 0) {
        //     System.out.println("1. Tambah data di awal");
        //     System.out.println("2. Tambah data di akhir");
        //     System.out.println("3. Tambah data setelah nama");
        //     System.out.println("4. Tambah data pada index");
        //     System.out.println("5. Tampil data");
        //     System.out.println("0. Keluar");
        //     System.out.print("Menu: ");
        //     menu = sc.nextInt();
        //     sc.nextLine();
        //     if (menu >= 1 && menu <=4) {
        //         System.out.print("NIM: ");
        //         String nim = sc.nextLine();
        //         System.out.print("Nama: ");
        //         String nama = sc.nextLine();
        //         System.out.print("Kelas: ");
        //         String kelas = sc.nextLine();
        //         System.out.print("IPK: ");
        //         Double ip = sc.nextDouble();
        //         Mahasiswa07 mhs = new Mahasiswa07(nim, nama, kelas, ip);
        //         switch (menu) {
        //             case 1:
        //                 sll.addFirst(mhs);
        //                 break;
        //             case 2:
        //                 sll.addLast(mhs);
        //                 break;
        //             case 3:
        //                 System.out.print("Tambah setelah: ");
        //                 String key = sc.nextLine();
        //                 sll.insertAfter(key, mhs);
        //                 break;
        //             case 4:
        //                 System.out.print("Tambah pada index: ");
        //                 int idx = sc.nextInt();
        //                 sll.insertAt(idx, mhs);
        //                 break;
        //             default:
        //                 System.out.println("Menu invalid");
        //                 break;
        //         }
        //     } else if (menu == 5) {
        //         sll.print();
        //     } else if (menu == 0) {
        //         System.out.println("Terima kasih");
        //         break;
        //     }
        // }
        // sc.close();
        System.out.println("data index 1: ");
        sll.getData(1);

        System.out.printf("data mahasiswa an Bimon berada pada index : %d\n\n", sll.indexOf("bimon"));

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
