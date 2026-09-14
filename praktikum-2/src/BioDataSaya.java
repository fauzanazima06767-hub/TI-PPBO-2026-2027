import java.util.Scanner;

public class BioDataSaya {
    public static void main(String[] args) {
        int umur = 20;
        double tinggi = 169.0;
        char inisial = 'F';
        boolean statusMahasiswa = true;

        Scanner sc = new Scanner(System.in);

        System.out.print("nama : ");
        String nama = sc.nextLine();

        System.out.print("NIM : ");
        String nim = sc.nextLine();

        System.out.print("Program Studi : ");
        String prodi = sc.nextLine();

        System.out.println("Nama : " + nama + "\nNIM : " + nim + "\nProgram Studi : " + prodi);

        System.out.println(umur);
        System.out.println(tinggi);
        System.out.println(inisial);
        System.out.println(statusMahasiswa);
    }
}