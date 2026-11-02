public class HewanDemo {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Kitty";
        System.out.println("Nama Kucing: " + kucing.nama);
        kucing.bersuara();

        Anjing anjing = new Anjing();
        anjing.nama = "Teddy";
        System.out.println("Nama Anjing: " + anjing.nama);
        anjing.bersuara();
    }
}