package com.bridgelabz.json;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostTest {
    @Test
    public void postTest() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type","application/json");

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("id","3");
        jsonObject.put("title","server");
        jsonObject.put("author","Prabhas");

        request.body(jsonObject.toJSONString());

        Response response=request.post("http://localhost:3000/posts/");
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Time:" + response.getTime());
        System.out.println("Response Body: " + response.asPrettyString());
//        Assert.assertEquals(response.statusCode(), 200);
    }
}
