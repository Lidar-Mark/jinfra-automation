import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestNG {
    WebDriver driver;
    Actions actions;
    WebDriverWait waitDriver;

    @BeforeClass
    public void beforeC() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @BeforeMethod
    public void beforeM() {
        driver.get("https://www.timeanddate.com/");

    }

    @Test
    public void testOne() {

    }

    @AfterMethod
    public void afterM() {

    }

    @AfterClass
    public void afterC() {

    }

}
