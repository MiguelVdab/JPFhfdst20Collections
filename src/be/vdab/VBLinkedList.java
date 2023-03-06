package be.vdab;

import java.util.ArrayList;
import java.util.LinkedList;

public class VBLinkedList {
    public static void main(String[] args) {
        var ll = new LinkedList<String>();
        ll.add("fiets");
        ll.add(null);
        ll.add("even");
        ll.add("dak");
        ll.add("citroen");
        ll.add("citroen");
        ll.add("boom");
        ll.add("aap");

        System.out.println("4de element is: " + ll.get(3));

        ll.add(3, "test");

        for (var woord : ll) {
            System.out.println(woord);
        }

        System.out.println("\nWeergave m.b.v. iterator");
        for (var i = ll.iterator(); i.hasNext(); ) {
            var woord = i.next();
            System.out.println(woord);
        }

        System.out.println("\nExtra methods");
        var llijst = ll;
        System.out.println(llijst.getFirst());
        System.out.println(llijst.getLast());

        llijst.addFirst("eerste");
        llijst.addLast("laatste");

        System.out.println(llijst.getFirst());
        System.out.println(llijst.getLast());

        System.out.println(llijst.removeFirst());
        System.out.println(llijst.removeLast());

        System.out.println(llijst.getFirst());
        System.out.println(llijst.getLast());
    }
}
