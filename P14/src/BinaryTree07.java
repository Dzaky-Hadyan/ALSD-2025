package P14.src;

public class BinaryTree07 {
  Node07 root;

  public BinaryTree07() {
    root = null;
  }

  public boolean isEmpty() {
    return root == null;
  }

  public void add(Mahasiswa07 mahasiswa) {
    Node07 newNode = new Node07(mahasiswa);
    if (isEmpty()) {
      root = newNode;
    } else {
      Node07 current = root;
      Node07 parent = null;
      while (true) {
        parent = current;
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
          current = current.left;
          if (current == null) {
            parent.left = newNode;
            return;
          }
        } else {
          current = current.right;
          if (current == null) {
            parent.right = newNode;
            return;
          }
        }
      }
    }
  }

  boolean find(double ipk) {
    boolean result = false;
    Node07 current = root;
    while (current != null) {
      if (current.mahasiswa.ipk == ipk) {
        result = true;
        break;
      } else if (ipk > current.mahasiswa.ipk) {
        current = current.right;
      } else {
        current = current.left;
      }
    }
    return result;
  }

  void traversePreOrder(Node07 node) {
    if (node != null) {
      node.mahasiswa.tampilInformasi();
      traversePreOrder(node.left);
      traversePreOrder(node.right);
    }
  }

  void traverseInOrder(Node07 node) {
    if (node != null) {
      traverseInOrder(node.left);
      node.mahasiswa.tampilInformasi();
      traverseInOrder(node.right);
    }
  }

  void traversePostOrder(Node07 node) {
    if (node != null) {
      traversePostOrder(node.left);
      traversePostOrder(node.right);
      node.mahasiswa.tampilInformasi();
    }
  }

  Node07 getSuccessor(Node07 del) {
    Node07 successor = del.right;
    Node07 successorParent = del;
    while (successor.left != null) {
      successorParent = successor;
      successor = successor.left;
    }
    if (successor != del.right) {
      successorParent.left = successor.right;
      successor.right = del.right;
    }
    return successor;
  }

  void delete(double ipk) {
    if (isEmpty()) {
      System.out.println("Binary tree kosong");
      return;
    }
    //cari node (current) yang akan dihapus
    Node07 parent = root;
    Node07 current = root;
    boolean isLeftChild = false;
    while (current != null) {
      if (current.mahasiswa.ipk == ipk) {
        break;
      } else if (ipk < current.mahasiswa.ipk) {
        parent = current;
        current = current.left;
        isLeftChild = true;
      } else if (ipk > current.mahasiswa.ipk) {
        parent = current;
        current = current.right;
        isLeftChild = false;
      }
    }
    //penghapusan
    if (current == null) {
      System.out.println("Data tidak ditemukan");
      return;
    } else {
      //jika tidak ada anak (leaf), maka node dihapus
      if (current.left == null && current.right == null) {
        if (current == root) {
          root = null;
        } else {
          if (isLeftChild) {
            parent.left = null;
          } else {
            parent.right = null;
          }
        }
      } else if (current.left == null) {//jika hanya punya 1 anak (kanan)
        if (current == root) {
          root = current.right;
        } else {
          if (isLeftChild) {
            parent.left = current.right;
          } else {
            parent.right = current.right;
          }
        }
      } else if (current.right == null) {//jika hanya punya 1 anak (kiri)
        if (current == root) {
          root = current.left;
        } else {
          if (isLeftChild) {
            parent.left = current.left;
          } else {
            parent.right = current.left;
          }
        }
      } else {//jika punya 2 anak
        Node07 successor = getSuccessor(current);
        System.out.println("Jika 2 anak, current = ");
        successor.mahasiswa.tampilInformasi();
        if (current == root) {
          root = successor;
        } else {
          if (isLeftChild) {
            parent.left = successor;
          } else {
            parent.right = successor;
          }
        }
        successor.left = current.left;
      }
    }
  }

  Node07 addRekursif(Node07 parent, Mahasiswa07 mahasiswa) {
    if (parent == null) {
      Node07 newNode = new Node07(mahasiswa);
      if (isEmpty()) {
        root = newNode;
      }
      return newNode;
    } else if (parent.mahasiswa.ipk == mahasiswa.ipk) {
      Node07 newNode = new Node07(mahasiswa);
      return newNode;
    } else if (mahasiswa.ipk < parent.mahasiswa.ipk) {
      parent.left = addRekursif(parent.left, mahasiswa);
    } else {
      parent.right = addRekursif(parent.right, mahasiswa);
    }
    Node07 newNode = new Node07(mahasiswa);
    return newNode;
  }

  void cariMinIPK() {
    if (isEmpty()) {
      System.out.println("Binary tree kosong");
    } else {
      Node07 current = root;
      while (current.left != null) {
        current = current.left;
      }
      System.out.println("Mahasiswa dengan IPK paling kecil:");
      current.mahasiswa.tampilInformasi();
    }
  }

  void cariMaxIPK() {
    if (isEmpty()) {
      System.out.println("Binary tree kosong");
    } else {
      Node07 current = root;
      while (current.right != null) {
        current = current.right;
      }
      System.out.println("Mahasiswa dengan IPK paling besar:");
      current.mahasiswa.tampilInformasi();
    }
  }

  void tampilMahasiswaIPKdiAtas(Node07 node, double ipkBatas) {
    if (node != null) {
      tampilMahasiswaIPKdiAtas(node.left, ipkBatas);
      if (node.mahasiswa.ipk > ipkBatas) {
        node.mahasiswa.tampilInformasi();
      }
      tampilMahasiswaIPKdiAtas(node.right, ipkBatas);
    }
  }
}
