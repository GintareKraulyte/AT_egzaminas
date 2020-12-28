package Setupas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
    @Test
    public void openFirefoxLocalWebDriver() throws InterruptedException{
        System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.lt");
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void openFireFoxWebDriverManager() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.lt");
        Thread.sleep(5000);
        driver.quit();
    }
}
