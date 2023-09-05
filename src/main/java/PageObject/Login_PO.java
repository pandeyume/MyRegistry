package PageObject;

import CommonPage.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class Login_PO extends BaseClass {
    WebDriverWait wait;
    public Login_PO(WebDriver driver){
        super(driver);
    }

    //Methods
    public boolean verifyValidLogin() throws IOException {
        propertyLoadFiles();
        driver.get(prop.getProperty("BaseURL"));
        try{

            WebElement login= driver.findElement(By.cssSelector(prop.getProperty("Login")));
            login.click();

            WebElement txtemail= driver.findElement(By.cssSelector(prop.getProperty("txtEmail")));
            txtemail.sendKeys(prop.getProperty("Emailaddress"));

            WebElement txtpass= driver.findElement(By.cssSelector(prop.getProperty("txtPass")));
            txtpass.sendKeys(prop.getProperty("Pass"));

            WebElement btnlogin= driver.findElement(By.cssSelector(prop.getProperty("btnLogin")));
            btnlogin.click();
            Thread.sleep(4000);

            WebElement mygiftTab= driver.findElement(By.xpath("//div[@class=\"member_top_nav\"]//li[@class=\"menu_member\"]//a[@data-section=\"mygifts\"]"));
            Assert.assertTrue(mygiftTab.isDisplayed(), "My Gifts tab do not display");
            mygiftTab.click();
            Thread.sleep(2000);

            WebElement username= driver.findElement(By.cssSelector(prop.getProperty("wlcUsername")));
            Assert.assertTrue(username.isDisplayed(), "username do not display");
            Thread.sleep(2000);
            //username.click();
//
//            Thread.sleep(2000);
//            WebElement btnlogout= driver.findElement(By.cssSelector(prop.getProperty("btnLogout")));
//            btnlogout.click();

            JavascriptExecutor js= (JavascriptExecutor)driver;
            js.executeScript("window.open()");
            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
            driver.get(prop.getProperty("childURL"));

            WebElement logIn= driver.findElement(By.xpath(prop.getProperty("login")));
            logIn.sendKeys(prop.getProperty("email"));
            logIn.sendKeys(Keys.ENTER);
            Thread.sleep(2000);

            driver.switchTo().window(tabs.get(0));
            driver.navigate().refresh();

            return true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
