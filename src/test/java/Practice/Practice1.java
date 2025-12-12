package Practice;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Objects;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class Practice1 {



    @Test
  public void test1(){

//       given().when().get("https://reqres.in/api/users?page=2").then().body("page",equalTo(2)).log().all();

//        given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200);

//        given().when().get("https://reqres.in/api/users?page=2");
//
//        given().contentType("application/json").get("https://reqres.in/api/users?page=2")
//                .then().log().all();


//        given().when().get("https://reqres.in/api/users?page=2").then().log().all();


//
//     given().contentType("application/json").when().get("https://reqres.in/api/users/2").then().
//             log().all();

        /*
        post request
         */

//        HashMap data =new HashMap();
//        data.put("name","varun");
//        data.put("job","varun2");


//        given().contentType("application/json").body(data).when().post("https://reqres.in/api/users").
//                then().statusCode(201);





  }



}
