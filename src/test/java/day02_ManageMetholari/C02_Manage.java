package day02_ManageMetholari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Manage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        // Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());//acilan browserin konumunu verir
        System.out.println(driver.manage().window().getSize());//acilan browserin olculerini verir
        // Sayfayi simge durumuna getirin
        driver.manage().window().minimize();//browseri simge durumuna getirir
        // simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();//buyutur
        //  Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        //Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();//fullscreen yapar
        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        //Sayfayi kapatin
        driver.close();


    }
}
