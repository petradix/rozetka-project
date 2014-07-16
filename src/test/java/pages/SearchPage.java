package pages;

import org.openqa.selenium.WebElement;
import utils.Log4Test;

/**
 * Created by Walker on 7/26/14.
 */
public class SearchPage extends GeneralPage {

    protected WebElement searchLinkElem;

    public String verifyProductLink() {

        Log4Test.info("Verify product link");

        searchLinkElem = elementIsLocated(getLocator("searchProductLink"));

        return searchLinkElem.getText();

    }

    public void openProductLink() {

        Log4Test.info("Open product characteristics");

        searchLinkElem.click();
    }
}
