package be.vdab.winkel;

import java.math.BigDecimal;

public class Product {
    private String omschrijving;
    private BigDecimal prijs;
public Product() {}
    public Product(String omschrijving, BigDecimal prijs) {
        setOmschrijving(omschrijving);
        setPrijs(prijs);
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        if (omschrijving != null || !(omschrijving.trim().isEmpty())) {
            this.omschrijving = omschrijving;
        }
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    public void setPrijs(BigDecimal prijs) {
        if (prijs.intValue() > 0) {
            this.prijs = prijs;
        }
    }
}
