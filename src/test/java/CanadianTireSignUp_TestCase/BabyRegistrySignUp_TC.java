package CanadianTireSignUp_TestCase;

import CanadianTireSignUp_PageObject.BabyRegistry_PO;
import CommonPage.BaseTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class BabyRegistrySignUp_TC extends BaseTest {
    public BabyRegistrySignUp_TC(){}
    public BabyRegistrySignUp_TC(WebDriver passdriver){driver=passdriver;}

    @Test
    public void verifyBabyRegis_SignUp() throws IOException{
        extentTest = extentReports.createTest("Verify the Baby Registry SignUp");
        BabyRegistry_PO babyRegistry_po= new BabyRegistry_PO(driver);
        boolean babyReg= babyRegistry_po.Baby_Registry();
        if (babyReg){
            extentTest.log(Status.PASS, "Baby Registry SignUp successful");
        }else {
            extentTest.log(Status.FAIL, "Baby Registry SignUp failed");
        }
    }
}
