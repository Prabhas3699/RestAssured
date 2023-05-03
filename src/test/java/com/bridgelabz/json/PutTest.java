package com.bridgelabz.json;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PutTest {
    @Test
    public void postTest(){
        RequestSpecification request= RestAssured.given();
        request.header("Content-Type", "application/json");

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("title","jsonServer");
        jsonObject.put("author","Prabhakaran");

        request.body(jsonObject.toJSONString());

        Response response=request.put("http://localhost:3000/posts/1");
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Time:" + response.getTime());
        System.out.println("Response Body: " + response.asPrettyString());
//        Assert.assertEquals(response.statusCode(), 200);
    }
}
