package Practice;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class practice3 {


    @Test
    public void test4(){

     int p=   given().pathParam("user","users").queryParam("page",2).headers("x-api-key","reqres-free-v1")
                .when().get("https://reqres.in/api/{user}")
                .then().extract().jsonPath().getInt("data[0].id");

        System.out.println(p);




    }
}
