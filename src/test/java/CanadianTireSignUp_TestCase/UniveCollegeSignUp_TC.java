package CanadianTireSignUp_TestCase;

import CanadianTireSignUp_PageObject.BabyRegistry_PO;
import CanadianTireSignUp_PageObject.UniveCollegeRegistry_PO;
import CommonPage.BaseTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class UniveCollegeSignUp_TC extends BaseTest {
    public UniveCollegeSignUp_TC(){}
    public UniveCollegeSignUp_TC(WebDriver passdriver){
        driver= passdriver;
    }

    @Test
    public void verifyUniverCollRegis_SignUp() throws IOException {
        extentTest = extentReports.createTest("Verify the University/College Registry SignUp");
        UniveCollegeRegistry_PO univeCollegeRegistry_po= new UniveCollegeRegistry_PO(driver);
        boolean univerReg= univeCollegeRegistry_po.UniverCollege_Registry();
        if (univerReg){
            extentTest.log(Status.PASS, "University/College Registry SignUp successful");
        }else {
            extentTest.log(Status.FAIL, "University/College Registry SignUp failed");
        }
    }
}
