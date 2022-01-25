package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CategoriesBarPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement phones;
    WebElement laptops;
    WebElement monitors;

    public CategoriesBarPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getPhones() {
        return driver.findElement(By.linkText("Phones"));
    }

    public WebElement getLaptops() {
        return driver.findElement(By.linkText("Laptops"));
    }

    public WebElement getMonitors() {
        return driver.findElement(By.linkText("Monitors"));
    }

    //*******************************************

    public void clickPhones(){
        this.getPhones().click();
    }

    public void clickLaptops(){
        this.getLaptops().click();
    }

    public void clickMonitors(){
        this.getMonitors().click();
    }
}
