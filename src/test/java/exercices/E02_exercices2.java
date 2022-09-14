package exercices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E02_exercices2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //1)Youtube anasayfasina gidelim
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");

        //2)amazon sayfasina gidelim
        driver.get("https://www.amazon.com");

        //youtube sayfasina geri doneleim
        driver.navigate().back();
        Thread.sleep(3000);
        //4)yeniden amazon sayfasina donelim
        driver.navigate().forward();
        Thread.sleep(3000);
        //5)sayfayi refresh yapalim
        driver.navigate().refresh();
        //6)tum sayfalari kapatalim
        driver.close();

    }
}
