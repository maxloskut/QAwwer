package Selenium.insta.page_factory.login.PO;

import Selenium.decorator.CustomDecorator;
import Selenium.insta.paralel_run.BrowserFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

public abstract class BasicPO {

        public BasicPO() {
            PageFactory.initElements(new CustomDecorator(BrowserFactory.getDriver()),this);
        }

        public boolean isOpen(){
            //TODO
            return true;
        };



}
