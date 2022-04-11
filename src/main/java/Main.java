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

        driver.findElement(By.xpath("//*[@id=\"mailbox\"]/div[1]/button")).click();

        WebElement loginFrame = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/iframe")));
        driver.switchTo().frame(loginFrame);

        WebElement loginField = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/form/div[2]/div[2]/div[1]/div/div/div/div/div/div[1]/div/input")));
        loginField.sendKeys(userName + Keys.ENTER);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //не понятно

        WebElement passwordField = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/form/div[2]/div/div[2]/div/div/div/div/div/input")));
        passwordField.sendKeys(password + Keys.ENTER);

        WebElement sendLetterField;
        try {
            sendLetterField = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app-canvas\"]/div/div[1]/div[1]/div/div[2]/span/div[1]/div[1]/div/div/div/div[1]/div/div/a"))); //не понятно
            sendLetterField.click();
        }
        catch (Exception e){
            sendLetterField = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"app-canvas\"]/div/div[1]/div[1]/div/div[2]/span/div[1]/div[1]/div/div/div/div[1]/div/div/a")));
            sendLetterField.click();
        }

        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/div[3]/div[5]/div/div/div[2]/div[1]/div[1]")).sendKeys("some text");

        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[1]/span[2]/span/span")).click();
        driver.quit();
        System.out.println("test completed");
    }
}
