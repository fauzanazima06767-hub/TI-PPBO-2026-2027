import java.util.Scanner;

public class HitungBMI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double berat;
        double tinggi;
        double bmi;

        System.out.print("Masukkan berat badan (kg): ");
        berat = input.nextDouble();

        System.out.print("Masukkan tinggi badan (meter): ");
        tinggi = input.nextDouble();

        bmi = berat / (tinggi * tinggi);

        System.out.println("BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi < 25) {
            System.out.println("Kategori: Normal");
        } else if (bmi < 30) {
            System.out.println("Kategori: Gemuk");
        } else {
            System.out.println("Kategori: Obesitas");
        }

        input.close();
    }
}