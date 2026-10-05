public class KonversiSuhu {

    // Celsius ke Fahrenheit
    static double konversiSuhu(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Celsius ke Kelvin atau Fahrenheit
    static double konversiSuhu(double celsius, String skalaTujuan) {

        if (skalaTujuan.equalsIgnoreCase("Kelvin")) {
            return celsius + 273.15;
        } else if (skalaTujuan.equalsIgnoreCase("Fahrenheit")) {
            return (celsius * 9 / 5) + 32;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println("25 Celsius ke Fahrenheit = "
                + konversiSuhu(25));

        System.out.println("25 Celsius ke Kelvin = "
                + konversiSuhu(25, "Kelvin"));

        System.out.println("25 Celsius ke Fahrenheit = "
                + konversiSuhu(25, "Fahrenheit"));
    }
}