package com.solvd.carina.example.gui.pages.android;

import com.solvd.carina.example.gui.pages.common.DragAndDropPageBase;
import com.solvd.carina.example.gui.pages.common.GalleryPageBase;
import com.solvd.carina.example.gui.pages.common.ListPageBase;
import com.solvd.carina.example.gui.pages.common.ViewPageBase;
import com.zebrunner.carina.utils.android.IAndroidUtils;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = ViewPageBase.class)
public class ViewPage extends ViewPageBase implements IAndroidUtils {
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Lists\"]")
    private ExtendedWebElement listButton;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Drag and Drop\"]")
    private ExtendedWebElement dragAndDropButton;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Gallery\"]")
    private ExtendedWebElement galleryButton;

    public ViewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public ListPageBase clickListPage() {
        listButton.click();
        return initPage(driver, ListPageBase.class);
    }

    @Override
    public DragAndDropPageBase clickDragAndDropPage() {
        dragAndDropButton.click();
        return initPage(driver, DragAndDropPageBase.class);
    }

    @Override
    public GalleryPageBase clickGalleryPage() {
        galleryButton.click();
        return initPage(driver, GalleryPageBase.class);
    }

    @Override
    public void scrollDownToObject() {
        Dimension size =driver.manage().window().getSize();
        int startY = (int) (size.height * 0.80);
        int endY = (int) (size.height * 0.20);
        int startX = size.width / 2;
        swipe(startX, startY, startX, endY, 500);
    }

    @Override
    public String getListOptionText() {
        return listButton.getText();
    }
}
