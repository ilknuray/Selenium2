package day01_Get;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowsHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getWindowHandle());//handle degerini getirir.CDwindow-67AC3D8C01B185BDB889FECD8DC68798
        //farkli pencereler arasinda gezinebilmek icin kullaniriz.
    }
}
