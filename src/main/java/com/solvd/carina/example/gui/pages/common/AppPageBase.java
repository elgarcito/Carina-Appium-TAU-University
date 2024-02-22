package com.solvd.carina.example.gui.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

import java.util.List;

public abstract class AppPageBase extends AbstractPage {
    public AppPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract List<String> getMenuList();
}
