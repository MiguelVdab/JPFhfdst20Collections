package be.vdab.voertuigen;

public abstract class Voertuig implements Privaat, Milieu{
    private String polishouder = "onbepaald";
    private float kostprijs;
    private int pk;
    private float gemVerbruik;
    private String nummerplaat = "onbepaald";

    public Voertuig() {

    }

    public Voertuig(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat) {
        setPolishouder(polishouder);
        setKostprijs(kostprijs);
        setPk(pk);
        setGemVerbruik(gemVerbruik);
        setNummerplaat(nummerplaat);
    }

    public String getPolishouder() {
        return polishouder;
    }

    public void setPolishouder(String polishouder) {
        if (polishouder != null && !polishouder.isEmpty()) {
            this.polishouder = polishouder;
        }
    }

    public float getKostprijs() {
        return kostprijs;
    }

    public void setKostprijs(float kostprijs) {
        if (kostprijs > 0.0F) {
            this.kostprijs = kostprijs;
        }
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        if (pk > 0) {
            this.pk = pk;
        }
    }

    public float getGemVerbruik() {
        return gemVerbruik;
    }

    public void setGemVerbruik(float gemVerbruik) {
        if (gemVerbruik > 0.0F) {
            this.gemVerbruik = gemVerbruik;
        }
    }

    public String getNummerplaat() {
        return nummerplaat;
    }

    public void setNummerplaat(String nummerplaat) {
        if (nummerplaat != null && !nummerplaat.isEmpty()) {
            this.nummerplaat = nummerplaat;
        }
    }

    @Override
    public String toString() {
        return polishouder + " ; " + kostprijs + " ; " + pk + " ; " + gemVerbruik + " ; " + nummerplaat;
    }

    public void toon() {
        System.out.println("polishouder: " +polishouder);
        System.out.println("kostprijs: " + kostprijs);
        System.out.println("pk: " + pk);
        System.out.println("gemiddeld verbruik: " + gemVerbruik);
        System.out.println("nummerplaat: " + nummerplaat);
    }
    public abstract double getKyotoScore();

    @Override
    public void geefPrivateData() {
        System.out.println(polishouder + " " + nummerplaat);
    }
    @Override
    public void geefMilieuData() {
        System.out.println("Pk: " + pk + ", kostprijs: " + kostprijs + ", gemiddeld verbruik: " + gemVerbruik);
    }
}
