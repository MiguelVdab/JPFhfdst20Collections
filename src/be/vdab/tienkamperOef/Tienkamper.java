package be.vdab.tienkamperOef;

public class Tienkamper implements Comparable<Tienkamper>{
    private String naam;
    private int punten;

    public Tienkamper(){}
    public Tienkamper(String naam, int punten) {
        setNaam(naam);
        setPunten(punten);
    }

    public String getNaam() {
        return naam;
    }

    public final void setNaam(String naam) {
        if (naam != null || (!(naam.trim().isEmpty()))) {
            this.naam = naam;
        }
    }

    public int getPunten() {
        return punten;
    }

    public final void setPunten(int punten) {
        if (punten >= 0) {
            this.punten = punten;
        }
    }
    @Override
    public String toString() {
        return
                "naam= " + naam +
                ", punten= " + punten;
    }
    @Override
    public int hashCode() {
        return naam.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Tienkamper tienkamper)) {
            return false;
        }
        return naam.equals(tienkamper.naam);
    }
    @Override
    public int compareTo(Tienkamper tienkamper) {
        return naam.compareTo(tienkamper.getNaam());
    }
}
