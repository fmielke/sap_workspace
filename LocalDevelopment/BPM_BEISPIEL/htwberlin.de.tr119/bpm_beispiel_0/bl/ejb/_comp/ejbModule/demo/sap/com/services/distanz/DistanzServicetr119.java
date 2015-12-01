package demo.sap.com.services.distanz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
@Stateless
public class DistanzServicetr119 {

	private final String API_KEY = "AIzaSyBngXd7HmE_nkRIojQcxJ9fGlCcc21QlNw";
	

	private String origins = "37081%20Goettingen%20Anna-Vandenhoeck-Ring%2050";
	private String destinations = "10317%20Berlin%20Weitlingstrasse%20105";

	
	private String url = "https://maps.googleapis.com/maps/api/distancematrix/json?origins="+origins+"&destinations="+destinations+"=&key="+ API_KEY;
	private String method = "GET";
	public String jsonResponse;

	@WebMethod
	@WebResult(name = "jsonResponse")
	public String sendTestData() {

		try {
			URL obj = new URL(url);

			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			con.setRequestMethod(method);

			BufferedReader in = new BufferedReader(new InputStreamReader(con
					.getInputStream()));

			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			jsonResponse = response.toString();
			return jsonResponse;

		} catch (Exception e) {
			return e.getMessage();
		}
	}
}