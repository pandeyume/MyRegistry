package TestCase;

import CommonPage.BaseTest;
import PageObject.Login_PO;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
public class Login_TC extends BaseTest {
    public Login_TC(){}
    public Login_TC(WebDriver passdriver){
        driver=passdriver;
    }
    @Test
    public void verifyLogin() throws IOException{
        extentTest = extentReports.createTest("Verify the Login page");
        Login_PO loginPo= new Login_PO(driver);
        loginPo.verifyValidLogin();
//        if (result){
//            extentTest.log(Status.PASS, "Login successful");
//        }else {
//            extentTest.log(Status.FAIL, "Login failed");
//        }
    }
}
