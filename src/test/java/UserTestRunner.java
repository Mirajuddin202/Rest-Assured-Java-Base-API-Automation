import io.restassured.path.json.JsonPath;
import org.apache.commons.configuration.ConfigurationException;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserTestRunner extends Setup {
    @Test(priority = 1, enabled = false)
    public void doLogin() throws IOException, ConfigurationException {
        UserController userController=new UserController();
        userController.doLogin("admin","password123");

    }
    @Test(priority = 2)
    public void bookingId() throws IOException {
        UserController userController=new UserController();
        userController.bookingId("1");

    }

}
