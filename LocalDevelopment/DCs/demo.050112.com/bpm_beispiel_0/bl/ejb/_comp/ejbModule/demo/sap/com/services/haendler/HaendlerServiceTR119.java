package demo.sap.com.services.haendler;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
@Stateless
public class HaendlerServiceTR119 {

    @WebMethod
    @WebResult(name = "artikelVerfuegbarkeit")
    public ArtikelVerfuegbarkeitTR119 artikelVerfuegbarkeitPruefen(@WebParam(name = "artikelnummer") final String artikelnummer) {
        if (artikelnummer == null) {
            return new ArtikelVerfuegbarkeitTR119(artikelnummer, 0, "EUR", false, -1);
        }

        if (artikelnummer.startsWith("bpm")) {
            return new ArtikelVerfuegbarkeitTR119(artikelnummer, 20, "EUR", true, 4);
        }

        return new ArtikelVerfuegbarkeitTR119(artikelnummer, 45, "EUR", true, 1);
    }

    @WebMethod
    public boolean artikelBestellen(@WebParam(name = "artikelnummer") final String artikelnummer, @WebParam(name = "menge") final int menge) {
        return true;
    }

}
