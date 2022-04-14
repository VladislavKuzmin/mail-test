import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MailPage extends BasePage{

    private By sendLetterButtonLocator = By.xpath("//a[@title='Написать письмо']");
    private By saveButtonLocator = By.xpath("//span[@title='Сохранить']");

    public MailPage(WebDriver driver){
        super(driver);
    }

    public MailPage pressSendLetterButton(){
        click(sendLetterButtonLocator);
        return this;
    }

    public MailPage pressSaveButton(){
        click(saveButtonLocator);
        return this;
    }
}
