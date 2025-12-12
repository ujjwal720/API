package Practice;

import org.testng.annotations.Test;


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

public class queryparams {


    @Test(description = "The following method for the automation testing")
    public void test2(){

         int p= given().pathParam("user","users").queryParam("page",2).headers("x-api-key","reqres-free-v1")
                  .when().get("https://reqres.in/api/{user}")
                  .then().extract().statusCode();

         if(p==200){

             System.out.println("Request has been passed");
         }

         else{

             System.out.println("Request has been not passed");
         }


    }
}
