package Selenium.insta.page_factory.SendMessage.PO;

import Selenium.insta.page_factory.SendMessage.BO.MessageBO;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SkipNotficationPO extends UserProfilePO {

    @FindBy(xpath = "")
    private WebElement skipN;


    @Step("skip")
    public MessagePO skipNt() {
        skipN.click();
        isOpen();
        return new MessagePO();
    }


}
