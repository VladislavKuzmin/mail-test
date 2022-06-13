package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class Main {

    String username = "test123456789te5t";
    String password = "AOaTUo)iea12";

    static WebDriver driver;

    String urlToTest = "https://mail.ru/";

    @BeforeAll
    public static void start(){
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    }

    @BeforeEach
    public void setup(){
        driver = new ChromeDriver();
        driver.get(urlToTest);
    }

    @Test
    public void sendInDraft_TEST() {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.pressLoginButton()
                .switchToLoginFrame()
                .typeUsername(username)
                .typePassword(password)
                .pressSubmitButton()
                .pressSendLetterButton()
                .pressSaveButton();

        System.out.println("stash test passed");
    }

    @Test
    public void login_TEST(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.pressLoginButton()
                .switchToLoginFrame()
                .typeUsername(username)
                .typePassword(password)
                .pressSubmitButton();

        System.out.println("login test passed");
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    @AfterAll
    public static void end(){
        System.out.println("Tests ended");
    }
}
