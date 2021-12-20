import Selenium.insta.page_factory.Subscribe.BO.SubscribeBO;
import Selenium.insta.page_factory.login.BO.LoginBO;
import Selenium.insta.paralel_run.BrowserFactory;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test_helper.BaseTest;

@Test
public class SubscribeTC extends BaseTest {

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
    public void SubscribeTest(String browserName) {
        BrowserFactory.initDriver(browserName);

        LoginBO loginBO = new LoginBO();

        //Step1
        Assert.assertTrue(loginBO.login(),"Login Failed!");

        SubscribeBO subscribeBO = new SubscribeBO();

        //Step2 Subscribe
        Assert.assertTrue(subscribeBO.subscribe(),"Subscribe Failed!");

        //Step2 Unsubscribe
        //Assert.assertTrue(subscribeBO.unsubscribe(),"Unsubscribe Failed!");
    }
}


