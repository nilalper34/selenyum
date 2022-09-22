package mehmethoca.day3_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_cssSelector {
    // 1.bir class olusturun: Locators_css
    // 2. main method ve sonraki adımları yapınız
        //a. verilen web sayfassına gidiniz https://a.testaddressbook.com/sign_in
       // b. Locate email textbox ve
       // c. locate password textbox ve
     // d. Locate signin button
    // e. Asagıdaki kullanıcı adını ve sifreyi girin ve sign düğmesine bassınız
          // e.i username : testtechproed@gmail.com
         // e.ii password : Test1234!
    // not: css selector kullanarakelementleri locate ediniz

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/reseources/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //a. verilen web sayfassına gidiniz https://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        // b. Locate email textbox
    //   xpath  WebElement emailTextbox= driver.findElement(By.xpath("//input[@type='email']"));
        WebElement emailTextbox2= driver.findElement(By.cssSelector(".form-control")); //css-selector

        // c. locate password textbox ve
        WebElement passwordTextbox= driver.findElement(By.xpath("//input[@type='password']"));
       //  WebElement passwordTextbox2= driver.findElement(By.cssSelector("(input[id='session_password']"));  //css selector

        // d. Locate signin button
     WebElement signTexbox=driver.findElement(By.xpath("//input[@name='commit']"));

        // e. Asagıdaki kullanıcı adını ve sifreyi girin ve sign düğmesine bassınız

        // e.i username : testtechproed@gmail.com
        emailTextbox2.sendKeys("testtechproed@gmail.com");

        // e.ii password : Test1234!
        passwordTextbox.sendKeys("Test1234!");
        signTexbox.click();

driver.close();





    }

}
