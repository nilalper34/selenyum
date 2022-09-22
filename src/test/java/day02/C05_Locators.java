package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_Locators {
    public static void main(String[] args) {
        System.setProperty("webdrivr.chromedriver","src/reseources/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");
        //amozonda nutella arat
      WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
      aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);


     WebElement arama= driver.findElement(By.name("field-keywords"));
     arama.sendKeys("Nutella"+Keys.ENTER);

        // id uniqe olduğu bu sorunsuz çalışır

        //WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
        //aramaKutusu.sendKeys("Nutella"+ Keys.ENTER); // uniqe olduğu için sorunsuz çalışır
        //WebElement aramaKutusu = driver.findElement(By.className("nav-search-field "));

        /*
        Bu locatar çalismadı
        Locatar alırken gözümüzden kaçan detaylar olabilir
        aldığımız bir locatar çalışmazsa alternatif locatorlar denemeliyiz
         */

        driver.findElement(By.partialLinkText("oducts on Amazon")).click(); // a tag'ındaki link isminden istediğimiz bir parçayla locate edebiliriz
        driver.findElement(By.linkText("Sell products on Amazon")).click();





    }

}
