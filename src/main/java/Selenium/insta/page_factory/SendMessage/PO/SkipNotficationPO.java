package Selenium.insta.page_factory.SendMessage.PO;

import Selenium.insta.page_factory.SendMessage.BO.MessageBO;
import Selenium.insta.paralel_run.BrowserFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SkipNotficationPO extends UserProfilePO {

    @FindBy(xpath = "//*[@class=\"aOOlW   HoLwm \"]")
    private WebElement skipN;


    @Step("skip")
    public MessagePO skipNt() {
        WebDriverWait waiter= new WebDriverWait( BrowserFactory.getDriver(),2);
        WebElement likeButtonClickable = waiter.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"aOOlW   HoLwm \"]")));
        skipN.click();
        return new MessagePO();
    }


}
