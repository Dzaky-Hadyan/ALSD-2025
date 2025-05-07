package P10.Source_Code;

public class StackSurat07 {
    Surat07[] stack;
    int top, size;

    public StackSurat07(int size) {
        this.size = size;
        stack = new Surat07[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat07 srt) {
        if (isFull()) {
            System.out.println("Stack penuh!");
        } else {
            top++;
            stack[top] = srt;
        }
    }

    public Surat07 pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return null;
        } else {
            Surat07 surat = stack[top];
            top--;
            return surat;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
        } else {
            System.out.printf("ID Surat: \t%s\nNama Mahasiswa: %s\nKelas: \t\t%s\nJenis Izin: \t%C\nDurasi: \t%d\n", stack[top].idSurat, stack[top].namaMahasiswa, stack[top].kelas, stack[top].jenisIzin, stack[top].durasi);
        }
    }

    public void search(String nama) {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
        } else {
            boolean tidakAda = true;
            for (int i = 0; i <= top; i++) {
                if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                    System.out.printf("Terdapat surat izin dengan nama %s\n", nama);
                    tidakAda = false;
                    break;
                }
            }
            if (tidakAda) {
                System.out.printf("Tidak ada surat izin dengan nama %s\n", nama); 
            }
        }
    }
}
