import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MailPage {

    private By sendLetterButtonLocator = By.xpath("//a[@title='Написать письмо']");
    private By textLocator = By.xpath("//div[@tabindex='505']");
    private By saveButtonLocator = By.xpath("//span[@title='Сохранить']");

    private final WebDriver driver;

    public MailPage(WebDriver driver){
        this.driver = driver;
    }

    public MailPage pressSendLetterButton(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(sendLetterButtonLocator)).click();
        return this;
    }

    public MailPage pressSaveButton(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(saveButtonLocator)).click();
        return this;
    }
}
