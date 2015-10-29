package center.rodrigo.connection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connect {

    private URL url;
    private HttpURLConnection conn;
    private BufferedReader rd;
    private String line;
    private String result = "";
    private String urlViaCEP = "http://viacep.com.br/ws/_SEU_CEP_/json/";

    public String consomeEndPoint(String cep) {

        try {
            urlViaCEP = urlViaCEP.replace("_SEU_CEP_", cep);

            url = new URL(urlViaCEP);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

            while ((line = rd.readLine()) != null) {
                result += line;
            }

            rd.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
