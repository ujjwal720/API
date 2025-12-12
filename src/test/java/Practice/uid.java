package Practice;

import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class uid {


    @Test
    public void test56() {

        Response a = given().headers("x-api-key", "reqres-free-v1").when().get("https://reqres.in/api/users?page=2");

        String uiz = a.getBody().toString();

        System.out.println(uiz);

        JSONObject ui = new JSONObject(a.getBody().asString());

        JSONArray arr = ui.getJSONArray("data");




        System.out.println(arr.length());

        int p = arr.getJSONObject(0).getInt("id");

        System.out.println(p);


    }
}
