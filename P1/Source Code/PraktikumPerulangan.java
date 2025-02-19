import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PraktikumPerulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nim, dikurang;
        long pengurang;
        System.out.print("Masukkan NIM: ");
        nim = sc.nextDouble();
        dikurang = nim / 100;
        pengurang = (long) dikurang;
        dikurang -= pengurang;
        dikurang *= 100;
        DecimalFormat df = new DecimalFormat("#");
        df.setRoundingMode(RoundingMode.CEILING);
        if (dikurang < 10) {
            dikurang += 10;
        }
        System.out.printf("=============\nn: %.0f\n", dikurang);
        for (int i = 1; i <= dikurang + 1; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else {
                if (i % 2 != 0) {
                    System.out.print("*");
                } else {
                System.out.print(i);
                }
            }
        }
        sc.close();
    }
}