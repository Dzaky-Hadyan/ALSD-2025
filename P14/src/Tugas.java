package P14.src;

import java.util.Scanner;

public class Tugas {
  public static void main(String[] args) {
    BinaryTree07 bst = new BinaryTree07();
    Mahasiswa07 mhs1 = new Mahasiswa07("12345", "Alpha", "A", 3.57);
    Mahasiswa07 mhs2 = new Mahasiswa07("12346", "Beta", "B", 3.35);
    Mahasiswa07 mhs3 = new Mahasiswa07("12347", "Theta", "C", 3.80);
    bst.addRekursif(bst.root, mhs1);
    bst.addRekursif(bst.root, mhs2);
    bst.addRekursif(bst.root, mhs3);
    bst.cariMinIPK();
    bst.cariMaxIPK();
    bst.tampilMahasiswaIPKdiAtas(bst.root, 3.4);

    BinaryTreeArray07 bta = new BinaryTreeArray07();
    Mahasiswa07 mhs4 = new Mahasiswa07("244260121", "Ali", "A", 3.57);
    Mahasiswa07 mhs5 = new Mahasiswa07("244260185", "Candra", "C", 3.41);
    Mahasiswa07 mhs6 = new Mahasiswa07("244260221", "Badar", "B", 3.75);
    Mahasiswa07 mhs7 = new Mahasiswa07("244260220", "Dewi", "B", 3.35);
    Mahasiswa07 mhs8 = new Mahasiswa07("244260131", "Devi", "A", 3.48);
    Mahasiswa07 mhs9 = new Mahasiswa07("244260205", "Ehsan", "D", 3.61);
    Mahasiswa07 mhs10 = new Mahasiswa07("244260170", "Fizi", "B", 3.86);

    Mahasiswa07[] dataMahasiswa = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
    int idxLast = 9;
    bta.populateData(dataMahasiswa, idxLast);
    bta.add(mhs8);
    bta.add(mhs9);
    bta.add(mhs10);
    bta.traversePreOrder(0);
  }
}
