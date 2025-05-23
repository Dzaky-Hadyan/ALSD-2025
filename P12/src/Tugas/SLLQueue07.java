package P12.src.Tugas;

public class SLLQueue07 {
    Node07 head, tail;
    int antri;

    public void cekKosong() {
        if (head == null) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian tidak kosong!");
        }
    }

    public void cekPenuh() {
        if (antri == 3) {
            System.out.println("Antrian penuh!");
        } else {
            System.out.println("Antrian belum penuh!");
        }
    }

    public void kosongAntrian() {
        head = tail = null;
        antri = 0;
    }

    public void tambahData(Mahasiswa07 input) {
        Node07 ndInput = new Node07(input, null);
        if (head == null) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        antri++;
    }

    public void panggilAntrian() {
        if (head == null) {
            System.out.println("Antrian masih kosong!");
        } else if (head == tail) {
            System.out.printf("Mahasiswa a.n. %s berhasil dipanggil\n", head.data.nama);
            head = tail = null;
            antri--;
        } else {
            System.out.printf("Mahasiswa a.n. %s berhasil dipanggil\n", head.data.nama);
            head = head.next;
            antri--;
        }
    }

    public void tampilDepan() {
        if (head != null) {
            System.out.println("Awal Antrian:");
            head.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void tampilBelakang() {
        if (tail != null) {
            System.out.println("Akhir Antrian:");
            tail.data.tampilInformasi();
        } else {
            System.out.println("Antrian kosong");
        }
    }
}