package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaptopsPage {

    WebDriver driver;
    WebDriverWait wdwait;
    WebElement sonyVaioI5;
    WebElement sonyVaioI7;
    WebElement macBookAir;
    WebElement dellI7;
    WebElement dell2017;
    WebElement macBookPro;

    public LaptopsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getSonyVaioI5() {
        return driver.findElement(By.linkText("Sony vaio i5"));
    }

    public WebElement getSonyVaioI7() {
        return driver.findElement(By.linkText("Sony vaio i7"));
    }

    public WebElement getMacBookAir() {
        return driver.findElement(By.linkText("MacBook air"));
    }

    public WebElement getDellI7() {
        return driver.findElement(By.linkText("Dell i7 8gb"));
    }

    public WebElement getDell2017() {
        return driver.findElement(By.linkText("2017 Dell 15.6 Inch"));
    }

    public WebElement getMacBookPro() {
        return driver.findElement(By.linkText("MacBook Pro"));
    }

    //************************************************************

    public void clickSonyi5(){
        this.getSonyVaioI5().click();
    }

    public void clickSonyi7(){
        this.getSonyVaioI7().click();
    }

    public void clickMacAir(){
        this.getMacBookAir().click();
    }

    public void clickDelli7(){
        this.getDellI7().click();
    }

    public void clickDell2017(){
        this.getDell2017().click();
    }

    public void clickMacPro(){
        this.getMacBookPro().click();
    }


}
