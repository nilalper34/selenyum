package mehmethoca.day3_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Xpath {
    //  1- https://the-internet.herokuapp.com/add_remove_elements/" adresine git
    // 2- Add elementi butonuna bassınız
    // 3- Delete butonunun görünür olduğunu test edin
    // 4- Delete tusuna bassınız
    // 5- Delete butonunun gorunur olmadıgını test edin

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chorome.driver","src/reseources/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //  1- https://the-internet.herokuapp.com/add_remove_elements/" adresine git
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);

        // 2- Add elementi butonuna bassınız
             // 1.yol  WebElement  addButonu= driver.findElement(By.tagName("button"));
             // 2.yol  tagname tek oldugu için    WebElement  addButonu= driver.findElement(By.xpath("//button"));
            // 3.yol   WebElement  addButonu= driver.findElement(By.xpath("//button[text()='Add Element' ]"));
           // 4. yol  WebElement  addButonu= driver.findElement(By.xpath("//*[text()='Add Element' ]"));
          //5.yol
        WebElement  addButonu= driver.findElement(By.xpath("//button[@onclick='addElement()' ]"));
        addButonu.click();

        // 3- Delete butonunun görünür olduğunu test edin
        WebElement deleteButonu= driver.findElement(By.xpath("//button[@class='added-manually']"));

        if (deleteButonu.isDisplayed())
        {
    System.out.println("PASSED");
        }else System.out.println("FAİLED");


        // 5- Delete butonunun gorunur olmadıgını test edin

        /* eger butona bastıgımızda html kodundaki satırda siliniyorsa driver in o elemente ulasmasi mümkün
        olmayacagından varlıgını  ya da yoklugunu test etmemiz mümkün olmaz varolan bir element bu sekilde silindikten sonra locate etmeye calısırsak
      (bayat eskiden vardı) StaleElementReferenceException exception aliriz */

   driver.close();



    }
}
