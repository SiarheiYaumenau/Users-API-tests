package web.app.api.services;

import io.restassured.response.Response;
import web.app.api.model.User;
import static io.restassured.RestAssured.given;

public class UserService {
    private final String endpoint = "https://jsonplaceholder.typicode.com/users";


    public Response getUsersResponse() {
        return given()
                .when()
                .get(endpoint);
    }

    public User[] getUsers() {
        Response response = getUsersResponse();
        return response.as(User[].class);
    }
}
