package day01_Get;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        //amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");
        // kaynak kodlar icerisnde "Gateway"kelimesinin oldugunu test ediniz

        String istenenKelime= "Gateway";
        if(driver.getPageSource().contains(istenenKelime)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
        driver.close();//acilan sayfayi kapatir
       // driver.quit(); acilan birden fazla sayfa varsa onlari kapatir
    }
}
