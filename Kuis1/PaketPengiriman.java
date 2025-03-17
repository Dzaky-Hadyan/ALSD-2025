package Kuis1;

public class PaketPengiriman {
    String nomorResi;
    double berat, ongkosDasar;

    public PaketPengiriman(String nomorResi, double berat, double ongkosDasar) {
        this.nomorResi = nomorResi;
        this.berat = berat;
        this.ongkosDasar = ongkosDasar;
    }

    public double totalOngkos(PaketPengiriman[] pkt, int i) {
        double totalOngkos = pkt[i].berat * pkt[i].ongkosDasar;
        if (totalOngkos > 100000) {
            totalOngkos -= totalOngkos * 0.1;
        }
        return totalOngkos;
    }

    public void printData(PaketPengiriman[] pkt, int i) {
        System.out.println("=======================");
        System.out.printf("Paket ke-%d\n", i+1);
        System.out.printf("Nomor Resi: %s\n", pkt[i].nomorResi);
        System.out.printf("Berat: %.2fKg\n", pkt[i].berat);
        System.out.printf("Ongkos dasar: Rp. %.2f\n", pkt[i].ongkosDasar);
        System.out.printf("Total ongkos: Rp. %.2f\n", pkt[i].totalOngkos(pkt, i));
        System.out.println("=======================");
    }
}
