package exercices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class E05_GetMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         //a)amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");
        //b)arama kutusunu locate ediniz
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        //c)arama kutusunun tagname inin input oldugunu test ediniz
        String expectedTagname="input";
        String actualTagName=aramaKutusu.getTagName();
        if (actualTagName.contains(expectedTagname)){
            System.out.println("Tagname test PASSED");
        }else{
            System.out.println("tag name test FAILED");
        }
        //arama kutusunun name attributunun   oldugunu tespit ediniz
        String expectedAttribute="field-keywords";
        String actualAttributeName=aramaKutusu.getAttribute("name");
        if (actualAttributeName.contains(expectedAttribute)){
            System.out.println("name attribute test PASSED");
        }else{
            System.out.println("Name attribute tast FAILED");
        }
        driver.close();
        //arama kutusunun kànumunu yazdiriniz
        System.out.println(aramaKutusu.getLocation());


    }
}
