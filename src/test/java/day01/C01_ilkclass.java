package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkclass {
    public static  void main(String[] args) {
        /*
        en temel haliyle bir otomasyon yapmak için class ımıza otomasyon için gerekli olan webdriver in
        yerin göstermemiz gerekir bunun için java kütüphanesinden system.setproperty() methodunu kullanırız.methodun içine
        ilk olarak driver i yazarız.ikinci olarak fiziki yolunu kopyalarız.

         */
        System.setProperty("webdriver.chrome.driver","src/reseources/drivers/chromedriver_win32/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.amozon.com");
      //kaynak kodların içinde "Gateway" kelimesinin oldugunu test ediniz

        System.out.println(driver.getPageSource());
        String istenenKelime="Gateway";

        if (driver.getPageSource().contains(istenenKelime)){
            System.out.println("passed");
        }else System.out.println("field");


    }
}
