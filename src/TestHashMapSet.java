public class TestHashMapSet {

    public static void main(String[] args) {
        System.out.println("Hier volgt een test voor de klasse HashmapSet...");
        // Maak een HashMapSet-object.
        HashMapSet telefoonboek = new HashMapSet();

        // Vraag het telefoonnummer van een gekozen naam uit je telefoonboek op
        // en druk dit af op het scherm.
        String naam = "Leon Vanderneffe";
        String number = telefoonboek.lookupNumber(naam);
        System.out.println("Telefoonummer van " + naam + ": " + number);

        // Voeg een nieuw telefoonummer toe aan je telefoonboek.
        telefoonboek.enterNumber("Kiekeboe", "0456102030");

        // Vraag het aantal records op in je telefoonboek
        // en schrijf dit aantal op het scherm.
        int aantal = telefoonboek.getAantal();
        System.out.println("Aantal records: " + aantal);

        // Druk een overzicht af van alle namen en telefoonnummers.
        System.out.println("Alle namen en nummers: ");
        telefoonboek.drukAf();

        // Zoek voor een gekozen telefoonnumer uit je telefoonboek
        // de overeenkomstige naam op en druk deze af.
        String nummer = "0456102030";
        System.out.print("Nummer " + nummer);
        System.out.println(" staat op naam van " + telefoonboek.omgekeerdZoeken(nummer));
    }
}



