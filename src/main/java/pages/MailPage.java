package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailPage extends BasePage{

    private By sendLetterButtonLocator = By.xpath("//a[@title='Написать письмо']");
    private By saveButtonLocator = By.xpath("//button[@data-test-id='save']");
    private By selectAllButtonLocator = By.xpath("//span[@title='Выделить все']");
    private By markAllAsReadLocator = By.xpath("//span[@class='button2__wrapper']");
   // private By goToDraftButtonLocator = By.xpath("//a[@href='/drafts/']");

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

    public MailPage pressSelectAllButton(){
        click(saveButtonLocator);
        return this;
    }

    public MailPage pressMarkAllAsReadLocatorButton(){
        click(markAllAsReadLocator);
        return this;
    }

//    public MailPage pressGoToDraftButton(){
//        click(goToDraftButtonLocator);
//        return this;
//    }
}
