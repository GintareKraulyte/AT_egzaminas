package Setupas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chrome_JUnit {
    @Test
    public void openChromeLocalWebDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        System.out.println("Testas prasidejo.");
        driver.get("https://www.google.lt");
        Thread.sleep(5000);
        System.out.println("Testas baigesi.");
        driver.quit();
    }

    @org.testng.annotations.Test
    public void openChromeWebDriverManager() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        System.out.println("Testas prasidejo.");
        driver.get("http://www.google.lt");
        Thread.sleep(5000);
        System.out.println("Testas baigesi.");

        driver.quit();
    }
}
