package be.vdab.winkel;


import java.math.BigDecimal;

public class Product {
    private String omschrijving;
    private BigDecimal prijs;

    public Product(String omschrijving, BigDecimal prijs) {
        setOmschrijving(omschrijving);
        setPrijs(prijs);
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        if (omschrijving.trim().isEmpty()){
            throw new IllegalArgumentException("omschrijving moet ingevuld worden");
        }
        this.omschrijving = omschrijving;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    public void setPrijs(BigDecimal prijs) {
        if (prijs.intValue() < 0) {
            throw new IllegalArgumentException("Prijs moet goer dan 0 zijn");
        }
        this.prijs = prijs;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) {
            return false;
        }
        return omschrijving.equals(product.omschrijving);
    }
    @Override
    public int hashCode() {
        return omschrijving.hashCode();
    }
    @Override
    public String toString() {
        return
                "omschrijving='" + omschrijving + '\'' +
                ", prijs=" + prijs;
    }
}
