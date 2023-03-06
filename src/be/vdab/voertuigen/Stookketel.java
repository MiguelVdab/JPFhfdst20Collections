package be.vdab.voertuigen;

public class Stookketel implements Vervuiler{
    private float CONorm;
    public Stookketel() {

    }
    public Stookketel(float CONorm) {
        this.CONorm = CONorm;
    }

    public float getCONorm() {
        return CONorm;
    }

    @Override
    public double berekenVervuiling() {
        return CONorm * 100;
    }
}
