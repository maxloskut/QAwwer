package Selenium.insta.page_factory.Subscribe.PO;

import Selenium.decorator.CustomDecorator;
import Selenium.insta.paralel_run.BrowserFactory;
import org.openqa.selenium.support.PageFactory;

public abstract class Basic1PO {

    public Basic1PO() {
        PageFactory.initElements(new CustomDecorator(BrowserFactory.getDriver()),this);
    }


    public boolean isSubscribed(){
        //TODO
        return true;
    };
    public boolean isUnsubscribed(){
        //TODO
        return true;
    };
}
