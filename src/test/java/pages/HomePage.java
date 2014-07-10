package pages;


import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.Log4Test;

public class HomePage extends TestBase {

    protected By searchString = By.className("header-search-input-text");

    private String URL = "http://rozetka.com.ua/";

    public void open() {

        webDriver.get(URL);
        Log4Test.info("Open WebUrl " + URL);

    }

    public boolean isOpened() {
        return webDriver.getCurrentUrl().equals(URL);
    }

    public void searchProduct(String productName) {
        Log4Test.info("Search product " + productName);
        webDriver.findElement(searchString).clear();
        webDriver.findElement(searchString).sendKeys(productName);
        webDriver.findElement(searchString).sendKeys(Keys.RETURN);
    }
}



