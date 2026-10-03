import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // KKM untuk menentukan mahasiswa lulus atau tidak lulus
        int KKM = 70;

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = input.nextInt();

        // Membuat array sesuai jumlah mahasiswa
        int[] nilai = new int[N];

        // Input nilai setiap mahasiswa
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        // Variabel untuk menghitung total, nilai tertinggi,
        // nilai terendah, dan jumlah mahasiswa lulus
        int total = 0;
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        // Mengolah nilai menggunakan for loop
        for (int i = 0; i < N; i++) {

            // Menghitung total nilai
            total += nilai[i];

            // Mencari nilai tertinggi
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }

            // Mencari nilai terendah
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }

            // Menghitung jumlah mahasiswa lulus
            if (nilai[i] >= KKM) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        // Menghitung rata-rata
        double rataRata = (double) total / N;

        // Menampilkan nilai sebelum diurutkan
        System.out.println();
        System.out.println("===== HASIL PENGOLAHAN NILAI =====");
        System.out.println("Nilai sebelum diurutkan:");

        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }

        // Bubble Sort ascending
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {

                if (nilai[j] > nilai[j + 1]) {
                    int sementara = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = sementara;
                }
            }
        }

        // Menampilkan nilai setelah diurutkan
        System.out.println();
        System.out.println();
        System.out.println("Nilai setelah diurutkan:");

        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }

        // Menampilkan hasil pengolahan
        System.out.println();
        System.out.println();
        System.out.println("===== LAPORAN NILAI KELAS =====");
        System.out.println("Jumlah mahasiswa   : " + N);
        System.out.println("Nilai rata-rata    : " + rataRata);
        System.out.println("Nilai tertinggi    : " + nilaiTertinggi);
        System.out.println("Nilai terendah     : " + nilaiTerendah);
        System.out.println("Jumlah mahasiswa lulus      : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);

        input.close();
    }
}