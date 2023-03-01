import java.util.InputMismatchException;
import java.util.Scanner;

public class Vt3main {

    static void printSubscriptionInvoice(Subscription subs) {
        subs.printInvoice();
    }

    public static void main(String [] args) {

        while(true){
            Scanner Skanner = new Scanner(System.in);
            System.out.println("Hei vain! Tilataanpa sinulle lehti :D");
            System.out.println("Valitse tilauksen tyyppi (kestotilaus (k) / normitilaus (n)). Jos haluat lopettaa paina (l)");
            String input = Skanner.nextLine();
            
            if (input.equals("k")) { //jos tilaus on kestotilaus
                System.out.printf("Tilaajan nimi: ");
                String tilaajan_nimi = Skanner.nextLine();
                System.out.printf("Toimitusosoite: ");
                String toimitusosoite = Skanner.nextLine();
                System.out.printf("Lehti, jonka haluat tilata: ");
                String lehden_nimi = Skanner.nextLine();
                
                try{
                    System.out.printf("Paljonko on lehden hinta kuukaudessa?: ");
                    double kuukausihinta = Skanner.nextDouble();
                    if (kuukausihinta <=0) {
                        System.out.println("Lehden hinta ei voi olla negatiivinen. Koitetaanpa uudestaan!");
                        continue;
                    }else{
                        System.out.printf("Anna alennuksen suuruus: ");
                        int alennusprosentti = Skanner.nextInt();
                        Subscription standingkestotilaus = new StandingSubstriction(lehden_nimi, tilaajan_nimi, toimitusosoite, kuukausihinta, alennusprosentti);
                        printSubscriptionInvoice(standingkestotilaus);
                    }
                }catch (InputMismatchException exception){
                    System.out.println("Hupsista! Muista antaa hinta desimaalilukuna pisteellä erotettuna ja alennus kokonaislukuna, kiitos.");
                    continue;
                }   

            }
            else if(input.equals("n")) { //jos tilaus on normitilaus
                System.out.printf("Tilaajan nimi: ");
                String tilaajan_nimi = Skanner.nextLine();
                
                System.out.printf("Toimitusosoite: ");
                String toimitusosoite = Skanner.nextLine();
                
                System.out.printf("Lehti, jonka haluat tilata: ");
                String lehden_nimi = Skanner.nextLine();
                
                try{
                    System.out.printf("Paljonko on lehden hinta kuukaudessa?: ");
                    double kuukausihinta = Skanner.nextDouble();
                    if (kuukausihinta <=0) {
                        System.out.println("Lehden hinta ei voi olla negatiivinen. Koitetaanpa uudestaan!");
                        continue;
                    }else{
                        System.out.printf("Anna tilauksen kesto kuukausina: ");
                        int tilauksen_kesto = Skanner.nextInt();
                        Subscription regularnormitilaus = new RegularSubscription(lehden_nimi, tilaajan_nimi, toimitusosoite, kuukausihinta, tilauksen_kesto);
                        printSubscriptionInvoice(regularnormitilaus);
                    }
                }catch (InputMismatchException exception) {
                        System.out.println("Hupsista! Muista antaa lehden hinta desimaalilukuna pisteellä erotettuna ja tilauksen kesto kokonaislukuna, kiitos.");
                        continue;
                }

            }
            else if(input.equals("l")){
                Skanner.close();
                break;
            }
            
            else{
                System.out.println("Valinnan tulee olla joko kestotilaus (k), normitilaus (n) tai lopeta (l)");
            }
        }   

}
}