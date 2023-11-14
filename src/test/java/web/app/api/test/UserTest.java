package web.app.api.test;

import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import web.app.api.model.User;
import web.app.api.services.UserService;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
public class UserTest {
    private final UserService userService = new UserService();

    @Test
    @DisplayName("Test Status code is 200")
    public void getUsersStatusCodeTest() {
        Response response = userService.getUsersResponse();
        response
                .then()
                .assertThat()
                .statusCode(200);
    }

    @Test
    @DisplayName("Test Header \"Content-Type\" exist")
    public void getUsersHeaderTest() {
        Response response = userService.getUsersResponse();
        response
                .then()
                .assertThat()
                .header("Content-Type", equalTo("application/json; charset=utf-8"));
    }

    @Test
    @DisplayName("Test users count")
    public void usersCountTest() {
        User[] users = userService.getUsers();
        assertEquals(10, users.length);
    }

}
