package P5.Source_Code;

public class Sum07 {
    double keuntungan[];

    Sum07(int el) {
        keuntungan = new double[el];
    }

    double totalBF() {
        double total = 0;
        for (int i = 0; i < keuntungan.length; i++) {
            total = total + keuntungan[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r)/2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid+1, r);
        return lsum + rsum;
    }
    /* totalDC(keuntungan[], 0, 4) {
     * mid = (0 + 4)/2 = 2
     * lsum = totalDC(keuntungan[], 0, 2)
     *         mid = (0 + 2)/2 = 1
     *         lsum = totalDC(keuntungan[], 0, 1)
     *                 mid = (0 + 1)/2 = 0
     *                 lsum = totalDC(keuntungan[], 0, 0)
     *                         keuntungan[0]
     *                 rsum = totalDC(keuntungan[], 1, 1)
     *                         keutungan[1]
     *         rsum = totalDC(keuntungan[], 2, 2)
     *                 keuntungan[2]
     * rsum = totalDC(keuntungan[], 3, 4)
     *         mid = (3 + 4)/2 = 3
     *         lsum = totalDC(keuntungan[], 3, 3)
     *                 keuntungan[3]
     *         rsum = totalDC(keuntungan[], 4, 4)
     *                 keuntungan[4]
     * }
     */
    /* totalDC(keuntungan[], 0, 4) {
     * mid = (0 + 4)/2 = 2
     * lsum = totalDC(keuntungan[], 0, 2)
     *         mid = (0 + 2)/2 = 1
     *         lsum = totalDC(keuntungan[], 0, 1)
     *                 mid = (0 + 1)/2 = 0
     *                 lsum = totalDC(keuntungan[], 0, 0)
     *                         mahasiswa[0].nilaiUTS
     *                 rsum = totalDC(keuntungan[], 1, 1)
     *                         mahasiswa[1].nilaiUTS
     *         rsum = totalDC(keuntungan[], 2, 2)
     *                 mahasiswa[2].nilaiUTS
     * rsum = totalDC(keuntungan[], 3, 4)
     *         mid = (3 + 4)/2 = 3
     *         lsum = totalDC(keuntungan[], 3, 3)
     *                 mahasiswa[3].nilaiUTS
     *         rsum = totalDC(keuntungan[], 4, 4)
     *                 mahasiswa[4].nilaiUTS
     * }
     * 
     */
}
