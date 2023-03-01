import java.util.Scanner;

public class PankkitiliMain {

    static Scanner scanner = new Scanner(System.in);
    static Pankkitili UusiTili = new Pankkitili();
    public static void main(String [] args) {
         while(true){
            System.out.println("Tervetuloa pankkiin!");
            System.out.println("Paina nappia: luo tili (l), talleta rahaa (t), nosta rahaa (n) tai tulosta tiedot (tu)");
            String input = scanner.nextLine();
            if (input.equals("l")) {
                System.out.printf("Anna tilin omistaja: ");
                String omistaja = scanner.nextLine();
                UusiTili.setOmistaja(omistaja);
                System.out.printf("Anna tilinumero: ");
                String tilinro = scanner.nextLine();
                UusiTili.setTilinro(tilinro);
                try {
                    System.out.printf("Anna tilin saldo: ");
                    double PaljonkoRahaa = scanner.nextDouble();
                    UusiTili.setSaldo(PaljonkoRahaa);
                    System.out.println("Hienoa! Pankkitili luotiin onnistuneesti :) ");
                } catch (Exception NegatiivinenLuku ) {
                    System.out.println("Saldo ei voi olla negatiivinen.");
                }
                    UusiTili.TietojenTulostus();
            }
            else if (input.equals("t")) {
                double t = UusiTili.getSaldo();
                System.out.println("Anna summa, jonka haluat tallettaa: ");
                double talletus = scanner.nextDouble();
                if (talletus <= 0){
                    System.out.println("Näin pientä summaa ei voida tallettaa.");
                }
                else{
                    UusiTili.setSaldo((talletus+t)); 
                    System.out.println("Talletus suoritettu onnistuneesti");
                }
            }
            else if (input.equals("n")) {
                    try{
                        System.out.println("Anna summa, jonka haluat nostaa tililtä: "); 
                        double otto = scanner.nextDouble();
                        double n = UusiTili.getSaldo();
                        if (n-otto <0 || otto <= 0) {
                            System.out.println("Tilillä on liian vähän rahaa. Otto epäonnistui.");
                        }
                        else {
                            n = n-otto;
                            UusiTili.setSaldo(n);
                            System.out.println("Otto suoritettu onnistuneesti.");
                        }
                    } catch (Exception Nosto) {
                            System.out.println("Noston pitää olla double.");
                    }
            }
            else if (input.equals("tu")) {
                    if (UusiTili.getTilinro() == null){
                        System.out.println("Et voi tulostaa tietoja, koska sinulla ei ole tiliä.");
                    }
                    else {
                        UusiTili.TietojenTulostus();
                    }
            }

         }

    }
}

