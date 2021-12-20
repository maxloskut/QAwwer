package Selenium.insta.page_factory.SendMessage.PO;

import Selenium.decorator.CustomDecorator;
import Selenium.insta.paralel_run.BrowserFactory;
import org.openqa.selenium.support.PageFactory;

public abstract class Basic2PO {
    public Basic2PO() {
        PageFactory.initElements(new CustomDecorator(BrowserFactory.getDriver()), this);
    }


    public boolean isOpen() {
        //TODO
        return true;
    };


}
