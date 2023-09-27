package CanadianTireSignUp_TestCase;

import CanadianTireSignUp_PageObject.Housewarming_PO;
import CommonPage.BaseTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class HousewarmingSignUp_TC extends BaseTest {
    public HousewarmingSignUp_TC(){}
    public HousewarmingSignUp_TC(WebDriver passdriver){
        driver= passdriver;
    }

    @Test
    public void verifyHousewarmingRegis_SignUp() throws IOException {
        extentTest = extentReports.createTest("Verify the Housewarming Registry SignUp");
        Housewarming_PO housewarming_po= new Housewarming_PO(driver);
        boolean housewarmReg= housewarming_po.Housewarming_Registry();
        if (housewarmReg){
            extentTest.log(Status.PASS, "Housewarming SignUp successful");
        }else {
            extentTest.log(Status.FAIL, "Housewarming SignUp failed");
        }
    }
}
