package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethods_implicitlyWait {

    public static void main(String[] args) {

        System.setProperty("chromeDrive","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        /*
        ***implicitlyWait(Duration.ofSeconds(20)) Sayfadaki webElementleri gorunur olana kadar(sayfada olusana kadar)
        maximum 20saniye bekler. Eger webElementler 2 saniyede olusursa 2 saniye bekler ve alt satira gecer.Fakat
        belirttigimiz maximum sure boyunca internetten yada sayfadan kaynakli olarak webElementler olusmazsa testimiz
        fail verir
        ***Thread.sleep() java kodlarını bizim belirttiğimiz süre kadar bekler. 30 saniye beklemesini belirtirsem
         30 saniye bekler ve alt satıra geçer.
         */

        //techproeducatıon sayfasına gidelim
        String techproUrl= "https://techproeducation.com";
        driver.get(techproUrl);

        //amazona gidelim
        String amazonUrl="https://amazon.com";
        driver.get(amazonUrl);

        //tecproya geri donelim
        driver.navigate().back();

        //sayfa baslıgının techpro içerdigını test edelim
        String actualTitle = driver.getTitle();
        String arananKelime="techpro";
        if (actualTitle.contains(arananKelime)){
            System.out.println("test PASSED");
        }else System.out.println("test FAİLED : " + actualTitle);

        //tekrar amazon sayfasına gidelim
        driver.navigate().forward();

        //sayfa baslıgının Amazon icerdigını test edelım
        if (driver.getTitle().contains("Amazon")){
            System.out.println( "test PASSED");
        }else System.out.println("test FAİLED" );

        //sayfayı kapatınız
        driver.close();
    }
}
