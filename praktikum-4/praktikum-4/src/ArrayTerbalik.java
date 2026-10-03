import java.util.Scanner;

public class ArrayTerbalik {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] angka = new int[10];

        // Mengisi array
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Menampilkan array dari belakang
        System.out.println();
        System.out.println("Array dalam urutan terbalik:");

        for (int i = angka.length - 1; i >= 0; i--) {
            System.out.print(angka[i] + " ");
        }

        input.close();
    }
}