package travailEquipe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();


//http://a.testaddressbook.com adresine gidiniz.
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();


//email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox= driver.findElement(By.id("session_email"));
        WebElement passwordTextBox= driver.findElement(By.id("session_password"));
        WebElement signin=driver.findElement(By.id("commit"));


//Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        emailTextBox.sendKeys( "testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signin.click();

//Username : testtechproed@gmail.com
//Password : Test1234!
//Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement expectedUser=driver.findElement(By.className("navbar-text"));

//“Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
//Sayfada kac tane link oldugunu bulun.

    }
}
