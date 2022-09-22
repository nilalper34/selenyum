package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_ilkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/reseources/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        /*
        1- amazon a gidiniz
        2- baslık amazon mu
        3- url amozon içeriyor mu
        4-sayfayı kapatınız

         */
driver.manage().window().maximize();//sayfayı pencereleri yönet
     driver.get("https://www.amozon.com");//1
        String actualTitle= driver.getTitle();
        String istenenKelime="Amazon";
        if (actualTitle.contains(istenenKelime)){
            System.out.println("title testi PASSED");
        }else System.out.println("title testi FAILED");

        String actualURL= driver.getCurrentUrl();
        String arananKelime="Amazon";
        if (actualURL.contains(arananKelime)){
            System.out.println("url testi PASSED");
        }else System.out.println("url testi FAILED");

     driver.close();


    }
}
