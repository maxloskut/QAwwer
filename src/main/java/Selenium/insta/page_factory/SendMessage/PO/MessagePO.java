package Selenium.insta.page_factory.SendMessage.PO;

import Selenium.decorator.ClickButtonElement;
import Selenium.decorator.InputElement;
import Selenium.insta.paralel_run.BrowserFactory;
import Tread.PropertyUtil;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessagePO extends SkipNotficationPO {

    @FindBy(xpath = "//*[@style=\"height: 18px !important;\"]")
    private InputElement messageArea;


    @FindBy(xpath = "//div/button[text()]")
    private ClickButtonElement sendMessageButton;

    @Step("inputMessage")
    public MessagePO inputMessage(String text) {
        messageArea.sendKeys(text);
        return this;
    }


    @Step("sendMessage")
    public MessagePO sendMessage() {
        sendMessageButton.click();
        return new MessagePO();
    }


    @Step("goToUserPage")
    @Link("https://www.instagram.com/profile2")
    public MessagePO goToUserPage() {
        BrowserFactory.getDriver().get("https://www.instagram.com/"+ new PropertyUtil().getProperty("profile2"));
        return this;
    }

}