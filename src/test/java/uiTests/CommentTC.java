package uiTests;

import Selenium.insta.page_factory.Comment.BO.CommentBO;
import Selenium.insta.page_factory.login.BO.LoginBO;
import Selenium.insta.paralel_run.BrowserFactory;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test_helper.BaseTest;

@Test
public class CommentTC extends BaseTest {

    @DataProvider(parallel = true)
    public static Object[][] browserDataProvider() {
        return new Object[][]{
                {"chrome"}
                //,{"firefox"}
                //,{"chrome"}
        };
    }

    @Test(dataProvider = "browserDataProvider")
    @Severity(SeverityLevel.CRITICAL)
    public void CommentTest(String browserName) {
        BrowserFactory.initDriver(browserName);

        LoginBO loginBO = new LoginBO();

        //Step1
        Assert.assertTrue(loginBO.login(),"login Failed!");

        CommentBO commentBO = new CommentBO();
        //Step2
        Assert.assertTrue(commentBO.comment(),"Comment Failed!");

    }
}


