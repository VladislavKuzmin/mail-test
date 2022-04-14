import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.log.Log;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage{

    private By loginButtonLocator = By.xpath("//button[@data-testid='enter-mail-primary']");
    private By usernameLocator = By.xpath("//input[@name='username']");
    private By passwordLocator = By.xpath("//input[@name='password']");
    private By loginFrameLocator = By.xpath("//iframe[@class='ag-popup__frame__layout__iframe']");
    private By submitButtonLocator = By.xpath("//button[@data-test-id='submit-button']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage pressLoginButton(){
        click(loginButtonLocator);
        return this;
    }

    public LoginPage switchToLoginFrame(){
        switchToFrame(loginFrameLocator);
        return this;
    }

    public LoginPage typeUsername(String username){
        type(usernameLocator, username, Keys.ENTER);
        return this;
    }

    public LoginPage typePassword(String password){
        type(passwordLocator, password, Keys.ENTER);
        return this;
    }

    public MailPage pressSubmitButton(){
        click(submitButtonLocator);
        return new MailPage(driver);
    }

}
