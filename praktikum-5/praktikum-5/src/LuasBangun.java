public class LuasBangun {

    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {

        System.out.println("Luas Persegi Panjang");
        System.out.println("Panjang 10, Lebar 5 = " + luasPersegiPanjang(10, 5));
        System.out.println("Panjang 8, Lebar 4 = " + luasPersegiPanjang(8, 4));

        System.out.println();

        System.out.println("Luas Lingkaran");
        System.out.println("Jari-jari 7 = " + luasLingkaran(7));
        System.out.println("Jari-jari 5 = " + luasLingkaran(5));
    }
}