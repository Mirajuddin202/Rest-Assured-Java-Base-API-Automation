import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Setup {
    Properties prop;
    FileInputStream fs;
@BeforeTest
    public void initConfig() throws IOException {
        prop=new Properties();
        fs=new FileInputStream("./src/test/resources/Config.property");
        prop.load(fs);

    }
}
