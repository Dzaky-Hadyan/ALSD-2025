package P7.Source_Code;

public class MahasiswaBerprestasi07 {
    int idx;
    Mahasiswa07 listMhs[];

    MahasiswaBerprestasi07(int jumMhs) {
        listMhs = new Mahasiswa07[jumMhs];
    }

    void tambah (Mahasiswa07 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa07 m:listMhs) {
            m.tampilInformasi();
            System.out.println("----------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa07 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa07 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa07 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("data mahasiswa dengan IPK: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t: " + listMhs[pos].nim);
            System.out.println("nama\t: " +listMhs[pos].nama);
            System.out.println("kelas\t: " + listMhs[pos].kelas);
            System.out.println("ipk\t: " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right) {
        int mid;
        // if (right >= left) {
        //     mid = (left + right)/2;
        //     if (cari == listMhs[mid].ipk) {
        //         return (mid);
        //     } else if (listMhs[mid].ipk > cari) {
        //         return findBinarySearch(cari, left, mid-1);
        //     } else {
        //         return findBinarySearch(cari, mid+1, right);
        //     }
        // }
        //Jawaban No. 4
        if (right >= left) {
            mid = (left + right)/2;
            if (cari == listMhs[mid].ipk) {
                return (mid);
            } else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, mid+1, right);
            } else {
                return findBinarySearch(cari, left, mid-1);
            }
        }
        return -1;
    }
    /* findBinarySearch(cari, left, right)
    findBinarySearch(3.7, 0, 4), 0:3.1 1:3.2 2:3.3 3:3.5 4:3.7
    mid = (0+4)/2 = 2
    listMhs[mid].ipk < cari
    findBinarySearch(3.7, 3, 4)
    mid = (3+4)/2 = 3
    listMhs[mid].ipk < cari
    findBinarySearch(3.7, 4, 4)
    mid = (4+4)/2 = 4
    listMhs[mid].ipk == cari
    return 4
    findBinarySearch(3.2, 0, 4), 0:3.8 1:3.7 2:3.5 3:3.4 4:3.2
    mid = (0+4)/2 = 2
    listMhs[mid].ipk > cari
    findBinarySearch(3.2, 0, 2)
    mid = (0+2)/2 = 1
    listMhs[mid].ipk > cari
    findBinarySearch(3.2, 0, -1)
     */
}