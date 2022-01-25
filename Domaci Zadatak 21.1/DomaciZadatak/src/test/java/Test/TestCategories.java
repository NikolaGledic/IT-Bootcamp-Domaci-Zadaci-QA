package Test;

import AllProducts.Product;
import BasePagePackage.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestCategories extends BasePage {

    ArrayList<Product> info = new ArrayList<>();
    Product proizvod;

    @BeforeMethod
    public void setUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to("https://www.demoblaze.com/index.html#");
    }

    public void phones() throws InterruptedException {
        category.clickPhones();
        Thread.sleep(2000);
    }

    public void laptops() throws InterruptedException {
        category.clickLaptops();
        Thread.sleep(2000);
    }

    public void monitors() throws InterruptedException {
        category.clickMonitors();
        Thread.sleep(2000);
    }

    public void dodavanjeUNiz(){
        productPage.nameText();
        productPage.priceText();
        productPage.descriptionText();
        proizvod = new Product(productPage.nameText(), productPage.priceText(), productPage.descriptionText(), productPage.price());
        info.add(proizvod);
    }

    @Test
    public void testjedan() throws InterruptedException {
        phones();
        /*phonesPage.listaPhones();
        for (WebElement telefon : phonesPage.getTelefoni()) {
            telefon.click();
            Thread.sleep(1500);
            dodavanjeUNiz();
            driver.navigate().back();
            Thread.sleep(1000);
        }*/


        System.out.println(proizvod.toString());




    }

}
