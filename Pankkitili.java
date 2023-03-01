public class Pankkitili {

    private String tilinro;
    private String omistaja;
    private double saldo; 

    // Asetusmetodit
    public void setOmistaja(String omistaja) {
        this.omistaja = omistaja;
    }

    public void setTilinro(String tilinro) {
        this.tilinro = tilinro;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void TietojenTulostus() {
        System.out.printf("Tilin %s omistaa %s ja tilin saldo euroina on %.2f%n", tilinro, omistaja, saldo);
    }

    // Saantimetodit
    public String getTilinro() {
        return tilinro;
    }

    public String getOmistaja() {
        return omistaja;
    }

    public double getSaldo() {
        return saldo;
    }

    // Konstruktori
    public Pankkitili() {
        tilinro = "0000";
        omistaja = "ei kukaan";
        saldo = 0;
    }
}