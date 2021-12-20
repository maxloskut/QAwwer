package Selenium.insta.page_factory.Like.PO;

import Selenium.decorator.ClickButtonElement;
import Selenium.insta.paralel_run.BrowserFactory;
import Tread.PropertyUtil;
import io.qameta.allure.Link;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LikePO  extends PhotoPO{

    @FindBy(xpath = "//*[@class=\"fr66n\"] /*[@class=\"wpO6b  \" ]")
    private ClickButtonElement LikeButton;




    @Step("LikePhoto")
    public LikePO likePhoto() {
        WebDriverWait waiter= new WebDriverWait( BrowserFactory.getDriver(),2);
        WebElement likeButtonClickable = waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"fr66n\"] /*[@class=\"wpO6b  \" ]")));
        likeButtonClickable.click();
        return this;
    }

    @Step("goToUserPage")
    @Link("https://www.instagram.com/")
    public LikePO goToUserPage() {
        BrowserFactory.getDriver().get("https://www.instagram.com/" + new PropertyUtil().getProperty("profile1"));
        return this;
    }
}
