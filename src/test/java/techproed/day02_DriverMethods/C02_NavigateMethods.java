package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        // TECHPROEDUCATİON sayfasına gidelim

        driver.navigate().to("http://techproeducation.com"); //get metodu ile navıgate.to aynı işlemi yapar
        Thread.sleep(3000); //javada kodlarını bekletmek icin Thread.sleep kullanabiliriz

        //sonra AMAZON sayfasına gidelim

        driver.navigate().to("http://amazon.com");

        //amazon sayfasının basliginı yazdıralım

        System.out.println("AMAZON BASLİGİ : " + driver.getTitle());

        //techproeducation sayfasına geri donelim

        driver.navigate().back();

        //sayfa basligini yazdıralım

        System.out.println("techopro education basligi : " +  driver.getTitle());

        //amazon sayfasına tekrar gidip url i yazdıralım

        driver.navigate().forward();

        System.out.println("amazonun url : " + driver.getCurrentUrl());
        Thread.sleep(3000);

        //amazon sayfasındayken sayfayı yenıleyelım

        driver.navigate().refresh();
        Thread.sleep(3000);

        //sayfayı kapatalım
        driver.close();


    }
}
