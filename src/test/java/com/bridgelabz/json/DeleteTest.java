package com.bridgelabz.json;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class DeleteTest {
    @Test
    public void deletePetDetails() {
        Response response = RestAssured.delete("http://localhost:3000/posts/1");

        System.out.println("Status code: " + response.statusCode());
        System.out.println("Time:" + response.getTime());
        System.out.println("Response Body: " + response.asPrettyString());
    }
}
