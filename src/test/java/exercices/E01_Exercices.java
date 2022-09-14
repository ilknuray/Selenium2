package exercices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E01_Exercices {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //1)amazon sayfasina gidelim
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        //2)Sayfa basligini yazdirin
        System.out.println(driver.getTitle());
        //3)baslik amazon iceriyor mu?
        String actualTitle= driver.getTitle();
        String aranan="Amazon";
        if (actualTitle.contains(aranan)){
            System.out.println("Title test PASSED");
        }else{
            System.out.println("test FAILED");
        }
        //4)URL adresini yazdiralim
        System.out.println(driver.getCurrentUrl());

        //5)url amazon iceriyormu
        String actualUrl= driver.getCurrentUrl();
        String istenen="amazon";
        if (actualUrl.contains(istenen)){
            System.out.println("URL test PASSED");
        }else{
            System.out.println("test failed");
        }
        //6)handle degerini yazdiriniz
        System.out.println(driver.getWindowHandle());




        //7)"gateway" iceriyormu
        String istenenKelime="Gateway";
        if (driver.getPageSource().contains(istenenKelime)){
            System.out.println("Source test PASSED");
        }else {
            System.out.println("test failed");
        }
        driver.close();
    }
}
