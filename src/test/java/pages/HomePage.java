package pages;


import core.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.Log4Test;

import java.util.List;

public class HomePage extends TestBase {

    protected By searchString = By.className("header-search-input-text");
    List<WebElement> manufacturesList;
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

    public List<WebElement> findManufactures() {

        manufacturesList = webDriver.findElements(By.xpath(".//*[@id='head_banner_container']/div[4]/div/div/div[2]/div[3]/ul/li[2]/ul/li"));

        return manufacturesList;
    }


    public int loopThroughManufacturesList() {

        int count = 0;

        for (WebElement elem : manufacturesList) {


            count++;
        }
        return count;
    }

    public int clickAppleManufacture() {

        int count = 0;

        for (WebElement elem : manufacturesList) {

            if (elem.getText().equals("Apple")) {

                elem.click();
                count = 1;
            }
        }
        return count;
    }
}



