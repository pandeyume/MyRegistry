package CommonPage;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.io.IO;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;

import static java.lang.Number.*;

public class BaseClass {
    public WebDriver driver;
    public BaseClass(WebDriver driver){
        this.driver=driver;
    }

    public static Properties prop= null;
    public static void propertyLoadFiles() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\MyRegistry_Project\\Common.properties");
        prop= new Properties();
        prop.load(fis);
    }

    public static String randomEmail() throws IOException{
        Random randomEmailGenerator= new Random();
        int randomInt= randomEmailGenerator.nextInt(1000);
        return "umesh"+randomInt+"@yopmail.com";
    }

    public void Wait() throws IOException{
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
    }
}
