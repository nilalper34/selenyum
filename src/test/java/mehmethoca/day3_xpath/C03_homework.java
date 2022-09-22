package mehmethoca.day3_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_homework {
    //amozon.com git java kelimesini aratın
    // kac sonuc geldiğini ve 4.ve 7. nin isimlerini yazdirin
    public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chorme.driver","src/reseources/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.amozon.com");
        WebElement searchBox= driver.findElement(By.xpath("//input[@type='text']"));
        searchBox.sendKeys("java"+ Keys.ENTER);





    }
}
