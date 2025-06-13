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
  }
}
