package pages;

import org.openqa.selenium.WebElement;
import utils.Log4Test;


public class SamsungGalaxyS5Page extends GeneralPage {


    protected WebElement productContent;

    public WebElement verifyProductContent() {

        Log4Test.info("Verify product content");

        return productContent = elementIsLocated(getLocator("productDescription"));

    }
}
