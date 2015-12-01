package demo.sap.com.services.haendler;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
@Stateless
public class HaendlerServicetr119 {

    @WebMethod
    @WebResult(name = "artikelVerfuegbarkeit")
    public ArtikelVerfuegbarkeittr119 artikelVerfuegbarkeitPruefen(@WebParam(name = "artikelnummer") final String artikelnummer) {
        if (artikelnummer == null) {
            return new ArtikelVerfuegbarkeittr119(artikelnummer, 0, "EUR", false, -1);
        }

        //available
        if (artikelnummer.startsWith("bpm")) {
            return new ArtikelVerfuegbarkeittr119(artikelnummer, 20, "EUR", true, 4);
        }
        
        //late arrival
        if (artikelnummer.startsWith("la")) {
            return new ArtikelVerfuegbarkeittr119(artikelnummer, 20, "EUR", true, 10);
        }
        //not available
        if (artikelnummer.startsWith("na")) {
            return new ArtikelVerfuegbarkeittr119(artikelnummer, 20, "EUR", false, 4);
        }
        //default
        return new ArtikelVerfuegbarkeittr119(artikelnummer, 45, "EUR", true, 1);
    }

    @WebMethod
    public boolean artikelBestellen(@WebParam(name = "artikelnummer") final String artikelnummer, @WebParam(name = "menge") final int menge) {
        return true;
    }

}
