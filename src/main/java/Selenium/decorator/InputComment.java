package Selenium.decorator;

import org.openqa.selenium.WebElement;


public class InputComment extends CustomElement{

    public InputComment(WebElement webElement) {
        super(webElement);
    }

    public void sendKeys(String comment) {
        System.out.println("input "+comment);
        getWebElement().sendKeys(comment);
    }
}

