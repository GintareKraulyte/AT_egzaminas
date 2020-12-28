package Setupas;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge_testNG {
    @Test
    public void testNGTest() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\WebDrivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.lt");
        Thread.sleep(5000);
        driver.quit();
    }
}
