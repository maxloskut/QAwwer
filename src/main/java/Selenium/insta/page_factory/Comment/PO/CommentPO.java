package Selenium.insta.page_factory.Comment.PO;

import Selenium.decorator.ClickButtonElement;
import Selenium.decorator.InputComment;
import Selenium.decorator.InputElement;
import Selenium.insta.paralel_run.BrowserFactory;
import Tread.PropertyUtil;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommentPO extends PhotoPO {



    @FindBy(xpath = "//*[@data-testid=\"post-comment-text-area\"]")
    private InputElement commentAreaInput;

    @FindBy(xpath = "//*[@data-testid=\"post-comment-input-button\"]")
    private ClickButtonElement sendComment;

    @Step("inputComment")
    public CommentPO inputComment(String comment) {
        WebDriverWait waiter= new WebDriverWait( BrowserFactory.getDriver(),2);
        WebElement commentInputable = waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@data-testid=\"post-comment-text-area\"]")));
        commentInputable.click();
        commentAreaInput.sendKeys(comment);
        return this;
    }


    @Step("commentPhotoButton")
    public CommentPO commentPhoto() {
        sendComment.click();
        return this;
    }

    @Step("goToUserPage")
    @Link("https://www.instagram.com/")
    public CommentPO goToUserPage() {
        BrowserFactory.getDriver().get("https://www.instagram.com/" + new PropertyUtil().getProperty("profile1"));
        return this;
    }
}
