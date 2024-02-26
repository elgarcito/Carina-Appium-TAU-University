package com.solvd.carina.example.mobile.gui.pages.android;

import com.solvd.carina.example.mobile.gui.pages.common.LoginPageBase;
import com.solvd.carina.example.mobile.gui.pages.common.SuccessLoginPageBase;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {

    @FindBy(id = "username")
    private ExtendedWebElement userNameBox;

    @FindBy(id = "password")
    private ExtendedWebElement passwordBox;

    @FindBy(css = "button[class=\"radius\"]")
    private ExtendedWebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void sendUserName(String user) {
        userNameBox.type(user);
    }

    @Override
    public void sendPassword(String password) {
        passwordBox.type(password);
    }

    @Override
    public SuccessLoginPageBase clickLoginButton() {
        loginButton.click();
        return initPage(driver,SuccessLoginPageBase.class);
    }

    @Override
    public void open() {
        openURL(Configuration.getRequired("login_url"));
    }
}
