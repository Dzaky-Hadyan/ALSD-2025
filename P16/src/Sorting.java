import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
  public static void main(String[] agrs) {
    ArrayList<String> daftarSiswa = new ArrayList<>();
    daftarSiswa.add("Zainab");
    daftarSiswa.add("Andi");
    daftarSiswa.add("Rara");
    Collections.sort(daftarSiswa);

    System.out.println(daftarSiswa);
  }
}
