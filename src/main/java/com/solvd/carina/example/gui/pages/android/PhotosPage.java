package com.solvd.carina.example.gui.pages.android;

import com.solvd.carina.example.gui.pages.common.PhotosPageBase;
import com.zebrunner.carina.utils.android.IAndroidUtils;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = PhotosPageBase.class)
public class PhotosPage extends PhotosPageBase implements IAndroidUtils {

    @FindBy(xpath = "//android.widget.Gallery[@resource-id=\"io.appium.android.apis:id/gallery\"]/android.widget.ImageView[1]")
    private ExtendedWebElement firstPhoto;

    @FindBy(id = "io.appium.android.apis:id/gallery")
    private ExtendedWebElement galleryContainer;


    public PhotosPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void swipeToTheRight() {
       // swipe(firstPhoto,Direction.RIGHT,1000,1000);
        swipeRight(galleryContainer,1000);
    }
}
