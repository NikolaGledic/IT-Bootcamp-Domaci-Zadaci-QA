package BasePagePackage;

import AllProducts.Product;
import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public CategoriesBarPage category;
    public PhonesPage phonesPage;
    public LaptopsPage laptopsPage;
    public MonitorPage monitorPage;
    public ProductPage productPage;
    public Product product;


    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        category = new CategoriesBarPage(driver, wdwait);
        phonesPage = new PhonesPage(driver, wdwait);
        laptopsPage = new LaptopsPage(driver, wdwait);
        monitorPage = new MonitorPage(driver, wdwait);
        productPage = new ProductPage(driver, wdwait);
    }

   /* @AfterClass
    public void tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }*/

}
