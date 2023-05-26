package techproed.day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        //******getTitle()******** metodu icinde bulunan sayfanın basligini String olarak getirir

        //********getCurrentUrl()******** metodu gidilen sayfanın url ni verir

        //********getPageSource()******* icinde olunan sayfanın kaynak kodlarını String olarak getirir

        //********getWindowHandle()******* icinde olunan sayfa veya tablarin-yeni sekme- handle degerini(hashkod)  getirir
        //                                 bu handle degeri ile sayfalar arasi geciş icin kullanırız
        //********getWindowHandles()********* coklu pencere


        System.setProperty("cromeDriver","src/resources/drivers/chromedriver.exe");

WebDriver driver= new ChromeDriver();

driver.get("http://amazon.com");
System.out.println("AMAZONUN SAYFA BASLİGİ : " + driver.getTitle());
System.out.println("AMAZONUN ACTUAL URL : " + driver.getCurrentUrl());
String amazonWindowHandle= driver.getWindowHandle();
        System.out.println("AMAZON WİNDOW HANDLE DEGERİ : " + amazonWindowHandle);


driver.get("http://techproeducation.com");
System.out.println("Techproeducation sayfa basligi :" + driver.getTitle());
System.out.println("TECPROED  ACTUAL URL :" + driver.getCurrentUrl());
// System.out.println("" + driver.getPageSource()); bilerek yoruma aldık kaynak kodları cok uzun oldugu icin
        System.out.println(" TECHPROED WİNDOW HANDLE DEGERİ :" + driver.getWindowHandle());


    }
}
