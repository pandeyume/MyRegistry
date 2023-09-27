package CanadianTireSignUp_TestCase;

import CanadianTireSignUp_PageObject.BabyRegistry_PO;
import CanadianTireSignUp_PageObject.FirstCarRegistry_PO;
import CommonPage.BaseTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class FirstCarSignUp_TC extends BaseTest {
    public FirstCarSignUp_TC(){}
    public FirstCarSignUp_TC(WebDriver passdriver){
        driver= passdriver;
    }

    @Test
    public void verifyFirstCarRegis_SignUp() throws IOException {
        extentTest = extentReports.createTest("Verify the Firstcar Registry SignUp");
        FirstCarRegistry_PO firstCarRegistry_po= new FirstCarRegistry_PO(driver);
        boolean frstcarReg= firstCarRegistry_po.Firstcar_Registry();
        if (frstcarReg){
            extentTest.log(Status.PASS, "Firstcar Registry SignUp successful");
        }else {
            extentTest.log(Status.FAIL, "Firstcar Registry SignUp failed");
        }
    }
}