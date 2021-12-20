package Selenium.insta.page_factory.SendMessage.PO;

import Selenium.decorator.ClickButtonElement;
import Selenium.insta.page_factory.login.PO.HomePO;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserProfilePO  extends  Basic2PO{

    @FindBy(xpath = "//*[@data-testid=\"user-avatar\"]")
    private ClickButtonElement userLogo;

    @FindBy(xpath = "//*[@class=\"sqdOP  L3NKy    _8A5w5    \"]")
    private ClickButtonElement messagesButton;



    @Step("goToMessage")
    public SkipNotficationPO goToMessage() {
        messagesButton.click();
        return new SkipNotficationPO();
    }

    @Override
    @Step("isOpen")
    public boolean isOpen() {
        return userLogo.waitForMeVisible(10000);
    }




}
