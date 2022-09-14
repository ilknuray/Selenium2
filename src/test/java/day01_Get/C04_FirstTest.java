package day01_Get;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_FirstTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*
        Amazon sayfasina gidiniz
        1)basligin amazon icerdigini test ediniz
        2)URL in amazon icerdigini test ediniz
        3)sayfati kapatiniz
         */
        //1)amazon sayfasi
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        //2)basligi kontrol ediniz
        String actualtitle = driver.getTitle();
        String istenen = "Amazon";
        if (actualtitle.contains(istenen)) {
            System.out.println("Title test PASSED");
        } else {
            System.out.println("test failed");
        }
        //3)url amazon iceriyormu
        String actualUrl = driver.getCurrentUrl();
        String aranan = "amazon";
        if (actualUrl.contains(aranan)) {
            System.out.println(" URL test PASSED");
        } else {
            System.out.println("test failed");
        }
        //4)sayfayi kapat
        driver.close();
    }
}
