package com.solvd.carina.example.gui.pages.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class AppPhotosBase extends AbstractPage {
    public AppPhotosBase(WebDriver driver) {
        super(driver);
    }

    public abstract ExtendedWebElement getPhoto();
    public abstract By getPhotoBy();

    public abstract void deleteUploadedImage();
}
