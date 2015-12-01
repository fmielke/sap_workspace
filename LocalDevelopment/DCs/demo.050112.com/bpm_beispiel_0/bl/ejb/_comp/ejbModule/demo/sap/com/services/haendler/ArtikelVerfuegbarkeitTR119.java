package demo.sap.com.services.haendler;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "artikelVerfuegbarkeit")
public class ArtikelVerfuegbarkeitTR119 implements Serializable {

    private static final long serialVersionUID = -2801340849496157064L;

    public String artikelnummer;
    public int preis;
    public String waehrung;
    public boolean lieferbar;
    public int lieferzeitInTagen;

    public ArtikelVerfuegbarkeitTR119() {
        this.artikelnummer = null;
        this.preis = 0;
        this.waehrung = "EUR";
        this.lieferbar = false;
        this.lieferzeitInTagen = -1;
    }

    public ArtikelVerfuegbarkeitTR119(final String artikelnummer, final int preis, final String waehrung, final boolean lieferbar,
            final int lieferzeitInTagen) {
        this.artikelnummer = artikelnummer;
        this.preis = preis;
        this.waehrung = waehrung;
        this.lieferbar = lieferbar;
        this.lieferzeitInTagen = lieferzeitInTagen;
    }

}