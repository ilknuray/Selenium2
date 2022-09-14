package day02_ManageMetholari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C06_findelements {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //Amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");
        //amazondaki tag larin sayisini yazdiriniz
        List<WebElement> tag=driver.findElements(By.tagName("input"));
        System.out.println(tag.size());
    }
}
