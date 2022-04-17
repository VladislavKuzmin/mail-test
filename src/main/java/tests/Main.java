package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

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

        driver.quit();
        System.out.println("test passed");
        
    }
}
