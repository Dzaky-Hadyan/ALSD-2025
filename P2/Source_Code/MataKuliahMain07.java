package P2.Source_Code;

public class MataKuliahMain07 {
    public static void main(String[] args) {
        MataKuliah07 mk1 = new MataKuliah07();
        mk1.kodeMK = "201";
        mk1.nama = "Ilmu Ilmuan";
        mk1.sks = 2;
        mk1.jumlahJam = 100;
        mk1.tampilInformasi();
        mk1.ubahSKS(3);
        mk1.tambahJam(20);
        mk1.kurangJam(30);
        mk1.tampilInformasi();

        MataKuliah07 mk2 = new MataKuliah07("202", "Praktikum Praktikuman", 3, 150);
        mk2.tampilInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(0);
        mk2.kurangJam(160);
        mk2.tampilInformasi();
    }
}