
import java.util.Scanner;

public class KalkulatorMethod {

    // Method penjumlahan 2 angka
    static double tambah(double a, double b) {
        return a + b;
    }

    // Method overloading: penjumlahan 3 angka
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    // Method pengurangan
    static double kurang(double a, double b) {
        return a - b;
    }

    // Method perkalian
    static double kali(double a, double b) {
        return a * b;
    }

    // Method pembagian
    static double bagi(double a, double b) {
        return a / b;
    }

    // Method pangkat
    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    // Method akar kuadrat
    static double akarKuadrat(double a) {
        return Math.sqrt(a);
    }

    // Method mencari hasil terbesar dalam riwayat
    static double riwayatKeMaksimum(double[] riwayatHasil) {
        double maksimum = riwayatHasil[0];

        for (int i = 1; i < riwayatHasil.length; i++) {
            if (riwayatHasil[i] > maksimum) {
                maksimum = riwayatHasil[i];
            }
        }

        return maksimum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array untuk menyimpan riwayat hasil perhitungan
        double[] riwayatHasil = new double[100];
        int jumlahRiwayat = 0;
        int pilihan;

        do {
            System.out.println("\n=== KALKULATOR METHOD ===");
            System.out.println("1. Tambah 2 angka");
            System.out.println("2. Tambah 3 angka");
            System.out.println("3. Kurang");
            System.out.println("4. Kali");
            System.out.println("5. Bagi");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar Kuadrat");
            System.out.println("0. Keluar");
            System.out.print("Pilih operasi: ");
            pilihan = input.nextInt();

            double a, b, hasil = 0;
            boolean dihitung = false;

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = tambah(a, b);
                    dihitung = true;
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();
                    System.out.print("Masukkan angka ketiga: ");
                    double c = input.nextDouble();

                    hasil = tambah(a, b, c);
                    dihitung = true;
                    break;

                case 3:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = kurang(a, b);
                    dihitung = true;
                    break;

                case 4:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    hasil = kali(a, b);
                    dihitung = true;
                    break;

                case 5:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    if (b == 0) {
                        System.out.println("Error: angka pembagi tidak boleh 0.");
                    } else {
                        hasil = bagi(a, b);
                        dihitung = true;
                    }
                    break;

                case 6:
                    System.out.print("Masukkan angka dasar: ");
                    a = input.nextDouble();
                    System.out.print("Masukkan pangkat: ");
                    b = input.nextDouble();

                    hasil = pangkat(a, b);
                    dihitung = true;
                    break;

                case 7:
                    System.out.print("Masukkan angka: ");
                    a = input.nextDouble();

                    if (a < 0) {
                        System.out.println(
                                "Error: angka tidak boleh negatif."
                        );
                    } else {
                        hasil = akarKuadrat(a);
                        dihitung = true;
                    }
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

            // Simpan hasil hanya jika perhitungan berhasil
            if (dihitung) {
                System.out.println("Hasil = " + hasil);

                if (jumlahRiwayat < riwayatHasil.length) {
                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                } else {
                    System.out.println(
                            "Riwayat penuh, hasil tidak disimpan."
                    );
                }
            }

        } while (pilihan != 0);

        // Tampilkan hasil maksimum ketika pengguna keluar
        if (jumlahRiwayat > 0) {
            // Salin riwayat agar tidak mengirim elemen array kosong
            double[] riwayatAktif = new double[jumlahRiwayat];

            for (int i = 0; i < jumlahRiwayat; i++) {
                riwayatAktif[i] = riwayatHasil[i];
            }

            System.out.println(
                    "Hasil terbesar dari seluruh perhitungan = "
                            + riwayatKeMaksimum(riwayatAktif)
            );
        } else {
            System.out.println("Belum ada perhitungan yang dilakukan.");
        }

        input.close();
    }
}
