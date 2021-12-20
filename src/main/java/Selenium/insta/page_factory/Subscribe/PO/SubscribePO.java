package Selenium.insta.page_factory.Subscribe.PO;

import Selenium.decorator.ClickButtonElement;
import Selenium.insta.page_factory.BasicPO;
import Selenium.insta.paralel_run.BrowserFactory;
import Tread.PropertyUtil;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;


public class SubscribePO extends BasicPO {

    @FindBy(xpath = "//*[@class=\"_5f5mN       jIbKX  _6VtSN     yZn4P   \"]")
    private ClickButtonElement subscribeButton;

    @FindBy(xpath = "//*[@class=\"_5f5mN    -fzfL     _6VtSN     yZn4P   \"]")
    private ClickButtonElement unsubscribeButton1;


    @FindBy(xpath = "//*[@class=\"aOOlW -Cab_   \"]")
    private ClickButtonElement unsubscribeButton2;


    @Step("subscribe")
    public ProfilePO subscribe() {
        subscribeButton.click();
        return new ProfilePO();
    }
    @Step("unsubscribe")
    public ProfilePO unsubscribe() {
        unsubscribeButton1.click();
        unsubscribeButton2.click();
        return new ProfilePO();
    }

    @Step("goTouserPage")
    @Link("https://www.instagram.com/Profile/")
    public SubscribePO goToUserPage() {
        BrowserFactory.getDriver().get("https://www.instagram.com/"+ new PropertyUtil().getProperty("profile1"));
        return this;
    }
}

