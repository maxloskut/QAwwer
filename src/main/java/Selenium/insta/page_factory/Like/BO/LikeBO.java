package Selenium.insta.page_factory.Like.BO;

import Selenium.insta.page_factory.Like.PO.LikePO;
import io.qameta.allure.Step;

public class LikeBO {
    @Step("isOpen")
    public boolean like() {

        LikePO likePO = new LikePO()
                .goToUserPage();

        return likePO.isOpen()
                &&
                likePO
                        .selectPhoto()
                        .likePhoto()
                        .isOpen();
    }
}
