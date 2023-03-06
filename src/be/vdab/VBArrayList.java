package be.vdab;

import java.util.ArrayList;
import java.util.List;

public class VBArrayList {
    public static void main(String[] args) {
        var al = new ArrayList<String>();
        al.add("fiets");
        al.add(null);
        al.add("even");
        al.add("dak");
        al.add("citroen");
        al.add("citroen");
        al.add("boom");
        al.add("aap");

        System.out.println("4de element is: " + al.get(3));

        al.add(3, "test");

        for (var woord : al) {
            System.out.println(woord);
        }

        System.out.println("\nWeergave m.b.v. iterator");
        for (var i = al.iterator(); i.hasNext(); ) {
            var woord = i.next();
            System.out.println(woord);
        }

    }
}
