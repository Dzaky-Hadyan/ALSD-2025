package P5.Source_Code.Latihan;

public class Latihan07 {
    String nama;
    int nilaiUTS, nilaiUAS, tertinggiUTS;

    public Latihan07(String nama, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    int tertinggiUTSDC(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r)/2;
        int lhighest = tertinggiUTSDC(arr, l, mid);
        int rhighest = tertinggiUTSDC(arr, mid+1, r);
        if (lhighest > rhighest) {
            return lhighest;
        } else {
            return rhighest;
        }
        /* tertinggi
         * {1, 2, 3, 4, 5, 6, 7, 8}
         * {1, 2, 3, 4}{5, 6, 7, 8}
         * {1, 2}{3, 4}{5, 6}{7, 8} base case arr.length = 2
         * {2, 4}{6, 8}
         * {4, 8}
         * {8}
         */
    }

    int terendahUTSDC(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r)/2;
        int llowest = terendahUTSDC(arr, l, mid);
        int rlowest = terendahUTSDC(arr, mid+1, r);
        if (llowest < rlowest) {
            return llowest;
        } else {
            return rlowest;
        }
        /* 
        terendahUTSDC(nilaiUTS[], 0, 7) {
        mid = (0 + 7)/2 = 3
        llowest = terendahUTSDC(nilaiUTS[], 0, 3)
                  mid = (0 + 3)/2 = 1
                  llowest = terendahUTSDC(nilaiUTS[], 0, 1)
                            mid = (0 + 1)/2 = 0
                            llowest = terendahUTSDC(nilaiUTS[], 0, 0)
                            rlowest = terendahUTSDC(nilaiUTS[], 1, 1)
                  rlowest = terendahUTSDC(nilaiUTS[], 2, 3)
                            mid = (2 + 3)/2 = 2
                            llowest = terendahUTSDC(nilaiUTS[], 2, 2)
                            rlowest = terendahUTSDC(nilaiUTS[], 3, 3)

        rlowest = terendahUTSDC(nilaiUTS[], 4, 7)
        }
         */
    }

    double rerataUASBF(Latihan07[] mahasiswa) {
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            sum += mahasiswa[i].nilaiUAS;
        }
        return sum/8;
    }
}