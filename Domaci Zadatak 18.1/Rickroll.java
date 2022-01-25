package PredavanjeTri;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomaciZadatak {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.youtube.com/");
        Thread.sleep(2000);
        driver.findElement(By.name("search_query")).sendKeys("rick astley");
        Thread.sleep(1000);
        driver.findElement(By.id("search-icon-legacy")).click();
        Thread.sleep(2000);

        driver.findElement(By.partialLinkText("Rick Astley - Never Gonna Give You Up (Official Music Video)")).click();

        driver.close();
    }
}
