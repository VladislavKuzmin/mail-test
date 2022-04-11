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
        String userName = "test123456789te5t";
        String password = "AOaTUo)iea12";
        String url = "https://account.mail.ru/login/?mode=simple&v=2.8.2&account_host=account.mail.ru&type=login&allow_external=1&app_id_mytracker=58519&success_redirect=https%3A%2F%2Fe.mail.ru%2Fmessages%2Finbox%3Fback%3D1&project=home&from=navi&parent_url=https%3A%2F%2Fmail.ru%2F";

        WebDriver driver = new ChromeDriver();

        driver.get(url);
        // driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[1]/div[2]/div[1]/button")).click();
        //
        WebElement loginField = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        loginField.sendKeys(userName);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div/div/form/div[2]/div[2]/div[3]/div/div/div[1]/button")).click();
        WebElement passwordField = new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        passwordField.sendKeys(password);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div/div/form/div[2]/div/div[3]/div/div/div[1]/div/button")).click();
    }
}
