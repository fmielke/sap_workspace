package demo.sap.com.services.katalog;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
@Stateless
public class KatalogServicetr119 {

    @WebMethod
    public boolean istArtikelAufLager(@WebParam(name = "artikelnummer") final String artikelnummer) {
        if (artikelnummer == null) {
            return false;
        }

        if (artikelnummer.startsWith("bpm")) {
            return false;
        }

        return true;
    }

    @WebMethod
    public boolean artikelEntfernen(@WebParam(name = "artikelnummer") final String artikelNummer) {
        return true;
    }

}
