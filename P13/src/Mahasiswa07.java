package P13.src;

public class Mahasiswa07 {
    public String nim, nama, kelas;
    public Double ipk;

    public Mahasiswa07(String nim, String nama, String kelas, Double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.printf("%s\t\t%s\t\t%s\t\t%.1f\n", nama, nim, kelas, ipk);
    }
}
