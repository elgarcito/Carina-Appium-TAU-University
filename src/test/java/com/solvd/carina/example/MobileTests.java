package com.solvd.carina.example;
import com.solvd.carina.example.gui.pages.common.*;
import com.solvd.carina.example.mobile.gui.pages.android.LoginPage;
import com.solvd.carina.example.mobile.gui.pages.common.LoginPageBase;
import com.solvd.carina.example.mobile.gui.pages.common.SuccessLoginPageBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.android.IAndroidUtils;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

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

    @Test(description = "send photos")
    public void send_photos(){
        try {
            File classPath = new File(System.getProperty("user.dir"));
            File imageDir=new File(classPath,"src/main/resources/images_to_send");
            File image=new File(imageDir.getCanonicalFile(),"image.jpg");
            pushFile("/sdcard/download/"+image.getName(),image);
            AppPhotosBase appPhotos =initPage(getDriver(), AppPhotosBase.class);
            ExpectedCondition condition = ExpectedConditions.numberOfElementsToBe(appPhotos.getPhotoBy(),1);
            WebDriverWait wait=new WebDriverWait(getDriver(), Duration.ofSeconds(10));
            wait.until(condition);
            appPhotos.deleteUploadedImage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(description = "Log in example in webDriver")
    public void userLogin_theInternet(){
        WebDriver driver=getDriver();
        LoginPageBase loginPage=initPage(driver,LoginPageBase.class);
        loginPage.open();
        loginPage.sendUserName("tomsmith");
        loginPage.sendPassword("SuperSecretPassword!");
        SuccessLoginPageBase successLoginPage= loginPage.clickLoginButton();
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
        String message= successLoginPage.getSuccessLoginMessage();
        wait.until(ExpectedConditions.urlContains("secure"));
        Assert.assertTrue(successLoginPage.isPageOpened(),"Page was not opened");
        String textToCompare="You logged into a secure area!";
        Assert.assertTrue(message.contains(textToCompare));
    }

}
