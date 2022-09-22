package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/reseources/drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

       // 1-Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://amozon.com");

       // 2- Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("pencere konumu: "+driver.manage().window().getPosition());
        System.out.println("pencere olcüleri:"+driver.manage().window().getSize());

        // 3- Sayfayi simge durumuna getirin
            Thread.sleep(3000);
        driver.manage().window().minimize();

        // 4- simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

      // 5-  Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("pencerenin konumu: "+driver.manage().window().getPosition());
        System.out.println("pencerenin olcüleri:"+driver.manage().window().getSize());

        // 6-  Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

      // 7-  Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("fullscreen konumu: "+driver.manage().window().getPosition());
        System.out.println("fullscreen olcüleri:"+driver.manage().window().getSize());

        // 8-  Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();












    }

}
