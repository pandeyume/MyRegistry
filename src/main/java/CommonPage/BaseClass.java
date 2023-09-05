package CommonPage;

import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

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
}
