package Practice;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Objects;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class chaining {

    int p;


    @Test
    public void createuser(){

        HashMap data=new HashMap();
        data.put("name","varun");
        data.put("job","helper");

   Response i=  given().header("x-api-key", "reqres-free-v1").body(data).headers("Content-Type", "application/json")
             .when().post("https://reqres.in/api/users");


     int o=i.statusCode();
        System.out.println(i.asPrettyString());

        System.out.println(o);
    }


}
