package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AU01_RegisterUser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //Test Case 1: Register User
//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
//3. Verify that home page is visible successfully
        driver.getTitle();

//4. Click on 'Signup / Login' button
        WebElement signUp = driver.findElement(By.xpath("(//*[@class='fa fa-lock'])[1]"));
        signUp.click();
//5. Verify 'New User Signup!' is visible
        WebElement userSignUp = driver.findElement(By.xpath("//h2"));
        if (userSignUp.isDisplayed()) {
            System.out.println("usersignup test PASSED");
        } else {
            System.out.println("user test FAILED");
        }

//6. Enter name and email address
        WebElement name = driver.findElement(By.xpath("//*[@type='text']"));
        name.sendKeys("ilknur" + Keys.ENTER);
        WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        email.sendKeys("ilknur@gmail.com");
//7. Click 'Signup' button
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement account = driver.findElement(By.xpath("(//h2[@class='title text-center'])[1]"));
        if (account.isDisplayed()) {
            System.out.println("enter account test PASSED");
        } else {
            System.out.println("enter account test FAILED");
        }
//9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("(//*[@class='radio-inline'])[2]")).click();
        WebElement password = driver.findElement(By.xpath("(//*[@for='password'])[1]"));
        WebElement pass = driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
        pass.sendKeys("123456");
        //driver.findElement(By.xpath("//*[@text()='Date of Birth']")).click();
        // WebElement day = driver.findElement(By.xpath("(//*[@id='uniform-days'])"));
        //day.sendKeys("01");
        //WebElement month=driver.findElement(By.xpath("//*[@id='uniform-months']"));
        //month.sendKeys("02");
        //WebElement year=driver.findElement(By.xpath("//*[@id='uniform-months']"));
        //year.sendKeys("1988");
//10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.xpath("//input[@name='newsletter']")).click();
//11. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.xpath("//input[@id=\"optin\"]")).click();
//12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        WebElement firstName=driver.findElement(By.xpath("//input[@id='first_name']"));
        firstName.sendKeys("Ayse");
        WebElement lastName=driver.findElement(By.xpath("//input[@id='last_name']"));
        lastName.sendKeys("Fatma");
        WebElement company=driver.findElement(By.xpath("//input[@id='company']"));
        company.sendKeys("abc");
        WebElement adress=driver.findElement(By.xpath("//input[@id='address1']"));
        adress.sendKeys("ulubey street 06780 turkey");
        WebElement country=driver.findElement(By.xpath("//*[@id='country']"));
        country.sendKeys("Turkey");
//13. Click 'Create Account button'
//14. Verify that 'ACCOUNT CREATED!' is visible
//15. Click 'Continue' button
//16. Verify that 'Logged in as username' is visible
//17. Click 'Delete Account' button
//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

    }
}
