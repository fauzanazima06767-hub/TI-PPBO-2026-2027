import java.util.Scanner;

public class KalkulatorBangunDatar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * menghitung dan menampilkan
         * luas serta keliling persegi panjang
         */
        System.out.print("Masukkan panjang : ");
        double panjang = sc.nextDouble();

        System.out.print("Masukkan lebar : ");
        double lebar = sc.nextDouble();

        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);


        /*
         * menghitung dan menampilkan
         * luas serta keliling lingkaran
         */
        System.out.print("Masukkan jari-jari lingkaran : ");
        double jari = sc.nextDouble();

        double luasLingkaran = 3.14 * jari * jari;
        double kelilingLingkaran = 2 * 3.14 * jari;

        System.out.println("Luas lingkaran : " + luasLingkaran);
        System.out.println("Keliling lingkaran : " + kelilingLingkaran);


        /*
         * menyimpan hasil luas persegi panjang
         * ke dalam variabel boolean
         */
        boolean luasBesar = luas > 100;

        System.out.println("Apakah " + luas + " lebih dari 100 : " + luasBesar);
        System.out.println("Luas persegi panjang : " + luas);

        sc.close();
    }
}