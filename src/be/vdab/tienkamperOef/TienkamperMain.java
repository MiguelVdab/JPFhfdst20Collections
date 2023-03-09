package be.vdab.tienkamperOef;

import java.util.ArrayList;
import java.util.TreeSet;

public class TienkamperMain {
    public static void main(String[] args) {
        var Miguel = new Tienkamper("Miguel", 9);
        var Sam = new Tienkamper("Sam", 8);
        var Charles = new Tienkamper("Charles", 7);
        var JC = new Tienkamper("Jean", 6);
        var Renze = new Tienkamper("Renze", 5);
        var Bram = new Tienkamper("Bram", 4);

        var al = new ArrayList<Tienkamper>();
        al.add(Miguel);
        al.add(Sam);
        al.add(Charles);
        al.add(JC);
        al.add(Renze);
        al.add(Bram);

        System.out.println("ArrayList:");
        for (var tk : al) {
            System.out.println(tk);
        }

        var tl = new TreeSet<Tienkamper>();
        tl.add(Miguel);
        tl.add(Sam);
        tl.add(Charles);
        tl.add(JC);
        tl.add(Renze);
        tl.add(Bram);

        System.out.println("TreeSet:");
        for (var tk : tl) {
            System.out.println(tk);
        }
    }
}
