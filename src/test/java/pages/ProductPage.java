package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ProductPage extends BasePage{

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    By addToCartButton = By.cssSelector("button[onclick=\"cart.add('36', '1');\"]");
    By mp3player = By.linkText("MP3 Players");
    By seeAllList = By.cssSelector("#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(8) > div > a");
    By categoryTittle = By.tagName("h2");
    By makeListView = By.id("list-view");

    public void hoverMP3PlayerLinkAndClickSeeAll(){
        Actions actions = new Actions(driver);
        WebElement mp3Player = driver.findElement(mp3player);
        actions.moveToElement(mp3Player);

        WebElement allMP3 = driver.findElement(seeAllList);
        actions.moveToElement(allMP3);
        actions.click().build().perform();
    }

    public void openRightCategory(){
        WebElement category = driver.findElement(categoryTittle);
        boolean mp3 = category.isDisplayed();
        if (mp3) {
            System.out.println("Atsidarė kategorija pavadinimu 'MP3 Player'");
            String categoryName = getText(categoryTittle);
            Assert.assertTrue(categoryName.contains("MP3 Players"), "Neatsidarė reikiama kategorija.");
        }
    }

    public void viewProductsAsList(){
        click(makeListView);
    }


    public void clickAddToCart() {
        click(addToCartButton);
    }
}
