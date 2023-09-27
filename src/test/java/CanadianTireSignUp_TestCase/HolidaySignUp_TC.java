package CanadianTireSignUp_TestCase;

import CanadianTireSignUp_PageObject.HolidayRegistry_PO;
import CommonPage.BaseTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class HolidaySignUp_TC extends BaseTest {
    public HolidaySignUp_TC(){}
    public HolidaySignUp_TC(WebDriver passdriver){
        driver= passdriver;
    }

    @Test
    public void verifyHolidayRegis_SignUp() throws IOException {
        extentTest = extentReports.createTest("Verify the Holiday Registry SignUp");
        HolidayRegistry_PO holidayRegistry_po= new HolidayRegistry_PO(driver);
        boolean holidayReg= holidayRegistry_po.Holiday_Registry();
        if (holidayReg){
            extentTest.log(Status.PASS, "Holiday Registry SignUp successful");
        }else {
            extentTest.log(Status.FAIL, "Holiday Registry SignUp failed");
        }
    }
}
