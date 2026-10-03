import java.util.Scanner;

public class Perkalian {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        System.out.println();
        System.out.println("Tabel Perkalian " + bilangan);

        for (int i = 1; i <= 10; i++) {
            System.out.println(bilangan + " x " + i + " = " + (bilangan * i));
        }

        input.close();
    }
}