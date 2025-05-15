package P11.Source_Code;

public class Mahasiswa07 {
    String nim, nama, prodi, kelas;

    public Mahasiswa07(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.printf("%s - %s - %s - %s\n", nim, nama, prodi, kelas);
    }
}