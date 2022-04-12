import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.log.Log;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private By loginButtonLocator = By.xpath("//button[@data-testid='enter-mail-primary']");
    private By usernameLocator = By.xpath("//input[@name='username']");
    private By passwordLocator = By.xpath("//input[@name='password']");
    private By loginFrameLocator = By.xpath("//iframe[@class='ag-popup__frame__layout__iframe']");
    private By submitButtonLocator = By.xpath("//button[@data-test-id='submit-button']");

    private final WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage pressLoginButton(){
        driver.findElement(loginButtonLocator).click();
        return this;
    }

    public LoginPage switchToLoginFrame(){
        driver.switchTo().frame(driver.findElement(loginFrameLocator));
        return this;
    }

    public LoginPage typeUsername(String username){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(usernameLocator)).sendKeys(username + Keys.ENTER);
        return this;
    }

    public LoginPage typePassword(String password){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(passwordLocator)).sendKeys(password);
        return this;
    }

    public MailPage pressSubmitButton(){
        driver.findElement(submitButtonLocator).click();
        return new MailPage(driver);
    }

}
