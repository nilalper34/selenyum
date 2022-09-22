package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/reseources/drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       /*
       ileride wait konusunu daha geniş olarak ele alacagız
        bir sayfa acılırken ilk basta sayfanın içerisindeki bulunan elementlere göre bir
        yükleme süresine ihtiyac vardır veya bir weeblementin kullanılabilmesi için
        zamana ihtiyaç vardır.
        implicitlyWait bize sayfanın yüklenmesi ve sayfadaaki elementlere ılaşım için max
        bekleme sueyi belirleme imkenı saglar

        */




    }
}
