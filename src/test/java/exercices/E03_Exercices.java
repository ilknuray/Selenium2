package exercices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E03_Exercices {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
      // odev 2


        //Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String actualTitle= driver.getTitle();
        String aranan="youtube";
        if (actualTitle.contains(aranan)){
            System.out.println(" title test passed");
        }else {
            System.out.println(driver.getTitle());
        }


        //3. Sayfa URL’sinin “youtube” içerip içermediğini
       // (contains) doğrulayın, içermiyorsa doğru
       // URL’yi yazdırın.
        String actualUrl= driver.getCurrentUrl();
        String istenen="youtube";
        if (actualTitle.contains(istenen)){
            System.out.println("URL test passed");
        }else {
            System.out.println(driver.getCurrentUrl());
        }
        Thread.sleep(3000);
        //4. Daha sonra
       // Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com");
        Thread.sleep(3000);

       // 5. Youtube sayfasina geri donun
        driver.navigate().back();
        Thread.sleep(3000);
       // 6. Sayfayi yenileyin
        driver.navigate().refresh();
       // 7. Amazon sayfasina donun
        driver.navigate().forward();
        Thread.sleep(3000);
        //8.
        //Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        //9. Ardından sayfa başlığının “Amazon” içerip içermediğini
        //(contains) doğrulayın, Yoksa
       // doğru başlığı(Actual Title) yazdırın.
        String actualBaslik= driver.getTitle();
        String arananBaslik="Amazon";
        if (actualBaslik.contains(arananBaslik)){
            System.out.println("amazon title test PASSED");
        }else {
            System.out.println(driver.getTitle());
        }
        //10.Sayfa URL’sinin
        //https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL’yi yazdırın
        String actualU=driver.getCurrentUrl();
        String istenenU="https://www.amazon.com";
        if (actualU.contains(istenenU)){
            System.out.println("amazon url test Passed");
        }else {
            System.out.println(driver.getCurrentUrl());
        }
       // 11. Sayfayi kapatin
        driver.close();


                /*
        ödev3
        ClasslassWork : L oginoginTest
        1. Bir class oluşturun: LoginTest
        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
                a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username :
        testtechproed@gmail.com
        ii. Password : Test1234!
                e. Expected user id nin
        testtechproed@gmail.com oldugunu dogrulayin(verify).
                f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.*/

        /*
        1.Yeni bir class olusturalim (Homework)
2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) "facebook"
oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
3.Sayfa URL'inin "facebook" kelimesi icerdigini dogrulayin, icermiyorsa "actual" URL'i
yazdirin.
4.https://www.walmart.com/ sayfasina gidin.
5. Sayfa basliginin "Walmart.com" icerdigini dogrulayin.
6. Tekrar "facebook" sayfasina donun
7. Sayfayi yenileyin
8. Sayfayi tam sayfa (maximize) yapin
9.Browser'i kapatin*/

    }}






