package P2.Source_Code;

public class Dosen07 {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen07() {

    }

    public Dosen07(String id, String nama, boolean status, int tahun, String bidang) {
        idDosen = id;
        this.nama = nama;
        statusAktif = status;
        tahunBergabung = tahun;
        bidangKeahlian = bidang;
    }

    void tampilInformasi() {
        System.out.println("ID: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status aktif: " + setStatusAktif(statusAktif));
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Bidang keahlian: " + bidangKeahlian);
    }

    String setStatusAktif(boolean status) {
        if (status == true) {
            return "Aktif";
        } else {
            return "Tidak Aktif";
        }
    }

    void hitungMasaKerja(int thnSkrg) {
        int lamaBergabung = thnSkrg - tahunBergabung;
        System.out.printf("Masa kerja: %d Tahun\n", lamaBergabung);
    }

    String ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        return bidangKeahlian;
    }
}