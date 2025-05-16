package P11.Source_Code;

public class AntrianPersetujuan07 {
    Mahasiswa07[] data, terproses;
    int front, rear, size, max, processed;

    public AntrianPersetujuan07(int max) {
        this.max = max;
        this.data = new Mahasiswa07[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.processed = 0;
        this.terproses = new Mahasiswa07[2];
    }

        public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false; 
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa07 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah ");
            return;
        } else if (processed == 30) {
            System.out.println("Jumlah yang ditangani mencapai kapasitas!");
            return;
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.printf("%s berhasil masuk ke antrian.", mhs.nama);
        }
    }

    public Mahasiswa07[] panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        } else { if (size > 1) {
            for (int i = 0; i < 2; i++) {
                terproses[i] = data[front];
                front = (front + 1) % max;
                size--;
                processed++;
            }
        } else {
            terproses[0] = data[front];
            front = (front + 1) % max;
            size--;
            processed++;
        }
            return terproses;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.printf("%d. ", i+1);
            data[index].tampilkanData();
        }
    }

    public void tampil2Terdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else if (!isEmpty() && data[front+1] == null) {
            System.out.println("Hanya terdapat 1 antrian!");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
            data[front+1].tampilkanData();
        }
    }

    public void tampilAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa posisi belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public void tampilJumlahAntrian() {
        System.out.printf("Jumlah Antrian: %d", size);
    }

    public void tampilJumlahTerproses() {
        System.out.printf("Jumlah Terproses: %d", processed);
    }

    public void tampilBlmTerproses() {
        System.out.printf("Jumlah Belum Terproses: %d", size);
    }
}
