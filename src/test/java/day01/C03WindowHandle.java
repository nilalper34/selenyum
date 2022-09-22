package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/reseources/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://amozon.com");
        System.out.println(driver.getWindowHandle()); //farklı pencerelerde gezinebilmek için

    }
}
