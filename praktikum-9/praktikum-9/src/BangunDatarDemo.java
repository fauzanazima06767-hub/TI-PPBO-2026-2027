public class BangunDatarDemo {
    public static void main(String[] args) {

        BangunDatar[] daftarBangun = {
                new Lingkaran(7),
                new Persegi(5),
                new PersegiPanjang(8, 4),
                new Lingkaran(3),
                new Persegi(10)
        };

        double totalLuas = 0;
        double luasTerbesar = 0;
        String namaTerbesar = "";

        for (BangunDatar bangun : daftarBangun) {

            bangun.tampilkanInfo();

            double luas = bangun.hitungLuas();
            totalLuas += luas;

            if (luas > luasTerbesar) {
                luasTerbesar = luas;
                namaTerbesar = bangun.namaBangun;
            }
        }

        System.out.println("Total Luas: " + totalLuas);
        System.out.println("Bangun dengan luas terbesar: " + namaTerbesar);
        System.out.println("Luas terbesar: " + luasTerbesar);
    }
}