public class KonversiNilai {
    public static void main(String[] args) {
        int nilai = 98;
        char huruf;

        if (nilai >= 85) {
            huruf = 'A';
        } else if (nilai >= 70) {
            huruf = 'B';
        } else if (nilai >= 55) {
            huruf = 'C';
        } else {
            huruf = 'E';
        }

        System.out.println("Nilai huruf: " + huruf);
    }
}