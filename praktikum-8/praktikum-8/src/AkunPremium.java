public class AkunPremium extends Akun {
    private double batasKredit;

    public AkunPremium(String username, double saldo, double batasKredit) {
        super(username, saldo);
        this.batasKredit = batasKredit;
    }

    public void cekLimit() {
        System.out.println("Username: " + username);
        System.out.println("Saldo: " + saldo);
        System.out.println("Batas Kredit: " + batasKredit);
    }
}