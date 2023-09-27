package CanadianTireSignUp_PageObject;

import CommonPage.BaseClass;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class WeddingRegistry_PO extends BaseClass {
    //private CharSequence emailID;

    public WeddingRegistry_PO(WebDriver driver){
        super(driver);
    }

    //Methods

//    public void buttonClick() throws IOException{
//        propertyLoadFiles();
//        try {
//            //Wait();
//            WebElement btnCreate = driver.findElement(By.xpath(prop.getProperty("btncreate")));
//            btnCreate.click();
//
////        WebDriverWait waitDrpdwn= new WebDriverWait(driver, Duration.ofSeconds(20));
//            WebElement registryTypedrpdown = driver.findElement(By.cssSelector(prop.getProperty("registryTypedrpdwn")));
//            registryTypedrpdown.click();
//
//            WebElement wedRegType = driver.findElement(By.xpath(prop.getProperty("weddingReg")));
//            wedRegType.click();
//            System.out.println("Registry type:\t" + wedRegType.getText());
//
////        WebDriverWait waitTerms= new WebDriverWait(driver, Duration.ofSeconds(20));
//            WebElement terms = driver.findElement(By.xpath(prop.getProperty("Terms")));
//            terms.click();
//
////        WebDriverWait waitNxt= new WebDriverWait(driver, Duration.ofSeconds(20));
//            WebElement Nxtbtn = driver.findElement(By.cssSelector(prop.getProperty("btnNext")));
//            Nxtbtn.click();
//
////        WebDriverWait wait1Sbmt= new WebDriverWait(driver, Duration.ofSeconds(20));
//            WebElement btnSubmit = driver.findElement(By.cssSelector(prop.getProperty("Submit")));
//            btnSubmit.click();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

    public boolean Wedding_Registry() throws IOException {
        propertyLoadFiles();
        randomEmail();
        Wait();

        try{
            WebElement btnCreate= driver.findElement(By.xpath(prop.getProperty("btncreate")));
            btnCreate.click();

            //WebDriverWait waitDrpdwn= new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement registryTypedrpdown= driver.findElement(By.cssSelector(prop.getProperty("registryTypedrpdwn")));
            registryTypedrpdown.click();

            //WebDriverWait waitregtyp= new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement wedRegType= driver.findElement(By.xpath(prop.getProperty("weddingReg")));
            wedRegType.click();
            System.out.println("Registry type:\t" +wedRegType.getText());

            //WebDriverWait waitDate= new WebDriverWait(driver, Duration.ofSeconds(20));
            String date= new SimpleDateFormat("dd/MM/yyyy").format(new Date());
            WebElement evntDte= driver.findElement(By.id(prop.getProperty("wedeventDate")));
            evntDte.sendKeys(date);
            System.out.println("Event Date:\t" +date);

            WebElement fname= driver.findElement(By.cssSelector(prop.getProperty("wedFname")));
            fname.sendKeys(prop.getProperty("FirstName"));

            WebElement lname= driver.findElement(By.cssSelector(prop.getProperty("wedLname")));
            lname.sendKeys(prop.getProperty("LastName"));

            final String randomEmail = randomEmail();
            WebElement email= driver.findElement(By.cssSelector(prop.getProperty("wedEmail")));
            //email.sendKeys(prop.getProperty("emailS"));
            email.sendKeys(randomEmail);

            WebElement pass= driver.findElement(By.cssSelector(prop.getProperty("wedPwd")));
            pass.sendKeys(prop.getProperty("pass"));

            WebElement terms= driver.findElement(By.xpath(prop.getProperty("Terms")));
            terms.click();

            WebElement Nxtbtn= driver.findElement(By.cssSelector(prop.getProperty("btnNext")));
            Nxtbtn.click();

            //WebDriverWait waitNxtbtn= new WebDriverWait(driver, Duration.ofSeconds(50));
            WebElement address1= driver.findElement(By.cssSelector(prop.getProperty("wedAddress1")));
            address1.clear();
            address1.sendKeys(prop.getProperty("address"));
            Thread.sleep(3000);
            address1.sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(3000);
            address1.sendKeys(Keys.ENTER);

            WebElement phone= driver.findElement(By.cssSelector(prop.getProperty("wedPhone")));
            phone.clear();
            phone.sendKeys(prop.getProperty("phone"));

            Thread.sleep(2000);
            WebElement btnSubmit= driver.findElement(By.cssSelector(prop.getProperty("Submit")));
            btnSubmit.click();

            //WebDriverWait waitFnsh= new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement signUpCompletepage= driver.findElement(By.xpath(prop.getProperty("wedSignupcompletePage")));
            WebElement title= driver.findElement(By.xpath(prop.getProperty("wedSignupcompletePage1")));
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