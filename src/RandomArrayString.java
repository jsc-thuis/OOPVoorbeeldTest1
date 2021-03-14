import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Jos
 * @version 15 maart 2021
 */
public class RandomArrayString {

    private int[] getallen;
    private Random rand;

    /**
     * Constructor
     */
    public RandomArrayString() {
        getallen = new int[5];
        rand = new Random();
    }

    // Vraag 1
    // Vul de Array getallen op met scores vanaf 1 tot en met 20.
    // Gebruik overal length. De methode moet ook werken als de Array andere lengte heeft.
    // Schrijf eerst de Array getallen gesorteerd op het scherm.
    // Schrijf daarna de Array op het scherm in de vorm van een pijl.
    // Let op, je methode moet werken voor elke lengte van de Array getallen!
    // Dus 9 sout's onder mekaar schrijven is zeker niet de gepaste oplossing!

    /**
     * Methode printPijl
     */
    public void printPijl() {
        int aantal = 0;
        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = rand.nextInt(20) + 1;
        }
        Arrays.sort(getallen);
        System.out.println(Arrays.toString(getallen));

        for (int i = 0; i < getallen.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(getallen[j] + " ");
            }
            System.out.println("");
        }

        for (int i = getallen.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(getallen[j] + " ");
            }
            System.out.println("");
        }
    }


    // Vraag 2
    // Bereken het aantal klinkers 'e' in de String tekst
    // Schrijf de tekst op het scherm en het aantal karakters 'e'
    // Het percentage van de letters 'e' in de tekst wordt berekend en afgedrukt
    // waarbij spaties en leestekens niet worden meegerekend

    /**
     * @param tekst waarin het aantal e's wordt geteld
     */
    public void telAantalKlinkersE(String tekst) {
        int aantal = 0;
        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == 'E' || tekst.charAt(i) == 'e') {
                aantal++;
            }
        }
        System.out.println(tekst);
        System.out.println("Aantal 'e': " + aantal);
        tekst = tekst.replaceAll("\\W", "");
        double percent = (double) aantal / tekst.length() * 100;
        String output = String.format("%.1f", percent);
        System.out.println("Percentage 'e': " + output);
    }

    // Vraag 3
    // Schrijf een methode herhaalWoord om een woord meermaals te herhalen.
    // De parameters zijn een String en een getal.
    // Return de String die een aantal keer de invoerstring herhaalt.

    /**
     * @param woord  dat moet herhaald worden
     * @param aantal keer dat woord herhaald wordt
     * @return het woord aantal keer achter elkaar gezet
     */
    public String herhaalWoord(String woord, int aantal) {
        String nieuw = "";
        for (int i = 1; i <= aantal; i++) {
            nieuw += woord;
        }
        return nieuw;
    }
}

