package Practice;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Objects;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class pojo2 {

    @Test
    public void test1(){

        pojo1 a=new pojo1("Aman","QA");

//     String ui=  given().headers("x-api-key","reqres-free-v1").body(a)
//               .when().post("https://reqres.in/api/users").asPrettyString();
//
//        System.out.println(ui);


        given().headers("x-api-key","reqres-free-v1").body(a).when().post("https://reqres.in/api/users")
                .then().body("id",equalTo(""));





    }






}
