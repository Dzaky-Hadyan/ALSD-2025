package P6.Source_Code;

public class Dosen07 {
    String kode, nama;
    Boolean jenisKelamin;
    int usia;

    Dosen07(String kd, String name, Boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        if (jenisKelamin == true) {
            System.out.println("Jenis Kelamin: pria");
        } else {
            System.out.println("Jenis Kelamin: wanita");
        }
        System.out.println("Usia: " + usia);
    }
}