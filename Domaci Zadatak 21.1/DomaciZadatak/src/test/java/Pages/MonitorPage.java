package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MonitorPage {

    WebDriver driver;
    WebDriverWait wdwait;
    WebElement apple;
    WebElement assus;

    public MonitorPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getApple() {
        return driver.findElement(By.linkText("Apple monitor 24"));
    }

    public WebElement getAssus() {
        return driver.findElement(By.linkText("ASUS Full HD"));
    }

    //******************************************************

    public void clickApple(){
        this.getApple().click();
    }

    public void clickAssus(){
        this.getAssus().click();
    }
}
