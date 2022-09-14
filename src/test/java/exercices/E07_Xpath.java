package exercices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class E07_Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //Add element butonuna basin
        WebElement addElement= driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElement.click();
        //delete butonun gorunun oldugunu test edin
        WebElement deleteButton=driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButton.isDisplayed()){
            System.out.println("Delete buton test PASSED");
        }else{
            System.out.println("Delete buton test FAILED");
        }
        //delete tusuna basin
        deleteButton.click();
        //delete remove elemnts yazisinin gorunur oldugunu test edin
        WebElement deleteRemoveElement=driver.findElement(By.xpath("//h3"));
        if (deleteRemoveElement.isDisplayed()){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }
        driver.close();


    }
}
