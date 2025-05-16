package P12.Source_Code;

public class SLLMain07 {
    public static void main(String[] args) {
        SingleLinkedList07 sll = new SingleLinkedList07();
        Mahasiswa07 mhs1 = new Mahasiswa07("101", "alpha", "1A", 4.0);
        Mahasiswa07 mhs2 = new Mahasiswa07("102", "beta", "1B", 3.7);
        Mahasiswa07 mhs3 = new Mahasiswa07("103", "gamma", "1A", 3.6);
        Mahasiswa07 mhs4 = new Mahasiswa07("104", "tetha", "1C", 3.9);
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
