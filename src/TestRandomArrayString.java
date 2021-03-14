/**
 * @author Jos
 * @version 15 maart 2021
 */
public class TestRandomArrayString {

    /**
     *
     * @param args overbodig
     */
    public static void main(String[] args) {
        System.out.println("Hier volgt een test voor de klasse RandomArrayString...");
        RandomArrayString ras = new RandomArrayString();
        // Opgave 1
        ras.printPijl();
        // Opgave 2
        String tekst = "Er was eens een...";
        ras.telAantalKlinkersE(tekst);
        System.out.println("");
        // Opgave 3
        String woord = "abc";
        int aantal = 5;
        System.out.println("Het woord '" + woord + "' wordt " + aantal + " keer herhaald: ");
        System.out.println(ras.herhaalWoord(woord, 5));
    }
}

