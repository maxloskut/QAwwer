package Selenium.insta.page_factory.Comment.PO;

import Selenium.decorator.CustomDecorator;
import Selenium.insta.paralel_run.BrowserFactory;
import org.openqa.selenium.support.PageFactory;

public  abstract class Basic4PO {
    public Basic4PO() {
        PageFactory.initElements(new CustomDecorator(BrowserFactory.getDriver()),this);
    }

    public boolean isOpen(){
        //TODO
        return true;
    };

}
