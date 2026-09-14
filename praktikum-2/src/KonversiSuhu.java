import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Celcius : ");
        double suhuCelcius = sc.nextDouble();

        double fahrenheit = (suhuCelcius * 9 / 5) + 32;

        System.out.println("Hasil Konversi : ");
        System.out.println(suhuCelcius + " celcius = " + fahrenheit + " fahrenheit");

        sc.close();
    }
}