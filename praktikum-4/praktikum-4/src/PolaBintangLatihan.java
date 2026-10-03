import java.util.Scanner;

public class PolaBintangLatihan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ukuran: ");
        int ukuran = input.nextInt();

        // Pola segitiga terbalik
        System.out.println();
        System.out.println("Segitiga Terbalik:");

        for (int i = ukuran; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pola persegi
        System.out.println();
        System.out.println("Pola Persegi:");

        for (int i = 1; i <= ukuran; i++) {
            for (int j = 1; j <= ukuran; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}