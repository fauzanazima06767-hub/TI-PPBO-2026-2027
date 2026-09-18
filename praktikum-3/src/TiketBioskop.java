import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int umur;
        boolean mahasiswa;
        int harga;

        System.out.print("Masukkan umur: ");
        umur = input.nextInt();

        System.out.print("Apakah mahasiswa? (true/false): ");
        mahasiswa = input.nextBoolean();

        if (mahasiswa && umur < 25) {
            harga = 20000;
        } else {
            harga = 35000;
        }

        System.out.println("Harga tiket: Rp " + harga);

        input.close();
    }
}