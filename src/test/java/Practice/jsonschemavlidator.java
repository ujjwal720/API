package Practice;

import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

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

public class jsonschemavlidator {


    @Test
    public void test33(){

//  ValidatableResponse res= given().auth().basic("postman","password").get("https://postman-echo.com/basic-auth")
//                .then().assertThat().statusCode(201);
//
//        System.out.println(res);


       Response r= given().auth().basic("postman","password").get("https://postman-echo.com/basic-auth");





    }
}
