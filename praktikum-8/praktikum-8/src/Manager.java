public class Manager extends Pegawai {
    private double tunjanganJabatan;

    public Manager(String nama, String nip, double gajiPokok,
                   double tunjanganJabatan) {

        super(nama, nip, gajiPokok);

        System.out.println("2. Constructor Manager dijalankan");

        this.tunjanganJabatan = tunjanganJabatan;
    }
}