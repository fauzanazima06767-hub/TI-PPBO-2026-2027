import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama : ");
        int a = sc.nextInt();

        System.out.print("Masukkan bilangan kedua : ");
        int b = sc.nextInt();

        System.out.println("Operasi (+) : " + (a + b));

        System.out.println("Operasi (-) : " + (a - b));

        System.out.println("Operasi (/) : " + (a / b));

        System.out.println("Operasi (*) : " + (a * b));

        System.out.println("Operasi (%) : " + (a % b));

        System.out.println("Perbandingan (>) : " + (a > b));

        System.out.println("Perbandingan (<) : " + (a < b));

        System.out.println("Perbandingan (==) : " + (a == b));

        sc.close();
    }
}