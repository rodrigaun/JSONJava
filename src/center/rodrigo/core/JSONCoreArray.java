package center.rodrigo.core;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONCoreArray {

    public String createJOSNArray() {

        // cria objeto json principal
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("firstName", "Homer");
        jsonObj.put("lastName", "Simpson");
        jsonObj.put("age", 41);

        // cria objeto json para o endereço
        JSONObject address = new JSONObject();
        address.put("streetAddress", "742 Evergreen Terrace");
        address.put("city", "Springfield");
        address.put("country", "United States of America");

        // cria objeto array e insere objeto endereço dentro
        JSONArray array = new JSONArray();
        array.put("address");
        array.put(0, address);

        // insere o objeto array dentro do objeto principal
        jsonObj.put("address", array);

        String json = jsonObj.toString();
        return json;
    }

    public void consumeJSONArray(String json) {

        JSONObject jsonObj = new JSONObject(json);

        System.out.println(jsonObj.get("firstName"));
        System.out.println(jsonObj.get("lastName"));
        System.out.println(jsonObj.get("age"));

        JSONArray address = jsonObj.getJSONArray("address");

        for (int i = 0; i < address.length(); i++) {

            JSONObject temp = new JSONObject(address.get(i).toString());

            System.out.println("\t" + temp.get("streetAddress"));
            System.out.println("\t" + temp.get("city"));
            System.out.println("\t" + temp.get("country"));
        }
    }
}
