package Selenium.insta.page_factory.login.PO;

import Selenium.decorator.ClickButtonElement;
import Selenium.insta.page_factory.login.PO.BasicPO;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class HomePO extends BasicPO {

    @FindBy(xpath = "//*[@data-testid=\"user-avatar\"]")
    private ClickButtonElement userLogo;

    @Override
    @Step("isOpen")
    public boolean isOpen() {
        return userLogo.waitForMeVisible(10000);
    }


}
