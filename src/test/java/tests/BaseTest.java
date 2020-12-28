package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--ignore-certificate-errors");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);

        System.out.println("Testas prasidėjo");
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Testas baigėsi.");
        driver.quit();
    }
}
