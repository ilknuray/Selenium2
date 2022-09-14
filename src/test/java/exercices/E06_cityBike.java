package exercices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class E06_cityBike {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);
        List<WebElement> aramaSonucu = driver.findElements(By.className("sg-col-inner"));
        System.out.println(aramaSonucu.get(0).getText());
        //sadece sonuc yazisini yazdirin
        //ilk rsme tikla
        List<WebElement>ilkResim=driver.findElements(By.className("s-image"));
        WebElement ilk= ilkResim.get(0);
        ilk.click();
    }
}
