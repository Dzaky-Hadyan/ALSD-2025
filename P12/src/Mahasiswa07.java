package P12.src;

public class Mahasiswa07 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa07() {
    }

    public Mahasiswa07(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi() {
        System.out.printf("NIM: \t\t%s\nNama: \t%s\nKelas: %s\nIPK: \t%.2f\n", nim, nama, kelas, ipk);
    }
}
