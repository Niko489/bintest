package swagger;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class testPet {




    @Test
    public void testPet() {
        given()
                .baseUri("https://httpbin.org")
                .when()
                .get("/cookies")
                .then()
                .assertThat()
                .statusCode(200).log().all();

    }


    @Test
    public void testPet2() {
                get("https://httpbin.org")
                .then().log().all();


    }


    @Test
    public void post () {
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body("{\r\n" + " \"\u200Fתעודת זהות\": 101,\r\n" +
                        "    \"firstName\": \"Adam\",\r\n" + "    \"lastName\": \"Katzman\",\r\n" +
                        "    \"email\": \"holon24323.com\",\r\n" +
                        "    \"phone number\": \"05323423235\",\r\n" + "    \"dateOfBirth\": 10.01.1971\r\n"
                        + "}" )
                .post("https://httpbin.org/post")
                .then()
                .statusCode(200)
                .log()
                .all();

    }

    }



