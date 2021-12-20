package Selenium.insta.page_factory.Subscribe.PO;

import Selenium.decorator.ClickButtonElement;
import Selenium.insta.page_factory.login.PO.BasicPO;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class ProfilePO extends Basic1PO {

    @FindBy(xpath = "//*[@class=\"_5f5mN    -fzfL     _6VtSN     yZn4P   \"]")
    private ClickButtonElement userSubscribe;

    @FindBy(xpath = "//*[@class=\"_5f5mN    -fzfL     _6VtSN     yZn4P   \"]")
    private ClickButtonElement userUnsubscribe;

    @Override
    @Step("isSubscribed")
    public boolean isSubscribed() {
        return userSubscribe.waitForMeVisible(10000);
    }

    @Override
    @Step("isSubscribed")
    public boolean isUnsubscribed() {
        return userUnsubscribe.waitForMeVisible(10000);
    }



}
