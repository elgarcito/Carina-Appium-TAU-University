package com.solvd.carina.example.gui.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class AppHomePageBase extends AbstractPage {
    public AppHomePageBase(WebDriver driver) {
        super(driver);
    }
    public abstract AppPageBase clickAppPageBase();
}
