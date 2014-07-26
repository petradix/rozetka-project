package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import ui_tests.TestData;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: Sergii.Oliinyk
 * Date: 11/29/13
 * Time: 3:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestBase {

    protected static WebDriver webDriver;

    protected static WebDriverWait wait;

    @BeforeSuite
    public static void setUp() throws IOException

    {

       webDriver = WebDriverFactory.getWebDriver(TestData.BROWSER_NAME);

       wait = new WebDriverWait(webDriver, 30);

       webDriver.manage().window().maximize();

       webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

       webDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

       webDriver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);

    }


    @AfterSuite
    public void tearDown()

    {

        webDriver.quit();

    }

  }


