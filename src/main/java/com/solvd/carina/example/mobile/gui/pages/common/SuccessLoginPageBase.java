package com.solvd.carina.example.mobile.gui.pages.common;

import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SuccessLoginPageBase extends AbstractPage {
    public SuccessLoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getSuccessLoginMessage();

}
