public class RegularSubscription extends Subscription{
    private int tilauksen_kesto;

    //getterit
    public int getKesto() {
        return tilauksen_kesto;
    }

    //setterit
    public void setKesto(int newkesto) {
        this.tilauksen_kesto = newkesto;
    }

    //konstruktori
    public RegularSubscription(String lehden_nimi, String tilaajan_nimi, String toimitusosoite, double kuukausihinta, int tilauksen_kesto){
        super(lehden_nimi, tilaajan_nimi, toimitusosoite, kuukausihinta);
        this.tilauksen_kesto = tilauksen_kesto;
    }

    //tulostus
    public void printInvoice(){
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Kiitos tilauksesta!");
        System.out.println("Tilauksen on tyyppi on normitilaus");
        System.out.println("Lehden nimi: "+get_lehden_nimi());
        System.out.println("Tilaajan nimi: "+get_tilaajan_nimi());
        System.out.println("Toimitusosoite: "+get_toimitusosoite());
        System.out.println("Lehden kuukausihinta: "+get_kuukausihinta());
        System.out.println("Tilauksen kesto kuukausina: "+this.tilauksen_kesto);
        double hinta = this.tilauksen_kesto * get_kuukausihinta();
        System.out.println("Tilauksen hinta on "+hinta);
        System.out.println("-------------------------------------------------------------------------");
    }
}
