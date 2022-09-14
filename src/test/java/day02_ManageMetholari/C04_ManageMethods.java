package day02_ManageMetholari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//bir sayfa acilirken ilk basta sayfanin icerisinde
        //bulunan elementlere gore bir yukleme suresine ihtiyac vardir veya bir web elementin kullanilabilmesi icin zamana ihtiyac
        //olabilir implicitlyWait()bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin beklenecek max sureyi belirleme
        //olanagi tanir.
        driver.get("https://www.techproeducation.com");
        driver.close();
    }
}
