package com.bridgelabz.json;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTest {
    @Test
    public void getTest(){
        Response response= RestAssured.get("http://localhost:3000/posts");
        System.out.println("Body : "+response.asPrettyString());
        System.out.println("status code : "+response.getStatusCode());
        System.out.println("time : "+response.getTime());
//        Assert.assertEquals(response.statusCode(), 200);
    }
}
