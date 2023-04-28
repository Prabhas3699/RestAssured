package com.bridgelabz.json;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class BDDTest {
    @Test
    public void getBDDTest(){
        Response response = given().
                when().
                get("http://localhost:3000/posts");
        System.out.println("Body : "+response.asPrettyString());
        System.out.println("status code : "+response.getStatusCode());
        System.out.println("time : "+response.getTime());
    }

    @Test
    public void postBDDTest(){

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("id","4");
        jsonObject.put("title","server");
        jsonObject.put("author","Prabhas");

        Response response=given().
                headers("Content-Type","application/json").
                body(jsonObject.toJSONString()).
                when().
                post("http://localhost:3000/posts/");
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Time:" + response.getTime());
        System.out.println("Response Body: " + response.asPrettyString());
    }

    @Test
    public void putBDDTest(){

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("title","jsonServer");
        jsonObject.put("author","Prabhakaran");

        Response response=given().
                headers("Content-Type","application/json").
                body(jsonObject.toJSONString()).
                when().
                put("http://localhost:3000/posts/4");
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Time:" + response.getTime());
        System.out.println("Response Body: " + response.asPrettyString());
    }

    @Test
    public void patchBDDTest(){

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("author","Prabha");

        Response response=given().
                headers("Content-Type","application/json").
                body(jsonObject.toJSONString()).
                when().
                patch("http://localhost:3000/posts/4");
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Time:" + response.getTime());
        System.out.println("Response Body: " + response.asPrettyString());
    }

    @Test
    public void deleteBDDTest(){
        Response response= when().
                delete("http://localhost:3000/posts/4");
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Time:" + response.getTime());
        System.out.println("Response Body: " + response.asPrettyString());
    }

}
