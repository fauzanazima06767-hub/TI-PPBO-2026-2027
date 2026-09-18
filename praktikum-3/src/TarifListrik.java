import java.util.Scanner;

public class TarifListrik {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Konstanta tarif listrik
        final int TARIF_450 = 415;
        final int TARIF_900 = 1352;
        final int TARIF_1300 = 1444;
        final int TARIF_2200 = 1444;
        final int TARIF_DIATAS_2200 = 1600;

        int daya;
        double kwh;
        int tarif = 0;
        double total;

        // Input daya listrik
        System.out.print("Masukkan daya listrik (VA): ");
        daya = input.nextInt();

        // Input pemakaian listrik
        System.out.print("Masukkan pemakaian listrik (kWh): ");
        kwh = input.nextDouble();

        // Validasi kWh
        if (kwh < 0 || kwh == 0) {
            System.out.println("Error: Pemakaian kWh harus lebih dari 0.");
        } else {

            // Menentukan tarif berdasarkan daya
            if (daya == 450) {
                tarif = TARIF_450;
            } else if (daya == 900) {
                tarif = TARIF_900;
            } else if (daya == 1300) {
                tarif = TARIF_1300;
            } else if (daya == 2200) {
                tarif = TARIF_2200;
            } else if (daya > 2200) {
                tarif = TARIF_DIATAS_2200;
            } else {
                System.out.println("Error: Golongan daya tidak tersedia.");
                return;
            }

            // Menghitung total tagihan
            total = kwh * tarif;

            // Menampilkan hasil
            System.out.println();
            System.out.println("================================");
            System.out.println("        TAGIHAN LISTRIK");
            System.out.println("================================");
            System.out.println("Golongan Daya : " + daya + " VA");
            System.out.println("Pemakaian     : " + kwh + " kWh");
            System.out.println("Tarif per kWh : Rp " + tarif);
            System.out.println("Total Tagihan : Rp " + total);
            System.out.println("================================");
        }

        input.close();
    }

}
