package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    By signupLogin = By.xpath("//a[contains(text(),'Signup / Login')]");

    public HomePage(WebDriver driver) {

        super(driver);
    }

    public void clickSignupLogin() {

        click(signupLogin);
    }

}