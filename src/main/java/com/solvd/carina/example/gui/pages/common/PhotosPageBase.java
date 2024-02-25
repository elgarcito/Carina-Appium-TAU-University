package com.solvd.carina.example.gui.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class PhotosPageBase extends AbstractPage {
    public PhotosPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void swipeToTheRight();
}
