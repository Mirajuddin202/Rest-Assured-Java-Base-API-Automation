import io.restassured.path.json.JsonPath;
import org.apache.commons.configuration.ConfigurationException;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserTestRunner {
    @Test(priority = 1, enabled = false)
    public void doLogin() throws IOException, ConfigurationException {
        UserController userController=new UserController();
        userController.doLogin("admin","password123");

    }
    //@Test(priority = 2)
    public void bookingId() throws IOException {
        UserController userController=new UserController();
        userController.bookingId("1");

    }
    @Test(priority = 3)
    public void createBooking() throws IOException, ConfigurationException {
        UserController userController=new UserController();
        UserModel model=new UserModel();
        model.setFirstname("Miraj");
        model.setLastname("Uddin");
        model.setTotalprice("500");
        model.setDepositpaid("True");
        model.setBookingdates("2024-11-16");
        model.setAdditionalneeds("Breakfast");
        userController.createBooking(model);


    }
}
