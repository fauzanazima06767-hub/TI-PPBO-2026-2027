import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlah = input.nextInt();

        int[] angka = new int[jumlah];

        // Input array
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        // Menampilkan array sebelum diurutkan
        System.out.println();
        System.out.println("Array sebelum diurutkan:");

        for (int i = 0; i < jumlah; i++) {
            System.out.print(angka[i] + " ");
        }

        // Proses Bubble Sort ascending
        for (int i = 0; i < jumlah - 1; i++) {
            for (int j = 0; j < jumlah - 1 - i; j++) {

                if (angka[j] > angka[j + 1]) {
                    int sementara = angka[j];
                    angka[j] = angka[j + 1];
                    angka[j + 1] = sementara;
                }
            }
        }

        // Menampilkan array setelah diurutkan
        System.out.println();
        System.out.println();
        System.out.println("Array setelah diurutkan:");

        for (int i = 0; i < jumlah; i++) {
            System.out.print(angka[i] + " ");
        }

        input.close();
    }
}