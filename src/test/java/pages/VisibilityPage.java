package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class VisibilityPage extends BasePage{
    public VisibilityPage(WebDriver driver) {
        super(driver);
    }

    String errorWarning = "Warning: No match for E-Mail Address and/or Password.";
    By newCustomer = By.cssSelector("div[class='well']");
    By returningCustomer = By.cssSelector(".col-sm-6:nth-child(2) .well");
    By lobinButton = By.cssSelector("input[type='submit']");
    By email = By.name("email");
    By password = By.name("password");
    By errorLine = By.cssSelector("div[class='alert alert-danger alert-dismissible']");

    public void newCustomerBlock(){
        WebElement newCustomerBlock = driver.findElement(newCustomer);
        boolean isFirstBlock = newCustomerBlock.isDisplayed();
        if (isFirstBlock) {
            System.out.println("Yra matomas „New customer“ blokas.");
        }else {
            System.out.println("'New customer' blokas nematomas.");
        }
    }

    public void returningCustomerBlock(){
        WebElement returningCustomerBl = driver.findElement(returningCustomer);
        boolean isSecondBlock = returningCustomerBl.isDisplayed();
        if (isSecondBlock) {
            System.out.println("Yra matomas „Returning customer“ blokas.");
            //5.Suvesti blogus duomenis į email / password
            enterText(email, "test@test.com");
            enterText(password, "test");
            //6.Paspausti Login
            click(lobinButton);
        }else {
            System.out.println("'Returning customer' blokas.");
        }
    }

    public void showingError(){
        WebElement error = driver.findElement(errorLine);
        boolean isErrorWords = error.isDisplayed();
        if (isErrorWords) {
            System.out.println("Atsirado error eilutė, kurioje yra tekstas: " + errorWarning);
            String bodyText = driver.findElement(By.cssSelector("div[class='alert alert-danger alert-dismissible']")).getText();
            Assert.assertTrue(bodyText.contains(errorWarning), "Error'as neturi teksto " + errorWarning);
        }
    }
}
