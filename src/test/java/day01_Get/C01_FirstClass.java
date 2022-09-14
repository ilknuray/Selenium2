package day01_Get;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_FirstClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("Actual title : "+driver.getTitle());//basligi getitir
        System.out.println("Actual url : "+driver.getCurrentUrl());//gidilen syfanin url ini getirir
        //System.out.println(driver.getPageSource()); kaynak kodlari getirir html deki gibi


        /*
        En temel haliyle bir otomasyon yapmak icin classimiza otomasyon icin gerekli olan webdriverin yerini
        gostermemiz gerekir.bunu icin java kutuphanesinde system.setProperty() methodunu kullaniriz.
        ve methodun icine ilk olarak driveri yazariz.ikinci olarak onun fiziki yolunu kopyalariz.
         */

    }
}
