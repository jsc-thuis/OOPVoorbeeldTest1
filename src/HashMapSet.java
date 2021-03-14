import java.util.HashMap;

public class HashMapSet {

    // een map = collectie van paren
    // een paar = een sleutelobject(key) en een waardeobject(value)
    // Bijvoorbeeld een telefoonboek: elk paar bestaat uit
    // een naam (sleutel) en een telefoonnummer(waarde)
    // Een map wordt meestal zo geordend dat ze heel geschikt is
    // voor zoekopdrachten in één richting,
    // van naam naar nummer in ons telefoonboek.
    // Omgekeerd zoeken kan ook maar kost meer tijd.
    // HashMap is een bijzondere variant van Map
    // De twee belangrijkste methodes zijn:
    // put: voegt een record of paar toe
    // get: retourneert de waarde voor een gegeven sleutel
    // declaratie van HashMap met de naam phonebook
    // we gebruiken hier Strings voor zowel de sleutels als de waarden
    HashMap<String, String> phoneBook;

    // Breid de constructor uit zodat er meerdere contacten
    // staan in de HashMap
    public HashMapSet() {
        phoneBook = new HashMap<>();
        phoneBook.put("Leon Vanderneffe", "0487102030");
        phoneBook.put("Lisa Jones", "(402) 4536 4674");
        phoneBook.put("William H. Smith", "(998) 5488 0123");
    }

    // Met volgende code zoeken we het telefoonnummer van Leon Vanderneffe:
    // String number = phonebook.get("Leon Vanderneffe");
    // Vervolledig de methode lookupNumber die voor een gegeven naam
    // het overeenkomstig telefoonummer retourneert als een String
    public String lookupNumber(String name) {
        String number = phoneBook.get(name);
        return number;
    }

    // Vervolledig de methode enterNumber met parameters name en number
    // die een nieuw record of paar toevoegt aan het telefoonboek
    public void enterNumber(String name, String number) {
        phoneBook.put(name, number);
    }

    // Vervolledig de methode getAantal die het aantal records
    // in de HashMap phonebook retourneert.
    public int getAantal() {
        return phoneBook.size();
    }

    // De methode keySet in de klasse Hashmap retourneert
    // de Set van keys.
    // In het geval van onze phonebook is dit de Set van namen.
    // Een Set is een collectie waarin elk afzonderlijk
    // element slechts éénmaal opgeslagen wordt.
    // De Set houdt geen bepaalde volgorde in stand.
    // In onderstaande code retourneert phonebook.keySet
    // dus de Set van namen uit ons telefoonboek.
    // Vervolledig de methode drukAf zodat alle namen en telefoonnummers
    // worden afgedrukt op het scherm.
    public void drukAf() {
        // kortste manier maar vaste lay-out
        System.out.println(phoneBook);
        // door te itereren over de Set van namen
        for (String name : phoneBook.keySet()) {
            System.out.print(name + ": ");
            System.out.println(lookupNumber(name));
        }


    }

    // Vervolledig de methode omgekeerdZoeken die
    // voor een gegeven telefoonummer de bijbehorende naam retourneert.
    // Als het telefoonnummer niet bestaat,
    // wordt de String "niet gevonden" geretourneerd.
    public String omgekeerdZoeken(String number) {
        String retour = "niks gevonden";
        for (String name : phoneBook.keySet()) {
            if (lookupNumber(name).equals(number)) {
                retour = name;
            }
        }
        return retour;
    }
}


