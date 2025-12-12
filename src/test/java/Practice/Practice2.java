package Practice;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Objects;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class Practice2 {



    @Test
    public void test1(){

     int value= given().contentType("application/json").when().get("https://reqres.in/api/users/2")
                      .then().log().all().extract().jsonPath().getInt("data.id");

     //.header("x-api-key", "reqres-free-v1")


//      int p=  given().contentType("application/json").when().get("https://reqres.in/api/users/2")
//                .jsonPath().getInt("data.id");

        System.out.println(value);



    }
}
