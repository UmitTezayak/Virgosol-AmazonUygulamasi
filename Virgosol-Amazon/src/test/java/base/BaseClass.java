package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.log4j.Logger;

import java.util.concurrent.TimeUnit;

import static costants.BaseCostants.URL_AMAZON;


public class BaseClass {
    public static WebDriver driver;
    public static Logger logger = Logger.getLogger(BaseClass.class);

    @Before
    public void firstPage() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get(URL_AMAZON);
    }

    @After
    public void closeDiver() {
        driver.close();
    }


}
