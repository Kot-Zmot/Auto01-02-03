package ru.netology;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostmanEchoTest {

    @Test
    public void testPostman() {
        // Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("HELLO FRIEND") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("HELLO FRIEND")
        ;
    }
}