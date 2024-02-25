package com.solvd.carina.example;
import com.solvd.carina.example.gui.pages.common.*;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.android.IAndroidUtils;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileTests implements IAbstractTest, IAndroidUtils {
    @Test(description = "Get list of options and show them")
    @MethodOwner(owner = "Edgar")
    public void getMenuElementList(){
        AppHomePageBase appHomePage =initPage(getDriver(), AppHomePageBase.class);
        AppPageBase appPageBase= appHomePage.clickAppPageBase();
        appPageBase.getMenuList();
    }

    @Test(description = "scroll test")
    public void scroll_test(){
        AppHomePageBase homePage=initPage(getDriver(), AppHomePageBase.class);
        ViewPageBase viewPage= homePage.clickViewPage();
        viewPage.scrollDownToObject();
        Assert.assertEquals(viewPage.getListOptionText(),"Lists","Wrong message");
    }

    @Test(description = "Drag and drop test")
    public void drag_and_drop_test(){
        AppHomePageBase homePage=initPage(getDriver(), AppHomePageBase.class);
        ViewPageBase viewPage=homePage.clickViewPage();
        DragAndDropPageBase dragAndDropPage = viewPage.clickDragAndDropPage();
        dragAndDropPage.dragCircle();
        Assert.assertEquals(dragAndDropPage.getResultText(),"Dropped!","Circle not dropped");
    }

    @Test(description = "Swipe test")
    public void swipe_test(){
        AppHomePageBase homePage=initPage(getDriver(), AppHomePageBase.class);
        ViewPageBase viewPage=homePage.clickViewPage();
        GalleryPageBase galleryPage= viewPage.clickGalleryPage();
        PhotosPageBase photosPage=galleryPage.clickOnPhotos();
        photosPage.swipeToTheRight();
    }

    @Test(description = "send SMS")
    public void send_SMS(){
        sendSMS("2498774455","Holo from Appium");
    }

}
