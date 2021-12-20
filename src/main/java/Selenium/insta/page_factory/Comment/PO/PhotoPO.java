package Selenium.insta.page_factory.Comment.PO;

import Selenium.decorator.ClickButtonElement;
import Selenium.insta.page_factory.BasicPO;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

public class PhotoPO extends BasicPO {


    @FindBy(xpath = "//*[@class=\"_9AhH0\"]")
    private ClickButtonElement SelectPhotoButton;

    @FindBy(xpath = "//*[@data-testid=\"user-avatar\"]")
    private ClickButtonElement userLogo;

    @Step("SelectPhoto")
    public CommentPO selectPhoto() {
        SelectPhotoButton.click();
        return new CommentPO();
    }

    @Override
    @Step("isOpen")
    public boolean isOpen() {
        return userLogo.waitForMeVisible(10000);
    }


};

