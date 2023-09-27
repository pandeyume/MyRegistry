package CanadianTireSignUp_TestCase;

import CanadianTireSignUp_PageObject.BabyRegistry_PO;
import CanadianTireSignUp_PageObject.OtherRegistry_PO;
import CommonPage.BaseTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class OtherSignUp_TC extends BaseTest {
    public OtherSignUp_TC(){}
    public OtherSignUp_TC(WebDriver passdriver){
        driver= passdriver;
    }

    @Test
    public void verifyOtherRegis_SignUp() throws IOException {
        extentTest = extentReports.createTest("Verify the Other Registry SignUp");
        OtherRegistry_PO otherRegistry_po= new OtherRegistry_PO(driver);
        boolean otherReg= otherRegistry_po.Other_Registry();
        if (otherReg){
            extentTest.log(Status.PASS, "Other Registry SignUp successful");
        }else {
            extentTest.log(Status.FAIL, "Other Registry SignUp failed");
        }
    }
}