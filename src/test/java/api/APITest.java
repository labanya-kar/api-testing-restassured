package api;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITest {

    @Test
    public void testGetAPI() {
        RestAssured
                .given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200);

        System.out.println("API test passed");
    }
}
