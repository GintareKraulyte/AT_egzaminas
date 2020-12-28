package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) { super(driver); }

    By myAccount = By.cssSelector("a[title='My Account']");


    public void openMyAccountLink(){
        driver.findElement(myAccount).click();
    }

    public void loginToMyAccount(){
        driver.findElement(By.cssSelector("a[href='https://demo.opencart.com/index.php?route=account/login']")).click();
    }
}
