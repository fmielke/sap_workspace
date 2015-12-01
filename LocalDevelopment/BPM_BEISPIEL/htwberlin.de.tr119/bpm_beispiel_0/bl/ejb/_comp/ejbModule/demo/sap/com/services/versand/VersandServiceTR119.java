package demo.sap.com.services.versand;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
@Stateless
public class VersandServiceTR119 {

	@WebMethod
	public String versandStarten(
			@WebParam(name = "lagerId") final String lagerId,
			@WebParam(name = "details") final String details) {
		String gruss = "";
		
		if ("de.nord".equals(lagerId)) {
			gruss = "Moin! ";
		} else if ("de.ost".equals(lagerId)) {
			gruss = "Hallo! ";
		} else if ("de.sued".equals(lagerId)) {
			gruss = "Servus! ";
		} else if ("de.west".equals(lagerId)) {
			gruss = "Gude! ";
		}

		return gruss + "Wir kümmern uns um " + details + ".";
	}
}