package P3.Source_Code;

public class DataDosen07 {
    static void dataSemuaDosen(Dosen07[] arrayOfDosen) {
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.printf("Data Dosen ke-%d: \n", i+1);
            System.out.printf("Kode          : %s\n", arrayOfDosen[i].kode);
            System.out.printf("Nama          : %s\n", arrayOfDosen[i].nama);
            System.out.printf("Jenis Kelamin : ");
            if (arrayOfDosen[i].jenisKelamin == true) {
                System.out.println("Pria");
            } else {
                System.out.println("Wanita");
            }
            System.out.printf("Usia          : %d\n", arrayOfDosen[i].usia);
        }
    }

    static void jumlahDosenPerJenisKelamin(Dosen07[] arrayOfDosen) {
        int maleSum = 0, femaleSum = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true) {
                maleSum++;
            } else {
                femaleSum++;
            }
        }
        System.out.printf("Jumlah dosen pria: %d\n", maleSum);
        System.out.printf("Jumlah dosen wanita: %d\n", femaleSum);
    }

    static void rerataUsiaDosenPerJenisKelamin(Dosen07[] arrayOfDosen) {
            int maleCounter = 0, femaleCounter = 0, maleSum = 0, femaleSum = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin == true) {
                maleSum += arrayOfDosen[i].usia;
                maleCounter++;
            } else {
                femaleSum += arrayOfDosen[i].usia;
                femaleCounter++;
            }
        }
        System.out.printf("Rerata usia dosen pria: %d\n", maleSum/maleCounter);
        System.out.printf("Rerata usia dosen wanita: %d\n", femaleSum/femaleCounter);
    }

    static void infoDosenPalingTua(Dosen07[] arrayOfDosen) {
        int tertua = 0, index = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (tertua < arrayOfDosen[i].usia) {
                tertua = arrayOfDosen[i].usia;
                index = i;
            }
        }
        System.out.println("Data dosen paling tua");
        System.out.printf("Kode          : %s\n", arrayOfDosen[index].kode);
            System.out.printf("Nama          : %s\n", arrayOfDosen[index].nama);
            System.out.printf("Jenis Kelamin : ");
            if (arrayOfDosen[index].jenisKelamin == true) {
                System.out.println("Pria");
            } else {
                System.out.println("Wanita");
            }
            System.out.printf("Usia          : %d\n", arrayOfDosen[index].usia);
    }

    static void infoDosenPalingMuda(Dosen07[] arrayOfDosen) {
        int termuda = 100, index = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < termuda) {
                termuda = arrayOfDosen[i].usia;
                index = i;
            }
        }
        System.out.println("Data dosen paling muda");
        System.out.printf("Kode          : %s\n", arrayOfDosen[index].kode);
            System.out.printf("Nama          : %s\n", arrayOfDosen[index].nama);
            System.out.printf("Jenis Kelamin : ");
            if (arrayOfDosen[index].jenisKelamin == true) {
                System.out.println("Pria");
            } else {
                System.out.println("Wanita");
            }
            System.out.printf("Usia          : %d\n", arrayOfDosen[index].usia);
    }
}