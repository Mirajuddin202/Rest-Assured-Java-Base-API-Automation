import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class UserController extends Setup {
    public UserController() throws IOException {
        initConfig();

    }

    public void doLogin(String username, String password) throws ConfigurationException {
        RestAssured.baseURI = prop.getProperty("baseUrl");
        UserModel model = new UserModel();
        model.setUsername(username);
        model.setPassword(password);
        Response res = given().contentType("application/json").body(model).post("/auth");
        System.out.println(res.asString());
        JsonPath jsonPath = res.jsonPath();
        String token = jsonPath.get("token");
        System.out.println(token);
        Utils.setEvnVar("token", token);
    }

    public void bookingId(String bookId) throws IOException {
        RestAssured.baseURI = prop.getProperty("baseUrl");
        Response res = given().contentType("application/json").get("/booking/" + bookId);
        System.out.println(res.asString());
    }
    public void createBooking(UserModel model) throws ConfigurationException {
        RestAssured.baseURI = prop.getProperty("baseUrl");
//        model.setFirstname(model.getFirstname());
  //      model.setLastname(model.getLastname());
    //    model.setTotalprice(model.getTotalprice());
     //   model.setDepositpaid(model.getDepositpaid());
      //  model.setBookingdates(model.getBookingdates());
       // model.setAdditionalneeds(model.getAdditionalneeds());


        Response res = given().contentType("application/json").
               body(model).header("Authorization",prop.getProperty("token")).
               post("/booking");
       System.out.println(res.asString());


    }

    }

