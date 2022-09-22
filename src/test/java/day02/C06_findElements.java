package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C06_findElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/reseources/drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        //amozon sayfasına gidiniz
        driver.get("https://amozon.com");
        //amozon sayfasındaki tag'ların sayısını yazdırınız.
        List<WebElement> tag=driver.findElements(By.tagName("a"));
        System.out.println("a tag'in sayisi: "+tag.size());

        //input tag larini bulalim
        List<WebElement> tag1=driver.findElements(By.tagName("input"));
        System.out.println("input'un sayisi: "+tag.size());

        System.out.println(driver.findElement(By.xpath("(//*[@class='a-color-base headline truncate-2line'])[1]")).getText());













    }
}
