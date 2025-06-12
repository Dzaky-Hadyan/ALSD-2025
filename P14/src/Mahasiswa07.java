package P14.src;

public class Mahasiswa07 {
  String nim, nama, kelas;
  double ipk;
  
  public Mahasiswa07() {
  }

  public Mahasiswa07(String nim, String nama, String kelas, double ipk) {
    this.nim = nim;
    this.nama = nama;
    this.kelas = kelas;
    this.ipk = ipk;
  }

  public void tampilInformasi() {
    System.out.printf("NIM: %s Nama: %s Kelas: %s IPK: %.2f\n", this.nim, this.nama, this.kelas, this.ipk);
  }
}
