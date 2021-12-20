package Selenium.insta.page_factory.login.BO;

import Selenium.insta.page_factory.login.PO.LoginPO;
import Tread.PropertyUtil;
import io.qameta.allure.Step;

public class LoginBO {

    @Step("isOpen")
    public boolean login() {

        LoginPO loginPO = new LoginPO()
                .goToLoginPage();

        return loginPO.isOpen()
                &&
                loginPO
                        .inputLogin((String) new PropertyUtil().getProperty("login"))
                        .inputPassword((String) new PropertyUtil().getProperty("pass"))
                        .submit()
                        .isOpen();
    }
}