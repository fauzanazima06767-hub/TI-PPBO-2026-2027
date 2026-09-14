public class VariabelDemo {
        public static void main(String[] args) {

            // Widening
            int nilaiBulat = 9;
            double nilaiDouble = nilaiBulat;
            System.out.println("Widening: " + nilaiDouble);

            // Narrowing
            double pecahan = 9.8;
            int hasilCasting = (int) pecahan;
            System.out.println("Narrowing: " + hasilCasting);
        }
    }