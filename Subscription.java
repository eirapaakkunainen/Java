public abstract class Subscription{

    private String lehden_nimi;
    private String tilaajan_nimi;
    private String toimitusosoite;
    private double kuukausihinta;

    //getterit
    public String get_lehden_nimi() {
        return lehden_nimi;
    }
    public String get_tilaajan_nimi() {
        return tilaajan_nimi;
    }
    public String get_toimitusosoite() {
        return toimitusosoite;
    }
    public double get_kuukausihinta() {
        return kuukausihinta;
    }

    //setterit
    public void set_lehden_nimi(String lehti) {
        this.lehden_nimi = lehti;
    }
    public void set_tilajan_nimi(String tilaaja) {
        this.tilaajan_nimi = tilaaja;
    }
    public void set_toimitusosoite(String osoite) {
        this.toimitusosoite = osoite;
    }
    public void set_kuukausihinta(double kkhinta) {
        this.kuukausihinta = kkhinta;
    }

    //Konstruktorit
    public Subscription(String lehti, String tilaaja, String osoite, double kkhinta) {
        this.lehden_nimi = lehti;
        this.tilaajan_nimi = tilaaja;
        this.toimitusosoite = osoite;
        this.kuukausihinta = kkhinta;
    }

    //printtaus
    abstract public void printInvoice();
}

