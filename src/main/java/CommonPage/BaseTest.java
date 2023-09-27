package CommonPage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    public static ExtentReports extentReports= null;
    public static ExtentTest extentTest= null;
    public static ExtentSparkReporter sparkReporter= null;
//    public BaseTest(WebDriver driver){
//        this.driver=driver;
//    }
   @Parameters({"url"})
    @BeforeTest
    public void Setup(String url){
        extentReports= new ExtentReports();
        sparkReporter= new ExtentSparkReporter(new File(System.getProperty("user.dir")+"\\Reports\\report.html"));
        extentReports.attachReporter(sparkReporter);
        extentReports.setSystemInfo("Environment", "Testing");

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();

//        System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver.exe");
//        driver= new ChromeDriver();

//        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "\\Browsers\\geckodriver.exe");
//        driver= new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS );
        driver.get(url);
    }

    @AfterTest
    public void Terminate(){
        driver.quit();
        System.out.println("Browser Closed Successfully");
    }

    @AfterMethod
    public static void ExtentReport(ITestResult result) {
        if (result.getStatus()==ITestResult.FAILURE){
            extentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Testcase Failed", ExtentColor.RED));
            //extentTest.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + "Testcase Failed", ExtentColor.RED));

//        } else if (result.getStatus()==ITestResult.SKIP) {
//            extentTest.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "Testcase Skipped", ExtentColor.ORANGE));
//            //extentTest.log(Status.SKIP, MarkupHelper.createLabel(result.getThrowable() + "Testcase Skipped", ExtentColor.ORANGE));

        }else if (result.getStatus()==ITestResult.SUCCESS){
            extentTest.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "Testcase Passed", ExtentColor.GREEN));
            //extentTest.log(Status.PASS, MarkupHelper.createLabel(result.getThrowable() + "Testcase Passed", ExtentColor.GREEN));
        }
        extentReports.flush();
        //Desktop.getDesktop().browse(new File("Report.html").toURI());
    }
    public static String getScreenCapture(WebDriver driver, String screenShot) throws IOException {
        String date= new SimpleDateFormat("dd-MM-yyyy-HH:MM:SS").format(new Date());
        TakesScreenshot ts= ((TakesScreenshot) driver);
        File SrcFile= ts.getScreenshotAs(OutputType.FILE);
        String destFile= System.getProperty("user.dir")+ "/Screenshots/" + screenShot + "_" + date + ".png";
        File file= new File(destFile);
        FileUtils.copyFile(SrcFile, file);

        return destFile;
    }
}