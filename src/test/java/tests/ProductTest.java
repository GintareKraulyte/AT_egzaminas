package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.ProductPage;

public class ProductTest extends BaseTest{

    @Test//(dataProvider = "addToSearch")
    public void Product() {

        ProductPage productPage = new ProductPage(driver);

        productPage.hoverMP3PlayerLinkAndClickSeeAll();

        productPage.openRightCategory();

        productPage.viewProductsAsList();

        //6.Iš data provider paimti produkto pavadinimą, surasti jį tarp produktų ir:

        //a.Paspausti mygtuką „Add to Cart“
        productPage.clickAddToCart();

        //b.Patikrinti, jog atsiranda žinutė „Success: You have added <Produkto pavadinimas> to your shopping cart!“


        //c.Patikrinti, jog produktas buvo įdėtas į krepšelį (viršuje, dešinėje kampe esantis mini krepšelis )

    }

    @DataProvider(name = "addToSearch")
    public static Object[][] addToCart() {
        return new Object[][]{
                {"iPod Nano"},
                {"iPod Touch"},
                {"iPod Shuffle"}
        };
    }
}
