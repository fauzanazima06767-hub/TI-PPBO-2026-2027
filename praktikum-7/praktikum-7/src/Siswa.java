public class Siswa {
    private double nilai;

    // Constructor
    public Siswa(double nilai) {
        setNilai(nilai);
    }

    // Getter
    public double getNilai() {
        return nilai;
    }

    // Setter
    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai harus antara 0-100!");
        }
    }

    // Getter nilai huruf
    public String getNilaiHuruf() {
        if (nilai >= 85) {
            return "A";
        } else if (nilai >= 75) {
            return "B";
        } else if (nilai >= 65) {
            return "C";
        } else if (nilai >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
}