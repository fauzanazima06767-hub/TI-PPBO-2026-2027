import java.util.Scanner;

public class HitungTarifListrik {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int daya;
        double pemakaian;
        double tarif;
        double total;
        String golongan;

        System.out.print("Masukkan daya listrik (VA): ");
        daya = input.nextInt();

        System.out.print("Masukkan pemakaian listrik (kWh): ");
        pemakaian = input.nextDouble();

        if (pemakaian <= 0) {
            System.out.println("Error: pemakaian harus lebih dari 0 kWh.");
        } else {

            if (daya == 450) {
                golongan = "450 VA";
                tarif = 500;
            } else if (daya == 900) {
                golongan = "900 VA";
                tarif = 1000;
            } else if (daya == 1300) {
                golongan = "1300 VA";
                tarif = 1500;
            } else if (daya == 2200) {
                golongan = "2200 VA";
                tarif = 2000;
            } else if (daya > 2200) {
                golongan = "Di atas 2200 VA";
                tarif = 2500;
            } else {
                System.out.println("Golongan daya tidak tersedia.");
                return;
            }

            total = pemakaian * tarif;

            System.out.println("\n===== TAGIHAN LISTRIK =====");
            System.out.println("Golongan   : " + golongan);
            System.out.println("Pemakaian  : " + pemakaian + " kWh");
            System.out.println("Tarif      : Rp " + tarif);
            System.out.println("Total      : Rp " + total);
        }

        input.close();
    }
}