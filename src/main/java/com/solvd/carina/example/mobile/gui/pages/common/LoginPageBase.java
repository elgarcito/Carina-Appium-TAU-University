package com.solvd.carina.example.mobile.gui.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractPage {
    public LoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void sendUserName(String user);
    public abstract void sendPassword(String password);
    public abstract SuccessLoginPageBase clickLoginButton();

}
