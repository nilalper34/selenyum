package mehmethoca.day2_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2C1_webElement {
    public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","src/reseources/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://tr-tr.facebook.com/");

        //email kutusuna "ali" yazdıralım

        // <input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" placeholder="E-posta veya Telefon Numarası"
        // autofocus="1" aria-label="E-posta veya Telefon Numarası">

        WebElement mailTextBox= driver.findElement(By.id("email"));
        mailTextBox.sendKeys("aliseleniumcu@gmail.com");
        Thread.sleep(2000);

       mailTextBox.clear();
    /*
    WebElement mailKutusuTagnameİle=driver.findElement(By.tagName("input"));
    mailKutusuTagnameİle.sendKeys("veligocer@gmail.com"); //hata veriyor cunku tagname olan bir tane yer yok adresi bulamadı

     WebElement yanlisElement= driver.findElement(By.id("yanlisemail"));

 yanlisElement.sendKeys("yanliş eleman"); //NoSuchElement exception hatası varsa locatorda hata var demektir

       */

     WebElement girisButonu= driver.findElement(By.tagName("button"));
        System.out.println(girisButonu.isEnabled());
       girisButonu.click(); //1.yol









    }

}
