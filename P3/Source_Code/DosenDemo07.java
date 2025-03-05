package P3.Source_Code;

import java.util.Scanner;

public class DosenDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen07[] arrayOfDosen = new Dosen07[3];
        String dummy;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i] = new Dosen07(null, null, null, i);

            System.out.printf("Masukkan Data Dosen ke-%d \n", i+1);
            System.out.printf("Kode          : ");
            arrayOfDosen[i].kode = sc.nextLine();
            System.out.printf("Nama          : ");
            arrayOfDosen[i].nama = sc.nextLine();
            System.out.printf("Jenis Kelamin : ");
            dummy = sc.nextLine();
            if (dummy.equalsIgnoreCase("pria")) {
                arrayOfDosen[i].jenisKelamin = true;
            } else if (dummy.equalsIgnoreCase("wanita")) {
                arrayOfDosen[i].jenisKelamin = false;
            } else {
                System.out.printf("Input Invalid\n");
                break;
            }
            System.out.printf("Usia          : ");
            arrayOfDosen[i].usia = sc.nextInt();
            sc.nextLine();
            System.out.printf("-------------------------------\n");
        }

        for (Dosen07 obj : arrayOfDosen) {
            System.out.printf("Data %s\n", obj.nama);
            System.out.printf("Kode          : %s\n", obj.kode);
            System.out.printf("Nama          : %s\n", obj.nama);
            System.out.printf("Jenis Kelamin : ");
            if (obj.jenisKelamin == true) {
                System.out.println("Pria");
            } else {
                System.out.println("Wanita");
            }
            System.out.printf("Usia          : %d\n", obj.usia);
        }

        DataDosen07.dataSemuaDosen(arrayOfDosen);
        DataDosen07.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen07.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen07.infoDosenPalingTua(arrayOfDosen);
        DataDosen07.infoDosenPalingMuda(arrayOfDosen);
        sc.close();
    }
}
