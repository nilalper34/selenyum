package day02;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_manageMethodlari2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/reseources/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();


      //  Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://amozon.com");

      //  Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("konumu:"+driver.manage().window().getPosition());
        System.out.println("sayfa boyutları:"+driver.manage().window().getSize());

      //  Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(20,20)); //sayfanın konumunu isteddiğimiz sekilde ayarlar
        driver.manage().window().setSize(new Dimension(600,300));

     //   Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("sayfanın yeni konumu:"+driver.manage().window().getPosition());
        System.out.println("sayfanin yeni boyutları:"+driver.manage().window().getSize());

     //    Sayfayi kapatin
        Thread.sleep(2000);
        driver.close();




    }
}
