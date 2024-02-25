package com.solvd.carina.example.gui.pages.android;

import com.solvd.carina.example.gui.pages.common.GalleryPageBase;
import com.solvd.carina.example.gui.pages.common.PhotosPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = GalleryPageBase.class)
public class GalleryPage extends GalleryPageBase {

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"1. Photos\"]")
    private ExtendedWebElement photosButton;
    public GalleryPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public PhotosPageBase clickOnPhotos() {
        photosButton.click();
        return initPage(driver, PhotosPageBase.class);
    }
}
