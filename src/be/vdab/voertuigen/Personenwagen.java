package be.vdab.voertuigen;

public class Personenwagen extends Voertuig implements Vervuiler{
    private int aantalDeuren = 4;
    private int aantalPassagiers = 5;

    public Personenwagen() {

    }
    public Personenwagen(String polishouder, float kostprijs, int pk, float gemVerbruik,
                         String nummerplaat, int aantalDeuren, int aantalPassagiers) {
        super(polishouder, kostprijs, pk, gemVerbruik, nummerplaat);
        setAantalDeuren(aantalDeuren);
        setAantalPassagiers(aantalPassagiers);
    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public void setAantalDeuren(int aantalDeuren) {
        if (aantalDeuren > 0) {
            this.aantalDeuren = aantalDeuren;
        }
    }

    public int getAantalPassagiers() {
        return aantalPassagiers;
    }

    public void setAantalPassagiers(int aantalPassagiers) {
        if (aantalPassagiers > 0) {
            this.aantalPassagiers = aantalPassagiers;
        }
    }
    @Override
    public String toString() {
        return super.toString() + " ; " + aantalDeuren + " ; " + aantalPassagiers;
    }
    @Override
    public void toon() {
        System.out.println("\nPERSONENWAGEN");
        super.toon();
        System.out.println("aantal deuren: " + aantalDeuren);
        System.out.println("aantal passagiers: " + aantalPassagiers);
    }
    @Override
    public double getKyotoScore() {
        return getGemVerbruik() * getPk() / aantalPassagiers;
    }

    @Override
    public double berekenVervuiling() {
        return getKyotoScore() * 5.0F;
    }
}
