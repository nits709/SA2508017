package utilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {

    public static void capture(WebDriver driver,String name) {

        try {

            File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(src,new File("screenshots/"+name+".png"));

        } catch(Exception e) {

            e.printStackTrace();

        }
    }
}