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
        driver.get("https://mail.ru/");

        String username = "test123456789te5t";
        String password = "AOaTUo)iea12";

        LoginPage loginPage = new LoginPage(driver);

        loginPage.pressLoginButton()
                .switchToLoginFrame()
                .typeUsername(username)
                .typePassword(password)
                .pressSubmitButton()
                .pressSendLetterButton()
                .pressSaveButton();

//        loginPage.pressLoginButton();
//        loginPage.switchToLoginFrame();
//        loginPage.typeUsername(username);
//        loginPage.typePassword(password);
//        loginPage.pressSubmitButton()
//                .pressSendLetterButton()
//                .pressSaveButton();

        driver.quit();
        System.out.println("test passed");
    }
}
