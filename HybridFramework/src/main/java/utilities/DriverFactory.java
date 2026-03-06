package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static WebDriver driver;

    public static WebDriver initDriver() {

        if (driver == null) {

            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        return driver;
    }

    public static WebDriver getDriver() {

        return driver;
    }

}