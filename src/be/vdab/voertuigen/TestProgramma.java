package be.vdab.voertuigen;

public class TestProgramma {
    public static void main(String[] args) {
        var opel = new Personenwagen();
        opel.toon();
        System.out.println(opel);

        var mustang = new Personenwagen("Miguel", 2500.0F, 125, 6.8F, "1ABC123", 4, 5);
        mustang.toon();
        System.out.println(mustang);

        mustang.setKostprijs(-15000.0F);
        mustang.setAantalDeuren(-7);
        mustang.setAantalPassagiers(0);
        System.out.println(mustang);

        var volvo = new Vrachtwagen();
        volvo.toon();
        System.out.println(volvo);


        var mercedes = new Vrachtwagen("Sam", 5200.0F, 500, 20.5F, "1AZE123", 30_000.0F);
        mercedes.toon();
        System.out.println(mercedes);

        System.out.println();
        System.out.println("Kyotoscore personenwagen 1: " + opel.getKyotoScore());
        System.out.println("Kyotoscore personenwage 2: " + mustang.getKyotoScore());
        System.out.println("Kyotoscore vrachtwagen 1: " + volvo.getKyotoScore());
        System.out.println("Kyotoscore vrachtwagen 2: " + mercedes.getKyotoScore());

        var voertuigen = new Voertuig[4];
        voertuigen[0] = opel;
        voertuigen[1] = mustang;
        voertuigen[2] = volvo;
        voertuigen[3] = mercedes;

        System.out.println("\n--- toString()---");
        for (var voertuig : voertuigen) {
            System.out.println(voertuig);
        }

        System.out.println("\n--- method toon()");
        for (var voertuig : voertuigen) {
            voertuig.toon();
        }

        var vervuilers = new Vervuiler[3];
        vervuilers[0] = new Vrachtwagen("Charles", 5000.5F, 500, 20.5F, "2AZE987", 30_000.0F);
        vervuilers[1] = new Personenwagen("JC", 3000.0F, 230, 13.6F, "3EZA741", 4, 4);
        vervuilers[2] = new Stookketel(0.9F);

        for (var eenVervuiler : vervuilers) {
            System.out.println(eenVervuiler.berekenVervuiling());
        }

        var arrayPrivaat = new Privaat[2];
        arrayPrivaat[0] = new Personenwagen("Mathieu", 2500.0F, 120, 6.8f, "9POI654", 4, 4);
        arrayPrivaat[1] = new Vrachtwagen("Renze", 20000.0F, 300, 30.5F, "8ERT456", 50000.5F);

        for (var eenPrivaatElement : arrayPrivaat) {
            eenPrivaatElement.geefPrivateData();
        }
        var arrayMilieu = new Milieu[2];
        arrayMilieu[0] = mustang;
        arrayMilieu[1] = mercedes;

        for (var eenMilieuElement : arrayMilieu) {
            eenMilieuElement.geefMilieuData();
        }
    }
}