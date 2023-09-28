package CanadianTireSignUp_PageObject;

import CommonPage.BaseClass;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class OtherRegistry_PO extends BaseClass {
    public OtherRegistry_PO(WebDriver driver){super(driver);}

    //Methods
public boolean Other_Registry() throws IOException{
    propertyLoadFiles();
    randomEmail();
    //Wait();
    driver.get(prop.getProperty("CT_BaseURL"));
    try {

    }catch (Exception e){
        e.printStackTrace();
    }
return false;
}
}
