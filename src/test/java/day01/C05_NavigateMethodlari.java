package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/reseources/drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://amazon.com");

       // driver.navigate().to() methodu sayfada ileri geri yapacaksakkullanılır
        //driver.get gibi bizi istddiğimiz url götürür

        driver.navigate().to("https://techproeducation.com");

     // tekrar amozon sayfasına dönelim

        Thread.sleep(3000);
        driver.navigate().back();
        //tekrar techpro gidelim

        Thread.sleep(3000);
        driver.navigate().forward();
        // Techproed sayfasını yenileyelim
        driver.navigate().refresh();
    driver.close();

    }
}
