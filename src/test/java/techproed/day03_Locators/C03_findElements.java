package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_findElements {
    public static void main(String[] args) {


        // https://www.amazon.com sayfasına gidiniz
       // Amazon sayfasında kac tane link olduğunu konsolda yazdırın
      // Linklerin isimlerini konsolda yazdırın
     // sayfayı kapatın


        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // https://www.amazon.com sayfasına gidiniz
        driver.get(" https://www.amazon.com");


        // Amazon sayfasında kac tane link olduğunu konsolda yazdırın
        List <WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayisi : " + linklerListesi.size());

        // Linklerin isimlerini konsolda yazdırın

        for (WebElement each: linklerListesi) {
            System.out.println(each.getText());

        }
        // sayfayı kapatın
        driver.close();
    }
}
