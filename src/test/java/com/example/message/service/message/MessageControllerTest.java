package com.example.message.service.message;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class MessageControllerTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/message")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

}