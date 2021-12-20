package Selenium.insta.page_factory.Comment.PO;

import Selenium.decorator.ClickButtonElement;
import Selenium.decorator.InputComment;
import Selenium.insta.paralel_run.BrowserFactory;
import Tread.PropertyUtil;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class CommentPO extends Photo1PO {

    @FindBy(xpath = "//*[@class=\"fr66n\"] /*[@class=\"wpO6b  \" ]")
    private ClickButtonElement commentButton;

    @FindBy(xpath = "//*[@style=\"height: 18px !important;\"]")
    private InputComment commentInput;


    @Step("inputMessage")
    public CommentPO inputComment(String comment) {
        commentInput.sendKeys(comment);
        return this;
    }


    @Step("LikePhoto")
    public CommentPO commentPhoto() {
        commentButton.click();
        return new CommentPO();
    }

    @Step("goToUserPage")
    @Link("https://www.instagram.com/")
    public CommentPO goToUserPage() {
        BrowserFactory.getDriver().get("https://www.instagram.com/" + new PropertyUtil().getProperty("profile1"));
        return this;
    }
}
