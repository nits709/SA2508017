package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    By email = By.xpath("//input[@data-qa='login-email']");
    By password = By.xpath("//input[@data-qa='login-password']");
    By loginBtn = By.xpath("//button[@data-qa='login-button']");

    public LoginPage(WebDriver driver) {

        super(driver);
    }

    public void login(String user,String pass) {

        type(email,user);
        type(password,pass);
        click(loginBtn);
    }

}