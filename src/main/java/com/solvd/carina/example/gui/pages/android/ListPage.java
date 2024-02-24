package com.solvd.carina.example.gui.pages.android;

import com.solvd.carina.example.gui.pages.common.ListPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = ListPageBase.class)
public class ListPage extends ListPageBase {
    public ListPage(WebDriver driver) {
        super(driver);
    }

}
