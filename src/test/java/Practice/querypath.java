package Practice;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static io.restassured.RestAssured.*;

public class querypath {


    @Test
    public void test1(){

//         Response a= given().when().get("https://www.google.com/");
//          Map<String,String> i= a.getCookies();
//          System.out.println(i);


          Response y=given().headers("x-api-key","reqres-free-v1").
                  pathParam("user","users").pathParam("id","2")
                  .when().get("https://reqres.in/api/{user}/{id}");
        int p=  y.then().extract().statusCode();

        System.out.println(p);







    }



}
