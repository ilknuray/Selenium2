package exercices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class E10_LocatorsXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazona gidin
        driver.get("https://www.amazon.com");

        //browseri tam sayfa yapin
        driver.manage().window().fullscreen();

        //sayfayi refresh yapin
        driver.navigate().refresh();

        //Sayfa basliginin Spend less icerdigini test edin
        String expectedBaslik = "Spend less";
        String actualBaslik = driver.getTitle();

        if (actualBaslik.contains(expectedBaslik)) {
            System.out.println("baslik test PASSED");
        } else {
            System.out.println("baslik test FAILED");
        }
        //gift cards sekmesine basin
        WebElement giftCards = driver.findElement(By.xpath("//*[text()='Gift Cards']"));
        giftCards.click();

        //Birtday butonuna basin
        driver.findElement(By.xpath("//img[@src='https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2021/GCLP/Support/2x/Occ_Birthday_346x130.png']")).click();

        //Best seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("//img[@alt='Amazon.com eGift Card']")).click();

        //gift card 25$ tikla
        driver.findElement(By.xpath("//button[@id='gc-mini-picker-amount-1']")).click();

        //urun ucretinin 25 dolar oldugunu test edin



    }
}
