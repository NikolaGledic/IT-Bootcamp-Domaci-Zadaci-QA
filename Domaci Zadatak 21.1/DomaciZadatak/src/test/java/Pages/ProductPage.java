package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wdwait;
    WebElement addToCartButton;
    WebElement name;
    WebElement price;
    WebElement description;

    public ProductPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getAddToCartButton() {
        return driver.findElement(By.linkText("Add to cart"));
    }

    public WebElement getName() {
        return driver.findElement(By.className("name"));
    }

    public WebElement getPrice() {
        return driver.findElement(By.className("price-container"));
    }

    public WebElement getDescription() {
        return driver.findElement(By.id("more-information"));
    }

    //*********************************************************

    public void clickAddToCart(){
        this.getAddToCartButton().click();
    }

    public String nameText(){
        return getName().getText();
    }

    public String priceText(){
        String price = getPrice().getText().split("\\s+")[0];
        return  price;
    }

    public String descriptionText(){
        return getDescription().getText().replaceFirst("Product description", "");
    }

    public int price(){
        String priceForParse = priceText().substring(1);
        int calcPrice = Integer.parseInt(priceForParse);
        return calcPrice;
    }

}
