package P3.Source_Code;

public class Mahasiswa07 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    public void cetakInfo(Mahasiswa07[] arrayOfMahasiswa, int i) {
        System.out.println("Data Mahasiswa ke-" + (i + 1));
        System.out.println("NIM     : "+ arrayOfMahasiswa[i].nim);
        System.out.println("Nama    : "+ arrayOfMahasiswa[i].nama);
        System.out.println("Kelas   : "+ arrayOfMahasiswa[i].kelas);
        System.out.println("IPK     : "+ arrayOfMahasiswa[i].ipk);
        System.out.println("-------------------------------");
    }
}