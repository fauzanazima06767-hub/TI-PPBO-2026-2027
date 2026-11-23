public class BangunDatar {

    protected String namaBangun;

    public BangunDatar(String namaBangun) {
        this.namaBangun = namaBangun;
    }

    public double hitungLuas() {
        return 0;
    }

    public double hitungKeliling() {
        return 0;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Bangun: " + namaBangun);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
        System.out.println("----------------------");
    }
}