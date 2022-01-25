package PredavanjeDva;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ZadatakTri {

    //Zadatak 3 - Ulogovati se na sajt https://demoqa.com/ preko kolacica, izlogovati se i asertovati da je korisnik izlogovan

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.navigate().to("https://demoqa.com/login");
        //wdwait.until()
        Cookie kolacicUser = new Cookie("userName", "niko123");
        Cookie kolacicID = new Cookie("userID", "f1af36d4-84b5-4e3c-b43e-508805847d9f");
        Cookie kolacicToken = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9." +
                "eyJ1c2VyTmFtZSI6Im5pa28xMjMiLCJwYXNzd29yZCI6IkFhMTIzIUJiMzIxIiwiaWF0IjoxNjQyMjU5MDExfQ.G0jfsBKPG6A8LF75EU40EuCZ5XPJgckgi-eo8aVSk0Y");
        Cookie kolacicExpires = new Cookie("expires", "2022-01-22T15%3A03%3A31.232Z");
        driver.manage().addCookie(kolacicUser);
        driver.manage().addCookie(kolacicID);
        driver.manage().addCookie(kolacicToken);
        driver.manage().addCookie(kolacicExpires);
        driver.navigate().refresh();

        wdwait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
        driver.findElement(By.id("submit")).click();

        wdwait.until(ExpectedConditions.elementToBeClickable(By.id("newUser")));

        WebElement userName = driver.findElement(By.id("userName"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement newUserButton = driver.findElement(By.id("newUser"));
        WebElement loginButton = driver.findElement(By.id("login"));

        Assert.assertTrue(userName.isDisplayed());
        Assert.assertTrue(password.isDisplayed());
        Assert.assertTrue(newUserButton.isDisplayed());
        Assert.assertTrue(loginButton.isDisplayed());


        driver.quit();



    }

}
