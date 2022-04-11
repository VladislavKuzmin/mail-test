import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        String userName = "failmego@mail.ru";
        String password = "2568931kuzmin";

        WebDriver driver = new ChromeDriver();

            driver.get("https://mail.ru/");
            driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[1]/div[2]/div[1]/button")).click();
                driver.findElement(By.className("input-0-2-71")).click();
                System.out.println("sasasa");
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/form/div[2]/div[2]/div[1]/div/div/div/div/div/div[1]/div/input")).sendKeys(userName + Keys.ENTER);
    }

}
