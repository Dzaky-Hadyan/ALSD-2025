package P2.Source_Code;

public class DosenMain07 {
    public static void main(String[] args) {
        Dosen07 dsn1 = new Dosen07();
        dsn1.idDosen = "314";
        dsn1.nama = "Pitagoras";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2012;
        dsn1.bidangKeahlian = "Matematika";
        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        dsn1.hitungMasaKerja(2025);
        dsn1.ubahKeahlian("IT");
        dsn1.tampilInformasi();
    }
}
