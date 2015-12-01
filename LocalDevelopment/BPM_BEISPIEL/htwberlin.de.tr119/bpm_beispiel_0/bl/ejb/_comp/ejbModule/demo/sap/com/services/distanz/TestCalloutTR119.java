package demo.sap.com.services.distanz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;


@WebService
@Stateless
public class TestCalloutTR119 {
	
	private String url = "http://api.openweathermap.org/data/2.5/weather?q=London,uk&appid=2de143494c0b295cca9337e1e96b00e0&mode=xml";
	private String method = "GET";
	public String jsonResponse;
	public String sampleData;
	
	@WebMethod
    @WebResult(name = "jsonResponse")
	public String sendTestData() throws IOException {

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod(method);

		//int responseCode = con.getResponseCode();

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		//System.out.println(response.toString());
		jsonResponse = response.toString();
		return jsonResponse;
	}

}
