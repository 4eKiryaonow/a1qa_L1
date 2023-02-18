package task2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import task2.utils.DataManager;
import task2.utils.JsonReader;
import task2.webdriver.WebDriverProvider;

public abstract class SeleniumBaseClass {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverProvider.getDriver();
        driver.manage().window().maximize();
        driver.navigate().to(DataManager.getURL());

    }

    @AfterMethod
    public void tearDown() {
        WebDriverProvider.closeDriver();
    }
}
