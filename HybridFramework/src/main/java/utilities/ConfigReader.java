package utilities;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;

    public static Properties getProperties() {

        try {

            FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties");

            prop = new Properties();
            prop.load(fis);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return prop;
    }

}