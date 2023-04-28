package com.bridgelabz.json;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PatchTest {
    @Test
    public void postTest(){
        RequestSpecification request= RestAssured.given();
        request.header("Content-Type", "application/json");

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("title","json");

        request.body(jsonObject.toJSONString());

        Response response=request.patch("http://localhost:3000/posts/3");
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Time:" + response.getTime());
        System.out.println("Response Body: " + response.asPrettyString());
    }
}
