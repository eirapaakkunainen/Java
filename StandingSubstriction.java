public class StandingSubstriction extends Subscription{
    
    private int alennusprosentti;
   
    //getterit
    public int get_alennusprosentti() {
        return alennusprosentti;
    }

    //setterit
    public void set_alennusprosentti(int newalennusprosentti) {
        this.alennusprosentti = newalennusprosentti;
    }

    //Konstruktori 
    public StandingSubstriction(String lehden_nimi,String tilaajan_nimi,String toimitusosoite,double kuukausihinta, int alennusprosentti){
        super(lehden_nimi, tilaajan_nimi, toimitusosoite, kuukausihinta);
        this.alennusprosentti = alennusprosentti;
    }
    
    //tulostus
    public void printInvoice(){
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Kiitos tilauksesta!");
        System.out.println("Tilauksen on tyyppi on kestotilaus");
        System.out.println("Lehden nimi: "+get_lehden_nimi());
        System.out.println("Tilaajan nimi: "+get_tilaajan_nimi());
        System.out.println("Toimitusosoite: "+get_toimitusosoite());
        System.out.println("Lehden kuukausihinta: "+get_kuukausihinta());
        double hinta = (12*(get_kuukausihinta() -((this.alennusprosentti/100)*get_kuukausihinta())));
        System.out.println("Tilauksen vuosittainen hinta: "+hinta);
        System.out.println("-------------------------------------------------------------------------");
    }
}