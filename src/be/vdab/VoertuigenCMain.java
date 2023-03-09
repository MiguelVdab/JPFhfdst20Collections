package be.vdab;

import be.vdab.voertuigen.Personenwagen;
import be.vdab.voertuigen.Voertuig;
import be.vdab.voertuigen.Vrachtwagen;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class VoertuigenCMain {
    public static void main(String[] args) {
        var vs = new TreeSet<Voertuig>();
        vs.add(new Personenwagen("Miguel", 1500.0F, 250, 6.8F, "1-250-ABC", 5, 5));
        vs.add(new Vrachtwagen("Bram", 30000.5F, 500, 11.6F, "1-456-POI", 15000.0F));
        vs.add(new Personenwagen("Sam", 2500.0F, 150, 6.8F, "1-852-WXC", 5, 5));
        vs.add(new Vrachtwagen("Charles", 10000.5F, 300, 11.6F, "2-654-EZA", 15000.0F));
        vs.add(new Personenwagen("JC", 3500.0F, 350, 6.8F, "1-753-ABC", 5, 5));
        vs.add(new Vrachtwagen("Renze", 20000.5F, 650, 11.6F, "2-369-EZA", 15000.0F));

        for (var eenVoertuig : vs) {
            System.out.println(eenVoertuig);
        }
    }
}
