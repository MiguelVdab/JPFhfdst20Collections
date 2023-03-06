package be.vdab;

import be.vdab.land.Land;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var landen = new ArrayList<Land>();
        landen.add(new Land("NL", "Nederland", "Amsterdam", BigInteger.valueOf(17749262), BigDecimal.valueOf(41543)));
        landen.add(new Land("BE", "Belgïe", "Brussel", BigInteger.valueOf(11584008), BigDecimal.valueOf(30528)));
        landen.add(new Land("FR", "Frankrijk", "Parijs", BigInteger.valueOf(62765235), BigDecimal.valueOf(551500)));
        landen.add(new Land("GE", "Duitsland", "Berlin", BigInteger.valueOf(83222442), BigDecimal.valueOf(357121)));
        landen.add(new Land("AG", "Argentinïe", "Buenos Aires", BigInteger.valueOf(38500000), BigDecimal.valueOf(2825647.56)));
        landen.add(new Land("Bg", "Bulgarije", "Sofia", BigInteger.valueOf(7800000), BigDecimal.valueOf(111002.42)));
        landen.add(new Land("Ey", "Egypte", "Cairo", BigInteger.valueOf(72000000), BigDecimal.valueOf(997739.83)));
        landen.add(new Land("In", "India", "New Delhi", BigInteger.valueOf(1060000000), BigDecimal.valueOf(3336251.12)));
        landen.add(new Land("It", "Italië", "Rome", BigInteger.valueOf(57840000L), BigDecimal.valueOf(301268.14)));
        landen.add(new Land("L", "Luxemburg", "Luxemburg", BigInteger.valueOf(462690L), BigDecimal.valueOf(2586.27)));

        BigDecimal som = new BigDecimal(0);
        int counter = 0;
        for (var land : landen) {
            System.out.println(land.getLandNaam() + ", bevolkings dichtheid: " + land.bevolkingsDichtheid());
            som = som.add(land.bevolkingsDichtheid());
            counter ++;
        }
        BigDecimal gemiddelde = som.divide(BigDecimal.valueOf(counter), 2, RoundingMode.HALF_UP);
        System.out.println("Gemiddelde bevolkingsdichtheid: " + gemiddelde);
        System.out.println("Aantal landen: " + counter);

        Land dichtsteBijgem = null;
        BigDecimal absVerschil = new BigDecimal("50000000000000000");
        for (var land : landen) {
            if (land.bevolkingsDichtheid().subtract(gemiddelde).abs().compareTo(absVerschil) < 0) {
                dichtsteBijgem = land;
                absVerschil = (land.bevolkingsDichtheid().subtract(gemiddelde)).abs();
            }
        }
        System.out.println(dichtsteBijgem.getLandNaam() + " is het land met een bevolkingsdichtheid het dichtste bij het gemiddelde.");
    }
}
