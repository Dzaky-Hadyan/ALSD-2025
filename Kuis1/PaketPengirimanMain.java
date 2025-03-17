package Kuis1;

public class PaketPengirimanMain {
    public static void main(String[] args) {
        PaketPengiriman[] pkt = new PaketPengiriman[5];
        pkt[0] = new PaketPengiriman("abc", 7, 10000);
        pkt[1] = new PaketPengiriman("bca", 10, 35000);
        pkt[2] = new PaketPengiriman("cab", 15, 20000);
        pkt[3] = new PaketPengiriman("bac", 8, 30000);
        pkt[4] = new PaketPengiriman("cba", 11, 100000);
        for (int i = 0; i < pkt.length; i++) {
            pkt[i].printData(pkt, i);
        }
        //Jumlah paket dengan berat > 10
        int counter = 0;
        for (int i = 0; i < pkt.length; i++) {
            if (pkt[i].berat > 10) {
                counter++;
            }
            }
        System.out.println("Persentase paket berat > 10Kg: " + counter*100/pkt.length + "%");
        //Rata-rata ongkos paket berat > 10
        int sum = 0;
        for (int i = 0; i < pkt.length; i++) {
            if (pkt[i].berat > 10) {
                sum += pkt[i].totalOngkos(pkt, i);
            }
        }
        System.out.printf("Rata-rata ongkos pengiriman: Rp. %d", sum/pkt.length);
    }
}