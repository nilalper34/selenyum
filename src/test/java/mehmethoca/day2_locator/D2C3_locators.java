package mehmethoca.day2_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

       public class D2C3_locators {
          public static void main(String[] args) throws InterruptedException {

        // 1. Bir class olusturun: Locators
        //2.main method oludturun ve asagıdaki görevleri tamamlayın
        // a- http://a.testaddressbook.com adresine gidiniz
        //b-sign in butonuna basınız
        //c-email texbox,password textbox and signin button elementlerini locate ediniz
        // d-kullanıcı adı ve şifreyi asagıya girin ve oturum ac button u tıklayınız
        // d i. Username: testtechproed@gmail.com
        // d ii. password : Test1234!
        // e.Expected user id nin testtechproed@gmail.com oldugunu dogrulayın (verify)
        // f. "Addresses" ve "Sign Out" textlerinin görüntülendiğini (displayed) dogrulayin(verify)
        // 3.sayfada kactane link oldugunu bulun


System.setProperty("webdriver.chrome.driver","src/reseources/drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        // a- http://a.testaddressbook.com adresine gidiniz
        driver.get("http://a.testaddressbook.com");

           //b-sign in butonuna basınız
      //<a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>

        WebElement signInLinki= driver.findElement(By.linkText("Sign in"));
        signInLinki.click();
        Thread.sleep(2000);//internet hızından kodlarımız hızlı calıstıgından hata vermesin diye

        //c-email texbox,password textbox and signin button elementlerini locate ediniz

  //<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
        WebElement emailTextBox= driver.findElement(By.name("session[email]"));

        //<input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" id="session_password">
   WebElement passwordTextBox= driver.findElement(By.id("session_password"));

   //<input type="submit" name="commit" value="Sign in" class="btn btn-primary" data-test="submit" data-disable-with="Sign in">

        WebElement signInTextBox= driver.findElement(By.name("commit"));

        // d-kullanıcı adı ve şifreyi asagıya girin ve oturum ac button u tıklayınız
        // d i. Username: testtechproed@gmail.com
        // d ii. password : Test1234!

        emailTextBox.sendKeys("testtechproed@gmail.com");

         passwordTextBox.sendKeys("Test1234!");

          signInTextBox.click();


              // e.Expected user id nin testtechproed@gmail.com oldugunu dogrulayın (verify)

          //<span class="navbar-text" data-test="current-user">testtechproed@gmail.com</span> //mailin locali

             WebElement dogruKullanici=driver.findElement(By.className("navbar-text"));
             String userName="testtechproed@gmail.com";

             if (dogruKullanici.getText().equals(userName)){  //getText() web elementi stringle eşitlemek için yazdik.
                 System.out.println("dogru kullanici testi PASS");
             }else System.out.println("dogru kullanici testi FAILED");

        // f. "Addresses" ve "Sign Out" textlerinin görüntülendiğini (displayed) dogrulayin(verify)

        //<a class="nav-item nav-link" data-test="addresses" href="/addresses">Addresses</a>
        WebElement addressesLinki= driver.findElement(By.linkText("Addresses"));

         // <a class="nav-item nav-link" data-test="sign-out" rel="nofollow" data-method="delete" href="/sign_out">Sign out</a>
  WebElement signOutLinki=driver.findElement(By.linkText("Sign out"));

      if (addressesLinki.isDisplayed()){

      System.out.println("addresses linki görünüyor,test PASS");

      }else System.out.println("addresses linki görünmüyor,test FAilED");






        if (signOutLinki.isDisplayed()){
            System.out.println("signOutlinki linki görünüyor,test PASS");
        }else System.out.println("signOutLinki linki görünmüyor,test FAilED");



        // 3.sayfada kactane link oldugunu bulun


        //link tag larini bulalim
        //<a class="nav-item nav-link active" data-test="home" href="/">
        //          Home
        //          <span class="sr-only">(current)</span>
        //</a>

        List<WebElement> linkler=driver.findElements(By.tagName("a"));
        System.out.println("sitenin giriş sayfasındaki link sayisi:"+linkler.size());

        int sira=1;
        for (WebElement each:linkler
             ) {
            System.out.println(sira+" "+each.getText());
           sira++;
        }



    }
}
