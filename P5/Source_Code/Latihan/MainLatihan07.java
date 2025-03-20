package P5.Source_Code.Latihan;

public class MainLatihan07 {
    public static void main(String[] args) {
        int[] nilaiUTS = new int[8];
        Latihan07[] mahasiswa = new Latihan07[8];
        mahasiswa[0] = new Latihan07("Ahmad", 78, 82);
        mahasiswa[1] = new Latihan07("Budi", 85, 88);
        mahasiswa[2] = new Latihan07("Cindy", 90, 87);
        mahasiswa[3] = new Latihan07("Dian", 76, 79);
        mahasiswa[4] = new Latihan07("Eko", 92, 95);
        mahasiswa[5] = new Latihan07("Fajar", 88, 85);
        mahasiswa[6] = new Latihan07("Gina", 80, 83);
        mahasiswa[7] = new Latihan07("Hadi", 82, 84);
        for (int i = 0; i < 8; i++) {
            nilaiUTS[i] = mahasiswa[i].nilaiUTS;
        }
        System.out.printf("Nilai UTS tertinggi: %d\n", mahasiswa[0].tertinggiUTSDC(nilaiUTS, 0, 7));
        System.out.printf("Nilai UTS terendah: %d\n", mahasiswa[0].terendahUTSDC(nilaiUTS, 0, 7));
        System.out.printf("Rata-rata nilai UAS: %.2f", mahasiswa[0].rerataUASBF(mahasiswa));
    }
}
