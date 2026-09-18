import java.util.Scanner;

public class BilanganTerbesar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c, terbesar;

        System.out.print("Masukkan bilangan pertama: ");
        a = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        b = input.nextInt();

        System.out.print("Masukkan bilangan ketiga: ");
        c = input.nextInt();

        if (a > b) {
            if (a > c) {
                terbesar = a;
            } else {
                terbesar = c;
            }
        } else {
            if (b > c) {
                terbesar = b;
            } else {
                terbesar = c;
            }
        }

        System.out.println("Bilangan terbesar: " + terbesar);

        input.close();
    }
}