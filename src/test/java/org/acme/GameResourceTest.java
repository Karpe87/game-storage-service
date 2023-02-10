package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GameResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/games/hello")
          .then()
             .statusCode(200)
             .body(is("Game-Storage"));
    }

}