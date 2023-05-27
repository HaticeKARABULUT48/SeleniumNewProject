package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {

    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //amazon sayfasına gidelim

        driver.get("http://amazon.com");

        //sayfa baslıgının Amazon içerdigini test edelim

        String actualTitle= driver.getTitle();
        String expectedTitle = "Amazon";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("tested PASSED");
        }else System.out.println("test FAİLED");

        //url in http://www.amazon.com/ oldugunu test edelim

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com/";
        if(actualUrl.equals(expectedUrl)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED"+actualUrl);


        //sayfayı kapatalım

        driver.close(); // browser ı kapatır
        //driver.quit();-> Birden fazla browser varsa hepsini kapatır.



    }
}
