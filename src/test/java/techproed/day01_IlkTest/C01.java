package techproed.day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {
    public static void main(String[] args) {

System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
//java uygulamalarında system özelliklerini ayarlamak için setProperty methodu ile kullanırız
// setProperty metodu ile classımızın driver ın fiziki yolunu belirtırız
        System.out.println(System.getProperty("chromeDriver"));

        //getProperty ile key degerini girerek value ulasabilirim

WebDriver driver= new ChromeDriver();

driver.get("http://www.techproeducation.com");

    }
}

