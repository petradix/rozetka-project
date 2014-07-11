package pages;


import core.TestBase;
import org.openqa.selenium.By;
import utils.Log4Test;

public class HomePage extends TestBase {

    protected By searchField = By.className("header-search-input-text");

    protected By searchButton = By.className("btn-link-i");

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
        webDriver.findElement(searchField).clear();
        webDriver.findElement(searchField).sendKeys(productName);
        webDriver.findElement(searchButton).click();
    }
}



