import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    protected WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    protected void click(By locator){
        waitVisibility(locator);
        findElement(locator).click();
    }

    protected void switchToFrame(By locator){
        driver.switchTo().frame(findElement(locator));
    }

    protected void waitVisibility(By locator){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    protected void type(By locator,String text){
        waitVisibility(locator);
        findElement(locator).sendKeys(text);
    }

    protected void type(By locator,String text, Keys keys){
        waitVisibility(locator);
        findElement(locator).sendKeys(text + keys);
    }
}
