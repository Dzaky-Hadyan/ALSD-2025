package P7.Source_Code;

public class DataDosen07 {
    Dosen07[] dataDosen = new Dosen07[10];
    int idx;

    void tambah(Dosen07 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Dosen07 dsn:dataDosen) {
            dsn.tampil();
            System.out.println("--------------------------");
        }
    }
    
    void sortingASC() {
        for (int i = 0; i < dataDosen.length-1; i++) {
            for (int j = 1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen07 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = tmp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < dataDosen.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia > dataDosen[idxMin].usia) {
                    idxMin = j;
                }
            }
            Dosen07 tmp = dataDosen[idxMin];
            dataDosen[idxMin] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen07 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia > temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }

    int PencarianDataSequential07(String cari) {
        int posisi = -1;
        for (int j = 0; j < dataDosen.length; j++) {
            if (dataDosen[j].nama.equalsIgnoreCase(cari)) {
                if (posisi == -1) {
                    posisi = j;
                } else {
                    posisi = -2;
                    break;
                }
            }
        }
        return posisi;
    }

    int PencarianDataBinary07(int cari, int left, int right) {
        int mid, sameValue = 0;
        if (right >= left) {
            mid = (left + right)/2;
            if (cari == dataDosen[mid].usia) {
                sameValue = dataDosen[mid].usia;
                if (dataDosen[mid+1].usia == sameValue) {
                    return -2;
                } else if (dataDosen[mid-1].usia == sameValue) {
                    return -2;
                } else {
                    return mid;
                }
            } else if (dataDosen[mid].usia > cari) {
                return PencarianDataBinary07(cari, left, mid-1);
            } else {
                return PencarianDataBinary07(cari, mid+1, right);
            }
        }
        return -1;
        /* findBinarySearch(cari, left, right)
    findBinarySearch(23, 0, 9), 0:18 1:19 2:20 3:21 4:23 5:23 6:23 7:24 8:36 9:37
    mid = (0+9)/2 = 4
    listMhs[mid].ipk = cari
    sameValue = 23
    listMhs[mid+1].ipk = cari
    return -2
    listMhs[mid-1].ipk = cari
    findBinarySearch(3.2, 0, 2)
    mid = (0+2)/2 = 1
    listMhs[mid].ipk > cari
    findBinarySearch(3.2, 0, -1)
     */
    }

    void tampilDataSearch(String nama, int pos, int usia) {
        if (pos == -2) {
            System.out.println("Hasil pencarian lebih dari 1!");
        } else if (pos != -1) {
            System.out.println("Kode\t: " + dataDosen[pos].kode);
            System.out.println("Nama\t: " +dataDosen[pos].nama);
            if (dataDosen[pos].jenisKelamin == true) {
                System.out.println("Jenis Kelamin\t: pria");
            } else {
                System.out.println("Jenis Kelamin\t: wanita");
            }
            System.out.println("Usia\t: " + dataDosen[pos].usia);
        } else if (usia == 0 && nama != null) {
            // System.out.println("Data dosen dengan usia " + usia + " tidak ditemukan");
            System.out.println("Data dosen dengan nama " + nama + " tidak ditemukan");
        } else if (nama == null && usia != 0) {
            // System.out.println("Data dosen dengan nama " + nama + " tidak ditemukan");
            System.out.println("Data dosen dengan usia " + usia + " tidak ditemukan");
        }
    }
}