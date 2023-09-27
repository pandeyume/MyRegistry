package CanadianTireSignUp_TestCase;

import CanadianTireSignUp_PageObject.*;
import CommonPage.BaseTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class RegistrySignUp_TC extends BaseTest {
    public RegistrySignUp_TC(){}
    public RegistrySignUp_TC(WebDriver passdriver){
        driver= passdriver;
    }

//    @Test (priority = 1, description = "Create a Wedding Reqistry")
//    public void verifyWeddingRegis_SignUp () throws IOException {
//        extentTest = extentReports.createTest("Verify the Wedding Registry SignUp");
//        WeddingRegistry_PO weddingRegistry_po = new WeddingRegistry_PO(driver);
//        boolean wedReg= weddingRegistry_po.Wedding_Registry();
//        if (wedReg) {
//            extentTest.log(Status.PASS, "Wedding Registry created successful");
//        }else {
//            extentTest.log(Status.FAIL, "Wedding Registry created failed");
//        }
//    }

//    @Test (priority = 2, description = "Create a Baby Reqistry")
//    public void verifyBabyRegis_SignUp() throws IOException{
//        extentTest = extentReports.createTest("Verify the Baby Registry SignUp");
//        BabyRegistry_PO babyRegistry_po= new BabyRegistry_PO(driver);
//        boolean babyReg= babyRegistry_po.Baby_Registry();
//        if (babyReg){
//            extentTest.log(Status.PASS, "Baby Registry created successful");
//        }else {
//            extentTest.log(Status.FAIL, "Baby Registry SignUp failed");
//        }
//    }

    @Test (priority = 3, description = "Create a Housewarming Reqistry")
    public void verifyHousewarmingRegis_SignUp() throws IOException{
        extentTest = extentReports.createTest("Verify the Housewarming Registry SignUp");
        Housewarming_PO housewarming_po= new Housewarming_PO(driver);
        boolean HouseReg= housewarming_po.Housewarming_Registry();
        if (HouseReg){
            extentTest.log(Status.PASS, "Housewarming Registry created successful");
        }else {
            extentTest.log(Status.FAIL, "Housewarming Registry SignUp failed");
        }
    }

    @Test (priority = 4, description = "Create a Birthday Reqistry")
    public void verifyBirthdayRegis_SignUp() throws IOException{
        extentTest = extentReports.createTest("Verify the Birthday Registry SignUp");
        BirthdayRegistry_PO birthdayRegistry_po= new BirthdayRegistry_PO(driver);
        boolean BdayReg= birthdayRegistry_po.Birthday_Registry();
        if (BdayReg){
            extentTest.log(Status.PASS, "Birthday Registry created successful");
        }else {
            extentTest.log(Status.FAIL, "Birthday Registry SignUp failed");
        }
    }

    @Test (priority = 5, description = "Create a Holiday Reqistry")
    public void verifyHolidayRegis_SignUp() throws IOException{
        extentTest = extentReports.createTest("Verify the Holiday Registry SignUp");
        HolidayRegistry_PO holidayRegistry_po= new HolidayRegistry_PO(driver);
        boolean HolidayReg= holidayRegistry_po.Holiday_Registry();
        if (HolidayReg){
            extentTest.log(Status.PASS, "Holiday Registry created successful");
        }else {
            extentTest.log(Status.FAIL, "Holiday Registry SignUp failed");
        }
    }

    @Test (priority = 6, description = "Create a Graduation Reqistry")
    public void verifyGraduationRegis_SignUp() throws IOException{
        extentTest = extentReports.createTest("Verify the Graduation Registry SignUp");
        GraduationRegistry_PO graduationRegistry_po= new GraduationRegistry_PO(driver);
        boolean GrdReg= graduationRegistry_po.Graduation_Registry();
        if (GrdReg){
            extentTest.log(Status.PASS, "Graduation Registry created successful");
        }else {
            extentTest.log(Status.FAIL, "Graduation Registry SignUp failed");
        }
    }

    @Test (priority = 7, description = "Create a University/College Reqistry")
    public void verifyUniverCollegeRegis_SignUp() throws IOException{
        extentTest = extentReports.createTest("Verify the University/College Registry SignUp");
        UniveCollegeRegistry_PO univeCollegeRegistry_po= new UniveCollegeRegistry_PO(driver);
        boolean UniReg= univeCollegeRegistry_po.UniverCollege_Registry();
        if (UniReg){
            extentTest.log(Status.PASS, "University/College Registry created successful");
        }else {
            extentTest.log(Status.FAIL, "University/College Registry SignUp failed");
        }
    }

    @Test (priority = 8, description = "Create a First Car Reqistry")
    public void verifyFirstCarRegis_SignUp() throws IOException{
        extentTest = extentReports.createTest("Verify the First Car Registry SignUp");
        FirstCarRegistry_PO firstCarRegistry_po= new FirstCarRegistry_PO(driver);
        boolean FrstCarReg= firstCarRegistry_po.Firstcar_Registry();
        if (FrstCarReg){
            extentTest.log(Status.PASS, "First Car Registry created successful");
        }else {
            extentTest.log(Status.FAIL, "First Car Registry SignUp failed");
        }
    }
}
