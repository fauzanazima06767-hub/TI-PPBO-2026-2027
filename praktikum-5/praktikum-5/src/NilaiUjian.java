import java.util.Scanner;

public class NilaiUjian {

    static int cariNilaiMinimum(int[] data) {
        int min = data[0];

        for (int nilai : data) {
            if (nilai < min) {
                min = nilai;
            }
        }

        return min;
    }

    static int cariNilaiMaksimum(int[] data) {
        int max = data[0];

        for (int nilai : data) {
            if (nilai > max) {
                max = nilai;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai ujian: ");
        int jumlah = input.nextInt();

        int[] nilaiUjian = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilaiUjian[i] = input.nextInt();
        }

        System.out.println();

        System.out.println("Nilai minimum: "
                + cariNilaiMinimum(nilaiUjian));

        System.out.println("Nilai maksimum: "
                + cariNilaiMaksimum(nilaiUjian));

        input.close();
    }
}