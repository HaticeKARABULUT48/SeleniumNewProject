package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chromeDrive","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //browserın konumunu yazdıralım
        System.out.println("sayfanin konumu : "+ driver.manage().window().getPosition());

        //browserın boyutlarını yazdıralım
        System.out.println("sayfanin boyutu : "+ driver.manage().window().getSize());

        //browser ı maximize yapalım
        driver.manage().window().maximize();
        /*
    Bir web sitesine gittiğimizde browser default olarak bir boyutta gelir. Ve açılan browser'daki
    webElementlere browser maximize olmadığı için ulaşamayabiliriz. Dolayısıyla browser'ı açtıktan sonra
    maximize yaparsak driver bütün webelementleri görür ve rahatlikla müdehale edebilir. Bu yüzden
    browser'ı açtıktan sonra ilk olarak driver.manage().window().maximize(); yapmamız bizim webelementlere
    ulaşmada işimizi kolaylaştırır. Böylelikle fail almamış oluruz
 */

        //techproeducatıon sayfasına gidelim
        driver.get("https://techproeducation.com");

        //browserın konumunu yazdıralım
        System.out.println("sayfanin son konumu :" + driver.manage().window().getPosition());

        //browserın boyutlarını yazdıralım
        System.out.println("sayfanin son boyutu :" + driver.manage().window().getSize());
        Thread.sleep(3000);

        //sayfayı minimize yapalım
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //sayfayı fullscreen yapalım
        driver.manage().window().fullscreen();

        //istedigimiz konuma getirir
        driver.manage().window().setPosition(new Point(50,50));

        //istedigimiz boyuta getirir
        driver.manage().window().setSize(new Dimension(600,600));

        //sayfayı kapatınız
        driver.close();


    }
}
