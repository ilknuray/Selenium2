package travailEquipe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1.  Yeni bir class olusturun (TekrarTesti)
        // 2.  Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        // doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com");
        String actualTitle = driver.getTitle();
        String arananTitle = "youtube";
        if (actualTitle.contains(arananTitle)) {
            System.out.println("Title test PASSED");
        } else {
            System.out.println(driver.getTitle());
        }
        //3.  Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        String arananUrl = "youtube";
        if (actualUrl.contains(arananUrl)) {
            System.out.println("Url test PASSED");
        } else {
            System.out.println(driver.getCurrentUrl());
        }
        // 4.  Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);
        // 5.  Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(3000);
        // 6.  Sayfayi yenileyin
        driver.navigate().forward();
        Thread.sleep(2000);
        // 7.  Amazon sayfasina donun
        driver.navigate().forward();
        // 8.  Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        // 9.  Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
        String baslik = driver.getTitle();
        String baslik2 = "Amazon";
        if (baslik.contains(baslik2)) {
            System.out.println("baslik test PASSED");
        } else {
            System.out.println(driver.getTitle());
        }

        // 10. Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        String url = driver.getCurrentUrl();
        String url2 = "https://www.amazon.com";
        if (url.contains(url2)) {
            System.out.println("url test passed");
        } else {
            System.out.println("failed");
        }
        // 11. Sayfayi kapatin
        driver.close();

    }
}
