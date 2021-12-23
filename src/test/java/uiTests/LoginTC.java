package uiTests;

import Selenium.insta.page_factory.login.BO.LoginBO;
import Selenium.insta.paralel_run.BrowserFactory;
import io.qameta.allure.Issue;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import test_helper.BaseTest;

@Test
public class LoginTC extends BaseTest {

    @DataProvider(parallel = true)
    public static Object[][] browserDataProvider() {
        return new Object[][]{
                {"chrome"}
                //,{"firefox"}
                //,{"Opera"}
                //,{"IE"}
                //,{"Safari"}
        };
    }

    //@Video

    @Test(dataProvider = "browserDataProvider")
    @Severity(SeverityLevel.CRITICAL)
    public void loginTest(String browserName) {
        BrowserFactory.initDriver(browserName);
        LoginBO loginBO = new LoginBO();

        //Step1
        Assert.assertTrue(loginBO.login(),"login Failed!");

    }
}
