public class BankDemo {
    public static void main(String[] args) {

        // Membuat dua objek rekening
        RekeningBank rek1 = new RekeningBank(
                "001", "Budi", "Tabungan", 100000
        );

        RekeningBank rek2 = new RekeningBank(
                "002", "Siti", "Giro", 200000
        );

        // Menampilkan saldo awal
        System.out.println("=== SALDO AWAL ===");
        System.out.println("Saldo Budi: " + rek1.getSaldo());
        System.out.println("Saldo Siti: " + rek2.getSaldo());

        // Skenario 1: Setor pada kedua rekening
        System.out.println("\n=== TRANSAKSI SETOR ===");
        rek1.setor(50000);
        rek2.setor(100000);

        // Skenario 2: Tarik pada kedua rekening
        System.out.println("\n=== TRANSAKSI TARIK ===");
        rek1.tarik(30000);
        rek2.tarik(50000);

        // Skenario 3: Transfer berhasil
        System.out.println("\n=== TRANSFER BERHASIL ===");
        rek1.transferKe(rek2, 40000);

        // Skenario 4: Transfer gagal
        System.out.println("\n=== TRANSFER GAGAL ===");
        rek1.transferKe(rek2, 500000);

        // Skenario 5: Transfer jumlah tidak valid
        System.out.println("\n=== TRANSFER TIDAK VALID ===");
        rek1.transferKe(rek2, -10000);

        // Menampilkan mutasi akhir kedua rekening
        System.out.println("\n=== MUTASI AKHIR ===");
        rek1.cetakMutasi();
        rek2.cetakMutasi();
    }
}