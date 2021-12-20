package Selenium.insta.page_factory.Subscribe.BO;

import Selenium.insta.page_factory.Subscribe.PO.SubscribePO;
import io.qameta.allure.Step;

public class SubscribeBO {

    @Step("isOpen")
    public boolean subscribe() {

        SubscribePO subscribePO = new SubscribePO()
                .goToUserPage();

        return subscribePO.isOpen()
                &&
                subscribePO
                        .subscribe()
                        .isSubscribed();
    }
    @Step("isOpen")
    public boolean unsubscribe() {

        SubscribePO subscribePO = new SubscribePO()
                .goToUserPage();

        return subscribePO.isOpen()
                &&
                subscribePO
                        .unsubscribe()
                        .isUnsubscribed();
    }
}