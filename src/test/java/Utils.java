import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class Utils {

        public static void setEvnVar(String key, String value) throws ConfigurationException {
            PropertiesConfiguration config = new PropertiesConfiguration("./src/test/resources/Config.property");
            config.setProperty(key, value);
            config.save();
        }
    }
