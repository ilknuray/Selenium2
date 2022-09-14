package day01_Get;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com");//bu method sayfada ileri geri yapmak icin kullanilir
        //driver.get() gibi bizi istedigimiz url e goturur.

        driver.navigate().to("https://www.techproeducation.com");
        Thread.sleep(3000);
        driver.navigate().back();//ilk acilan sayfaya doner.yada bir onceki sayfaya
        Thread.sleep(3000);
        driver.navigate().forward();//tekrar geri dondurur.
        Thread.sleep(3000);
        driver.navigate().refresh();//icinde oldugum sayfayi yeniler.

        driver.close();//sayfayi kapatiyor.



    }
}
