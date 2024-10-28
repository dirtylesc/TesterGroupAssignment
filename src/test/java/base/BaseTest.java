package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected LoginPage loginPage;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        driver.manage().window().maximize();

        loginPage = new LoginPage(driver);

//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.quit();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    public static void main(String[] args) {
        BaseTest test = new BaseTest();
        test.setUp();
    }
}