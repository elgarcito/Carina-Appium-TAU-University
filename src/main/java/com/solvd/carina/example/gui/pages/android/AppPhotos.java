package com.solvd.carina.example.gui.pages.android;

import com.solvd.carina.example.gui.pages.common.AppPhotosBase;
import com.zebrunner.carina.utils.android.IAndroidUtils;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = AppPhotosBase.class)
public class AppPhotos extends AppPhotosBase implements IAndroidUtils {
    public AppPhotos(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//android.view.ViewGroup[contains(@content-desc,'Photo taken')]")
    private ExtendedWebElement photo;

    @FindBy(id = "com.google.android.apps.photos:id/move_to_trash")
    private ExtendedWebElement trashIcon;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"com.google.android.apps.photos:id/move_to_trash\"]")
    private ExtendedWebElement trashIconSubMenu;
    private By photoBy=By.xpath("//android.view.ViewGroup[contains(@content-desc,'Photo taken')]");



    @Override
    public ExtendedWebElement getPhoto() {
        return photo;
    }

    @Override
    public By getPhotoBy() {
        return photoBy;
    }

    @Override
    public void deleteUploadedImage() {
        longTap(photo);
        trashIcon.click();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(x->trashIconSubMenu.isDisplayed());
        trashIconSubMenu.click();
    }
}
