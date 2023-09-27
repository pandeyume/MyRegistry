package CanadianTireSignUp_TestCase;

import CanadianTireSignUp_PageObject.BabyRegistry_PO;
import CanadianTireSignUp_PageObject.GraduationRegistry_PO;
import CommonPage.BaseTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class GraduationSignUp_TC extends BaseTest {
 public GraduationSignUp_TC(){}
 public GraduationSignUp_TC(WebDriver passdriver){
     driver= passdriver;
 }
    @Test
    public void verifyGraduationRegis_SignUp() throws IOException {
        extentTest = extentReports.createTest("Verify the Graduation Registry SignUp");
        GraduationRegistry_PO graduationRegistry_po= new GraduationRegistry_PO(driver);
        boolean babyReg= graduationRegistry_po.Graduation_Registry();
        if (babyReg){
            extentTest.log(Status.PASS, "Baby Registry SignUp successful");
        }else {
            extentTest.log(Status.FAIL, "Baby Registry SignUp failed");
        }
    }
}
