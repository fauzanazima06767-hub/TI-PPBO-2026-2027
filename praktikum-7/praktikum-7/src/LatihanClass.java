public class LatihanClass {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa("Budi", "111", 3.5);

        m1.ipk = 9.9;
        m1.nim = "";

        System.out.println("IPK: " + m1.ipk);
        System.out.println("NIM: " + m1.nim);
    }
}