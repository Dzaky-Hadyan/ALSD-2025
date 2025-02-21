package P2.Source_Code;

public class MataKuliah07 {
    String kodeMK, nama;
    int sks, jumlahJam;

    public MataKuliah07() {

    }

    public MataKuliah07(String mk, String n, int sks, int j) {
        kodeMK = mk;
        nama = n;
        this.sks = sks;
        jumlahJam = j;
    }

    void tampilInformasi() {
        System.out.printf("Kode mata kuliah: %s\n", kodeMK);
        System.out.printf("Nama mata kuliah: %s\n", nama);
        System.out.printf("SKS mata kuliah: %d\n", sks);
        System.out.printf("Jumlah jam mata kuliah: %d\n", jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah!");
    }

    int tambahJam(int jam) {
        jumlahJam += jam;
        return jumlahJam;
    }

    void kurangJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan tidak dapat dilakukan!");
        } else {
            jumlahJam -= jam;
            System.out.printf("Jumlah jam setelah update: %d\n", jumlahJam);
        }
    }
}
