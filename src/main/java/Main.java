import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String userName = "test123456789te5t";
        String password = "AOaTUo)iea12";

        final String URL = "https://mail.ru/";

        driver.get(URL);

        driver.findElement(By.xpath("//button[@data-testid='enter-mail-primary']")).click();

        WebElement loginFrame = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='ag-popup__frame__layout__iframe']")));
        driver.switchTo().frame(loginFrame);

        WebElement loginField = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']")));
        loginField.sendKeys(userName + Keys.ENTER);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //не понятно

        WebElement passwordField = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']")));
        passwordField.sendKeys(password + Keys.ENTER);

        WebElement sendLetterField = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Написать письмо']")));
        sendLetterField.click();

        driver.findElement(By.xpath("//div[@tabindex='505']")).sendKeys("some text");

        driver.findElement(By.xpath("//span[@title='Сохранить']")).click();

        driver.quit();
        System.out.println("test passed");
    }
}
