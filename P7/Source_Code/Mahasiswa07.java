package P7.Source_Code;

public class Mahasiswa07 {
    String nim, nama, kelas;
    double ipk;

    // Konstruktor default
    Mahasiswa07() {
    }

    // Konstruktor berparameter (dibuat ada yang nama var parameter inputnya sama ada yang tidak)
    Mahasiswa07(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}
