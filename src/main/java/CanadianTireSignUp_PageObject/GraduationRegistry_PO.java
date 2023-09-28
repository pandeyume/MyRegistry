package CanadianTireSignUp_PageObject;

import CommonPage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class GraduationRegistry_PO extends BaseClass {
    public GraduationRegistry_PO(WebDriver driver){super(driver);}

    //Methods
    public boolean Graduation_Registry() throws IOException {
        propertyLoadFiles();
        randomEmail();
        //Wait();
        driver.get(prop.getProperty("CT_BaseURL"));
        try{
            WebElement btnCreate= driver.findElement(By.xpath(prop.getProperty("btncreate")));
            btnCreate.click();

            WebElement registryTypedrpdown= driver.findElement(By.cssSelector(prop.getProperty("registryTypedrpdwn")));
            registryTypedrpdown.click();

            WebElement gradRegType= driver.findElement(By.xpath(prop.getProperty("grdReg")));
            gradRegType.click();
            System.out.println("Registry type:\t" +gradRegType.getText());

            String date= new SimpleDateFormat("dd/MM/yyyy").format(new Date());
            WebElement evntDte= driver.findElement(By.id(prop.getProperty("grdeventDate")));
            evntDte.sendKeys(date);
            System.out.println("Event Date:\t" +date);

            WebElement fname= driver.findElement(By.cssSelector(prop.getProperty("grdFname")));
            fname.sendKeys(prop.getProperty("FirstName"));

            WebElement lname= driver.findElement(By.cssSelector(prop.getProperty("grdLname")));
            lname.sendKeys(prop.getProperty("LastName"));

            final String randomEmail= randomEmail();
            WebElement email= driver.findElement(By.cssSelector(prop.getProperty("grdEmail")));
            email.sendKeys(randomEmail);

            WebElement pass= driver.findElement(By.cssSelector(prop.getProperty("grdPwd")));
            pass.sendKeys(prop.getProperty("pass"));

            WebElement terms= driver.findElement(By.xpath(prop.getProperty("Terms")));
            terms.click();

            WebElement Nxtbtn= driver.findElement(By.cssSelector(prop.getProperty("btnNext")));
            Nxtbtn.click();

            WebElement address1= driver.findElement(By.cssSelector(prop.getProperty("grdAddress1")));
            address1.clear();
            address1.sendKeys(prop.getProperty("address"));
            Thread.sleep(3000);
            address1.sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(3000);
            address1.sendKeys(Keys.ENTER);

            WebElement phone= driver.findElement(By.cssSelector(prop.getProperty("grdPhone")));
            phone.clear();
            phone.sendKeys(prop.getProperty("phone"));

            Thread.sleep(2000);
            WebElement btnSubmit= driver.findElement(By.cssSelector(prop.getProperty("Submit")));
            btnSubmit.click();

            WebDriverWait waitFnsh= new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement signUpCompletepage= driver.findElement(By.xpath(prop.getProperty("grdSignupcompletePage")));
            WebElement title= driver.findElement(By.xpath(prop.getProperty("grdSignupcompletePage1")));
            if (signUpCompletepage.isDisplayed() && title.isDisplayed()){
                System.out.println(signUpCompletepage.getText());
                System.out.println(title.getText());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}