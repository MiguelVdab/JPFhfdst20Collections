package be.vdab.beginletterOef;

import java.util.ArrayList;
import java.util.HashMap;

public class beginletterMain {
    public static void main(String[] args) {
        String[] woorden = {"Auto", "been", "Slaap", "Gym", "gsm", "Bos", "BMW", "Boot"};

        var woordenMap = new HashMap<String, Integer>();

        for (var woord : woorden) {
            var letter = woord.toLowerCase().charAt(0);

            if (woordenMap.containsKey(String.valueOf(letter))) {
                int vorigAantal = woordenMap.get(String.valueOf(letter));
                vorigAantal++;
                woordenMap.put(String.valueOf(letter), vorigAantal);
            }
            else {
                woordenMap.put(String.valueOf(letter), 1);
            }
        }


        System.out.println("Aantal woorden per letter ----");
        for (var letter : woordenMap.entrySet()) {
            System.out.println("Letter = " + letter.getKey() + ", aantal woorden= " + letter.getValue());
        }
        System.out.println("\nDe grote van de map is ----");
        System.out.println(woordenMap.size() + " entries.");

        System.out.println("\nIs de map leeg? ----");
        System.out.println(woordenMap.isEmpty());

        System.out.println("\nAlle Keys ----");
        for (var letter : woordenMap.keySet()) {
            System.out.println(letter);
        }
        System.out.println("\nAlle Values ----");
        for (var letter : woordenMap.values()) {
            System.out.println(letter);
        }
        System.out.println("\nAlle Entries ----");
        for (var letter : woordenMap.entrySet()) {
            System.out.println(letter);
        }
    }
}
