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
import java.util.Map;
import java.util.Objects;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;


public class cookises {

@Test
    public void test6(){

      Response a=given().when().get("https://www.google.com/");
    System.out.println(a.asPrettyString());





    }



}
