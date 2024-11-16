import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class MyUserAPI {
    public MyUserAPI() throws IOException {
        readConfigFile();
    }
    @Test
    public void doLogin() throws ConfigurationException {
        RestAssured.baseURI="https://restful-booker.herokuapp.com";
        Response res=given().contentType("application/json").body("{\n" +
               "\"username\" : \"admin\",\n" +
                "\"password\" : \"password123\"\n" +
      "}\n").post("/auth");
        System.out.println(res.asString());
        JsonPath jsonPath=res.jsonPath();
        String token=jsonPath.get("token");
        System.out.println(token);
        setEvnVar("token", token);
    }
    @Test
    public void bookingId() throws IOException {
        RestAssured.baseURI="https://restful-booker.herokuapp.com";
        Response res=given().contentType("application/json").get("/booking/1");
        System.out.println(res.asString());

    }
    public void setEvnVar(String key, String value) throws ConfigurationException {
        PropertiesConfiguration config = new PropertiesConfiguration("./src/test/resources/Config.property");
        config.setProperty(key, value);
        config.save();
    }
    Properties prop;
    FileInputStream fs;
    public void readConfigFile() throws IOException {
        prop=new Properties();
        fs=new FileInputStream("./src/test/resources/Config.property");
        prop.load(fs);
        System.out.println(prop.get("token"));
    }

    public static void main(String[] args) throws IOException {
        MyUserAPI api=new MyUserAPI();
        api.readConfigFile();
    }
}
