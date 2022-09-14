package exercices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class E08_AddButonu10kezBas {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://www.the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //add element butonuna 10kez basin
        WebElement addElement=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        int count=0;
        for (int i = 1; i <=10 ; i++) {
            addElement.click();
            count++;

        }
        //10 kez webelement butonuna basildigini test et
        if (count==10){
            System.out.println("butona 10 kez basilmistir test PASSED");
        }else {
            System.out.println("button test FAILED");
        }
        //delete butonuna gorunmeyene kadar basiniz
        List<WebElement> deleteButton=driver.findElements(By.xpath("//button[@class='added-manually']"));
        int basilmaSayisi=10;
        for (int i = 0; i <10 ; i++) {
            deleteButton.get(i).click();
            basilmaSayisi--;

        }
        //delete butonunun gorunmedigini test ediniz
        if (basilmaSayisi==0){
            System.out.println("delete button test PASSED");
        }else{
            System.out.println("delete button test FAILED");
        }





    }
}
