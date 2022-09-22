package mehmethoca.day2_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2C2_AmazonArama {
    public static void main(String[] args) {
        // amozon sayfasına gidin
        //JAVA yazdirin
        //bulunan sonuc sayısını yazdirin




        System.setProperty("webdriver.chrome.driver","src/reseources/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get(" https://www.amazon.com.tr/");

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("java"+ Keys.ENTER);

       WebElement sonucYazisi= driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));

        System.out.println(sonucYazisi.getText());//yazdirmak için getText() (web elementler obje oldugu için yazdırılamıyor)



    }
}
