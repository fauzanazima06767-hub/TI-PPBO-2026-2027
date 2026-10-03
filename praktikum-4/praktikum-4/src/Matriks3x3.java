import java.util.Scanner;

public class Matriks3x3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriks = new int[3][3];

        // Input matriks
        System.out.println("Masukkan elemen matriks 3x3:");

        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 3; kolom++) {
                System.out.print("Matriks[" + baris + "][" + kolom + "] = ");
                matriks[baris][kolom] = input.nextInt();
            }
        }

        // Menampilkan matriks
        System.out.println();
        System.out.println("Matriks:");

        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 3; kolom++) {
                System.out.print(matriks[baris][kolom] + " ");
            }
            System.out.println();
        }

        // Menghitung jumlah setiap baris
        System.out.println();
        System.out.println("Jumlah setiap baris:");

        int totalMatriks = 0;

        for (int baris = 0; baris < 3; baris++) {
            int jumlahBaris = 0;

            for (int kolom = 0; kolom < 3; kolom++) {
                jumlahBaris += matriks[baris][kolom];
            }

            System.out.println("Jumlah baris " + (baris + 1) + ": " + jumlahBaris);

            totalMatriks += jumlahBaris;
        }

        // Menampilkan jumlah seluruh elemen
        System.out.println();
        System.out.println("Jumlah seluruh elemen: " + totalMatriks);

        input.close();
    }
}