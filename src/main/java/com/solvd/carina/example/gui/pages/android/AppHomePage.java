package com.solvd.carina.example.gui.pages.android;

import com.solvd.carina.example.gui.pages.common.AppHomePageBase;
import com.solvd.carina.example.gui.pages.common.AppPageBase;
import com.solvd.carina.example.gui.pages.common.ViewPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = AppHomePageBase.class)
public class AppHomePage extends AppHomePageBase {

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"App\"]")
    private ExtendedWebElement appButton;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Views\"]")
    private ExtendedWebElement viewButton;

    public AppHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AppPageBase clickAppPageBase() {
        appButton.click();
        return initPage(getDriver(),AppPageBase.class);
    }

    @Override
    public ViewPageBase clickViewPage() {
        viewButton.click();
        return initPage(getDriver(), ViewPageBase.class);
    }
}
