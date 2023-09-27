package CanadianTireSignUp_TestCase;

import CanadianTireSignUp_PageObject.WeddingRegistry_PO;
import CommonPage.BaseTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class WeddingRegistrySignUp_TC extends BaseTest {
    public WeddingRegistrySignUp_TC(){}
    public WeddingRegistrySignUp_TC(WebDriver passdriver){
        driver=passdriver;
    }

    @Test
    public void verifyWeddingRegis_SignUp () throws IOException {
        extentTest = extentReports.createTest("Verify the Wedding Registry SignUp");
        WeddingRegistry_PO weddingRegistry_po = new WeddingRegistry_PO(driver);
        boolean wedReg= weddingRegistry_po.Wedding_Registry();
        if (wedReg) {
            extentTest.log(Status.PASS, "Wedding Registry SignUp successful");
        }else {
            extentTest.log(Status.FAIL, "Wedding Registry SignUp failed");
        }
    }
}
