package P10.Source_Code;

public class Mahasiswa07 {
    String nim, nama, kelas;
    int nilai;

    public Mahasiswa07() {        
    }

    public Mahasiswa07(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
