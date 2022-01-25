package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class PhonesPage {

    WebDriver driver;
    WebDriverWait wdwait;
    WebElement samsungS6;
    WebElement nokiaLumia;
    WebElement nexus;
    WebElement samsungS7;
    WebElement iphone;
    WebElement xperia;
    WebElement htc;
    ArrayList<WebElement> telefoni = new ArrayList<>();


    public PhonesPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getSamsungS6() {
        return driver.findElement(By.partialLinkText("Samsung galaxy s6"));
    }

    public WebElement getNokiaLumia() {
        return driver.findElement(By.linkText("Nokia lumia 1520"));
    }

    public WebElement getNexus() {
        return driver.findElement(By.linkText("Nexus 6"));
    }

    public WebElement getSamsungS7() {
        return driver.findElement(By.linkText("Samsung galaxy s7"));
    }

    public WebElement getIphone() {
        return driver.findElement(By.linkText("Iphone 6 32gb"));
    }

    public WebElement getXperia() {
        return driver.findElement(By.linkText("Sony xperia z5"));
    }

    public WebElement getHtc() {
        return driver.findElement(By.partialLinkText("HTC One M9"));
    }

    public ArrayList<WebElement> getTelefoni() {
        return telefoni;
    }

    //******************************************************

    public void listaPhones(){
        telefoni.add(samsungS6);
        telefoni.add(nokiaLumia);
        telefoni.add(nexus);
        telefoni.add(samsungS7);
        telefoni.add(iphone);
        telefoni.add(xperia);
        telefoni.add(htc);
    }

    public void clickSamsungS6(){
        this.getSamsungS6().click();
    }

    public void clickNokia(){
        this.getNokiaLumia().click();
    }

    public void clickNexus(){
        this.getNexus().click();
    }

    public void clickSamsungS7(){
        this.getSamsungS7().click();
    }

    public void clickIphone(){
        this.getIphone().click();
    }

    public void clickSonyXperia(){
        this.getXperia().click();
    }

    public void clickHtc(){
        this.getHtc().click();
    }

}
