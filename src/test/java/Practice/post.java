package Practice;


import com.google.gson.JsonObject;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.json.JSONObject;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Objects;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class post {

    // Response io=  given().headers("x-api-key","reqres-free-v1");

    @Test
    public void test5(){

        JSONObject a = new JSONObject();

        a.put("name","adc");
        a.put("job","adc122");
        



       Response abc= given().headers("x-api-key", "reqres-free-v1").body(a)
                .when().post("https://reqres.in/api/users");

        String z = abc.then().extract().toString();

        System.out.println(abc.statusCode());

    }
}
