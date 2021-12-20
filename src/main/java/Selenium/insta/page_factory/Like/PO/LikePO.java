package Selenium.insta.page_factory.Like.PO;

import Selenium.decorator.ClickButtonElement;
import Selenium.insta.paralel_run.BrowserFactory;
import Tread.PropertyUtil;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class LikePO  extends PhotoPO{

    @FindBy(xpath = "//*[@class=\"fr66n\"] /*[@class=\"wpO6b  \" ]")
    private ClickButtonElement LikeButton;




    @Step("LikePhoto")
    public LikePO likePhoto() {
        LikeButton.click();
        return new LikePO();
    }

    @Step("goToUserPage")
    @Link("https://www.instagram.com/")
    public LikePO goToUserPage() {
        BrowserFactory.getDriver().get("https://www.instagram.com/" + new PropertyUtil().getProperty("profile1"));
        return this;
    }
}
