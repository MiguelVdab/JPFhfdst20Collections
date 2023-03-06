package be.vdab.land;

import be.vdab.util.LandException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Land {
    private String landCode, landNaam, hoofdstad;
    private BigInteger aantalInwoners;
    private BigDecimal oppervlakte;

    public Land(String code, String naam, String stad, BigInteger inwoners, BigDecimal opp) {
        setLandCode(code);
        setLandNaam(naam);
        setHoofdstad(stad);
        setAantalInwoners(inwoners);
        setOppervlakte(opp);
    }

    public String getLandCode() {
        return landCode;
    }

    public final void setLandCode(String landCode) {
        try {
            if ((landCode == null) || landCode.trim().isEmpty()) {
                throw new LandException("Landcode verplicht in te vullen");
            }
            this.landCode = landCode;
        } catch (LandException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getLandNaam() {
        return landNaam;
    }

    public void setLandNaam(String landNaam) {
        try {
            if ((landNaam == null) || landNaam.trim().isEmpty()) {
                throw new LandException("Landnaam verplicht in te vullen");
            }
            this.landNaam = landNaam;
        } catch (LandException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getHoofdstad() {
        return hoofdstad;
    }

    public void setHoofdstad(String hoofdstad) {
        try {
            if ((hoofdstad == null) || hoofdstad.trim().isEmpty()) {
                throw new LandException("Hoofdstad is verplicht in te vullen");
            }
            this.hoofdstad = hoofdstad;
        } catch (LandException e) {
            System.out.println(e.getMessage());
        }
    }

    public BigInteger getAantalInwoners() {
        return aantalInwoners;
    }

    public void setAantalInwoners(BigInteger inwoners) {
        try {
            if (inwoners.compareTo(BigInteger.ZERO) <= 0) {
                throw new LandException("Aantal inwoners moet groter dan 0 zijn");
            }
            aantalInwoners = inwoners;
        } catch (LandException e) {
            System.out.println(e.getMessage());
        }
    }

    public BigDecimal getOppervlakte() {
        return oppervlakte;
    }

    public void setOppervlakte(BigDecimal opp) {
        try {
            if (opp.compareTo(BigDecimal.ZERO) <= 0) {
                throw new LandException("Oppervlakte moet groter dan 0 zijn");
            }
            oppervlakte = opp;
        } catch (LandException e) {
            System.out.println(e.getMessage());
        }
    }

    public BigDecimal bevolkingsDichtheid() {
        return new BigDecimal(aantalInwoners).divide(oppervlakte, 2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        return "Land{" +
                "landCode='" + landCode + '\'' +
                ", landNaam='" + landNaam + '\'' +
                ", hoofdstad='" + hoofdstad + '\'' +
                ", aantalInwoners=" + aantalInwoners +
                ", oppervlakte=" + oppervlakte +
                '}';
    }
}
