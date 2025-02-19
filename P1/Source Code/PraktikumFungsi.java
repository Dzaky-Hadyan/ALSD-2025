import java.util.Scanner;

public class PraktikumFungsi {
    static int tampilPendapatan(int[][] stok, int i) {
        int pendapatan = 0;
        for (int j = 0; j < 4; j++) {
            pendapatan += stok[i][j];
        }
        return pendapatan;
    }
    static int tampilStock(int[][] stok, int i) {
        if (i == 0) {
            return stok[3][i] - 1;
        } else if (i == 1) {
            return stok[3][i] -2;
        } else if (i == 3) {
            return stok[3][i] - 5;
        } else {
            return stok[3][i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] stok = {{10, 5, 15, 7},
                        {6, 11, 9, 12},
                        {2, 10, 10, 5},
                        {5, 7, 12, 9}};
        System.out.print("1. Tampil pendapatan tiap cabang\n2. Tampil jumlah stock bunga di cabang 4\nMenu: ");
        int menu = sc.nextInt();
        switch (menu) {
            case 1:
                int totalPendapatan = 0;
                for (int i = 0; i < 4; i++) {
                    System.out.printf("Pendapatan royalgarden %d: %d\n", i+1, tampilPendapatan(stok, i));
                    totalPendapatan += tampilPendapatan(stok, i);
                }
                System.out.printf("Total pendapatan: %d", totalPendapatan);
                break;
            case 2:
                for (int i = 0; i < 4; i++) {
                    System.out.printf("Jumlah stok bunga ke-%d: %d\n", i+1, tampilStock(stok, i));
                }
                break;
        }
        sc.close();
    }
}