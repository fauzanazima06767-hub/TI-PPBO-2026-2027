import java.util.Scanner;

public class TerbesarKedua {
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

        // Mencari nilai terbesar
        int terbesar = angka[0];

        for (int i = 1; i < jumlah; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }
        }

        // Mencari nilai terbesar kedua
        int terbesarKedua = Integer.MIN_VALUE;

        for (int i = 0; i < jumlah; i++) {
            if (angka[i] > terbesarKedua && angka[i] < terbesar) {
                terbesarKedua = angka[i];
            }
        }

        System.out.println();
        System.out.println("Nilai terbesar: " + terbesar);
        System.out.println("Nilai terbesar kedua: " + terbesarKedua);

        input.close();
    }
}