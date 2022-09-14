package exercices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class E04_LoginTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //a)adrese gidin
        driver.get("http://a.testaddressbook.com");
        //b)sign in butonuna basin
        WebElement signInButonu= driver.findElement(By.id("sign-in"));
        signInButonu.sendKeys("Sign in"+ Keys.ENTER);
        //c)email,password,and button elementlerini locate edin
        WebElement email= driver.findElement(By.id("session_email"));
        WebElement password= driver.findElement(By.id("session_password"));
        WebElement button=driver.findElement(By.name("commit"));
        //d)kullanici adi ve sifreyi girip tiklayin
        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        button.sendKeys("Sign in"+Keys.ENTER);
        //e)expected userin testtechproed@gmail.com verify edin
      WebElement expectedUser=driver.findElement(By.className("navbar-text"));
      if (expectedUser.isDisplayed()){
          System.out.println("Expecteduser test PASSED "+expectedUser.getText());
      }else{
          System.out.println("Expecteduser test FAILED");
      }
        //f)Addresses ve "Sign Out" goruntuleniyormu
        WebElement adresses=driver.findElement(By.linkText("Addresses"));
       if (adresses.isDisplayed()){
           System.out.println("Adresses test PASSED");
       }else{
           System.out.println("Adresses test failed");
       }
        //g)kac link var
        List<WebElement>linkSayisi=driver.findElements(By.tagName("a"));
        System.out.println(linkSayisi.size());
        //linklerin ismi
        for (WebElement each:linkSayisi
             ) {
            System.out.println(each.getText());

        }
        //linkler listesi LAMBDA ile yazalim
        linkSayisi.forEach(t-> System.out.println(t.getText()));
        //h)kapatin
        driver.close();
    }
}
