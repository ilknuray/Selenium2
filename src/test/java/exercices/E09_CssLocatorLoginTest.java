package exercices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Watchable;
import java.time.Duration;

public class E09_CssLocatorLoginTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //http://a.testaddressbook.com/sign_in adresine gidin
        driver.get("http://a.testaddressbook.com/sign_in");

        //locate email textbox
        WebElement emailBox= driver.findElement(By.cssSelector("#session_email"));
        //locate password box
        WebElement passwordBox= driver.findElement(By.cssSelector("#session_password"));
        //locate sig in
        WebElement signIn=driver.findElement(By.cssSelector("input[name='commit']"));
        //asagidaki kullanici adi ve passwordu girin
        emailBox.sendKeys("testtechproed@gmail.com");
        passwordBox.sendKeys("Test1234!");

    }
}
