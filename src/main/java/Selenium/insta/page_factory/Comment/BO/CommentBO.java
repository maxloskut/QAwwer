package Selenium.insta.page_factory.Comment.BO;

import Selenium.insta.page_factory.Comment.PO.CommentPO;
import Tread.PropertyUtil;
import io.qameta.allure.Step;

public class CommentBO {
    @Step("isOpen")
    public boolean comment() {

        CommentPO commentPO = new CommentPO()
                .goToUserPage();

        return commentPO.isOpen()
                &&
                commentPO
                        .selectPhoto()
                        .inputComment((String) new PropertyUtil().getProperty("comment"))
                        .commentPhoto()
                        .isOpen();
    }
}
