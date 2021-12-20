package Selenium.insta.page_factory.SendMessage.BO;

import Selenium.insta.page_factory.SendMessage.PO.MessagePO;
import Tread.PropertyUtil;
import io.qameta.allure.Step;

public class MessageBO {

    @Step("isOpen")
    public boolean sendMessage() {
        MessagePO messagePO = new MessagePO()
                .goToUserPage();

        return messagePO.isOpen()
                &&
                messagePO
                        .goToMessage()
                        .skipNt()
                        .inputMessage((String) new PropertyUtil().getProperty("text"))
                        .sendMessage()
                        .isOpen();

    }
}
