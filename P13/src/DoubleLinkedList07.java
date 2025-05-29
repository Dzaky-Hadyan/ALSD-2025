package P13.src;

public class DoubleLinkedList07 {
    Node07 head, tail;
    int size = 0;

    public DoubleLinkedList07() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa07 data) {
        Node07 baru = new Node07(data);
        if (isEmpty()) {
            head = tail = baru;
        } else {
            baru.next = head;
            head.prev = baru;
            head = baru;
        }
        size++;
    }

    public void addLast(Mahasiswa07 data) {
        Node07 baru = new Node07(data);
        if (isEmpty()) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa07 data) {
        Node07 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.printf("Node dengan NIM %s tidak ditemuka.\n", keyNim);
            return;
        }

        Node07 baru = new Node07(data);

        if (current == tail) {
            current.next = baru;
            baru.prev = current;
            tail = baru;
        } else {
            baru.next = current.next;
            baru.prev = current;
            current.next.prev = baru;
            current.next = baru;
        }
        size++;
        System.out.printf("Node berhasil disisipkan setelah NIM %s", keyNim);
    }

    public void print() {
        Node07 current = head;
        if (isEmpty()) {
            System.out.println("Linked List kosong!");
        } else {
            while (current != null) {
                current.data.tampil();
                current = current.next;
            }
        }
    }

    public Node07 search(String key) {
        Node07 current = head;
        if (isEmpty()) {
            System.out.println("Linked List kosong!");
            return null;
        } else {
            while (current != null) {
                if (current.data.nim.equals(key)) {
                    return current;
                }
                current = current.next;
            }
            return null;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            System.out.printf("Data sudah berhasil dihapus. Data yang terhapus adalah %s", head.data.nama);
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak bisa dihapus.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            System.out.printf("Data sudah berhasil dihapus. Data yang terhapus adalah %s", tail.data.nama);
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void add(int index, Mahasiswa07 data) {
        Node07 current = head;
        int idx = 0;

        while (current != null && idx != index) {
            current = current.next;
            idx++;
        }

        if (current == null) {
            System.out.printf("Node dengan index %d tidak ditemukan.\n", index);
            return;
        }

        Node07 baru = new Node07(data);

        if (current == tail) {
            current.next = baru;
            baru.prev = current;
            tail = baru;
        } else {
            baru.next = current.next;
            baru.prev = current;
            current.next.prev = baru;
            current.next = baru;
        }
        size++;
        System.out.printf("Node berhasil disisipkan pada index ke-%d", index);
    }

    public void removeAfter(String key) {
        Node07 current = head;

        while (current != null && !current.data.nim.equals(key)) {
            current = current.next;
        }

        if (current == null) {
            System.out.printf("Node dengan NIM %s tidak ditemukan.\n", key);
            return;
        }

        if (current == tail) {
            System.out.printf("Tidak ada node setelah %s!\n", key);
            return;
        } else if (current.next == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = current.next.next;
            current.next.prev = current;
        }
        size--;
        System.out.printf("Node setelah NIM %s berhasil dihapus\n", key);
    }

    public void remove(int index) {
        Node07 current = head;
        int idx = 0;

        while (current != null && idx != index) {
            current = current.next;
            idx++;
        }

        if (current == null) {
            System.out.printf("Node dengan index %d tidak ditemukan.\n", index);
            return;
        }

        if (current == head) {
            head = current.next;
            current = null;
        } else if (current == tail) {
            tail = current.prev;
            current = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
        System.out.printf("Node pada index ke-%d berhasil dihapus\n", index);
    }

    public void getFirst() {
        head.data.tampil();
    }

    public void getLast() {
        tail.data.tampil();
    }

    public void get(int index) {
        Node07 current = head;
        int idx = 0;
        while (current != null && idx != index) {
            current = current.next;
            idx++;
        }
        if (current == null) {
            System.out.printf("Node dengan index %d tidak ditemukan.\n", index);
            return;
        }
        current.data.tampil();
    }

    public void size() {
        System.out.printf("Jumlah data: %d\n", size);
    }
}