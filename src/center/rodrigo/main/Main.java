package center.rodrigo.main;

import center.rodrigo.connection.Connect;
import center.rodrigo.core.JSONCore;
import center.rodrigo.model.Cep;

public class Main {

    public static void main(String[] args) {

        Connect c = new Connect();
        JSONCore jCore = new JSONCore();

        // consome endpoint passando o CEP
        String json = c.consomeEndPoint("01311300");

        // transforma JSON em um Objeto
        Cep cep = jCore.jsonToCep(json);
        System.out.println(cep.toString());

        // transforma Objeto em JSON
        String myJson = jCore.cepToJSON(cep);
        System.out.println(myJson);
    }
}
