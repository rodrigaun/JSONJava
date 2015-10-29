package center.rodrigo.core;

import org.json.JSONObject;
import center.rodrigo.model.Cep;

public class JSONCore {

    public Cep jsonToCep(String json) {

        Cep cep = new Cep();

        JSONObject jsonObj = new JSONObject(json);

        cep.setCep(jsonObj.getString("cep"));
        cep.setLogradouro(jsonObj.getString("logradouro"));
        cep.setComplemento(jsonObj.getString("complemento"));
        cep.setBairro(jsonObj.getString("bairro"));
        cep.setLocalidade(jsonObj.getString("localidade"));
        cep.setUf(jsonObj.getString("uf"));
        cep.setIbge(jsonObj.getInt("ibge"));
        cep.setGia(jsonObj.getInt("gia"));

        return cep;
    }

    public String cepToJSON(Cep cep) {

        JSONObject jsonObj = new JSONObject();

        jsonObj.put("cep", cep.getCep());
        jsonObj.put("logradouro", cep.getLogradouro());
        jsonObj.put("complemento", cep.getComplemento());
        jsonObj.put("bairro", cep.getBairro());
        jsonObj.put("localidade", cep.getLocalidade());
        jsonObj.put("uf", cep.getUf());
        jsonObj.put("ibge", cep.getIbge());
        jsonObj.put("gia", cep.getGia());

        String json = jsonObj.toString();

        return json;
    }
}
