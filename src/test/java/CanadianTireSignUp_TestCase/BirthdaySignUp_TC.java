package CanadianTireSignUp_TestCase;

import CanadianTireSignUp_PageObject.BirthdayRegistry_PO;
import CommonPage.BaseTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class BirthdaySignUp_TC extends BaseTest {
    public BirthdaySignUp_TC(){}
    public BirthdaySignUp_TC(WebDriver passdriver){
        driver= passdriver;
    }

    @Test
    public void verifyBirthdayRegis_SignUp() throws IOException {
        extentTest = extentReports.createTest("Verify the Birthday Registry SignUp");
        BirthdayRegistry_PO birthdayRegistry_po= new BirthdayRegistry_PO(driver);
        boolean birthReg= birthdayRegistry_po.Birthday_Registry();
        if (birthReg){
            extentTest.log(Status.PASS, "Birthday Registry SignUp successful");
        }else {
            extentTest.log(Status.FAIL, "Birthday Registry SignUp failed");
        }
    }
}
