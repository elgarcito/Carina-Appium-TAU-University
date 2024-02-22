package com.solvd.carina.example;
import com.solvd.carina.example.gui.pages.common.AppHomePageBase;
import com.solvd.carina.example.gui.pages.common.AppPageBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.android.IAndroidUtils;
import org.testng.annotations.Test;

public class MobileTests implements IAbstractTest, IAndroidUtils {
    @Test(description = "Get list of options and show them")
    @MethodOwner(owner = "Edgar")
    public void getMenuElementList(){
        AppHomePageBase appHomePage =initPage(getDriver(), AppHomePageBase.class);
        AppPageBase appPageBase= appHomePage.clickAppPageBase();
        appPageBase.getMenuList();
    }
}
