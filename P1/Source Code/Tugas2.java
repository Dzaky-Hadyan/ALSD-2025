import java.util.Scanner;

public class Tugas2 {
    public static int volumeKubus(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }
    public static int luasPermukaanKubus(int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }
    public static int kelilingKubus(int sisi) {
        int keliling = 12 * sisi;
        return keliling;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu, sisi;
        System.out.println("Kalkulator Kubus");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Luas Permukaan Kubus");
        System.out.println("3. Keliling Kubus");
        System.out.print("Menu: ");
        menu = sc.nextInt();
        System.out.print("Panjang sisi: ");
        sisi = sc.nextInt();

        switch (menu) {
            case 1:
                System.out.printf("Volume kubus: %d", volumeKubus(sisi));
                break;
            case 2:
                System.out.printf("Luas permukaan kubus: %d", luasPermukaanKubus(sisi));
                break;
            case 3:
                System.out.printf("Keliling kubus: %d", kelilingKubus(sisi));
                break;
        }
        sc.close();
    }
}
