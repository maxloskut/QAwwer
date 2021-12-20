package test_helper;

import Selenium.insta.paralel_run.BrowserFactory;
import org.testng.annotations.AfterTest;



public class BaseTest {

        @AfterTest
        void quitBrowser(){
                BrowserFactory.getDriver().quit();
                BrowserFactory.getDriver().close();
        }
}