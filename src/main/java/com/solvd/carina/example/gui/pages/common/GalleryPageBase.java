package com.solvd.carina.example.gui.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class GalleryPageBase extends AbstractPage {
    public GalleryPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract PhotosPageBase clickOnPhotos();

}
