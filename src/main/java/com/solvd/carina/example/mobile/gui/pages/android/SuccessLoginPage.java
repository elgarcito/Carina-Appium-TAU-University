package com.solvd.carina.example.mobile.gui.pages.android;

import com.solvd.carina.example.mobile.gui.pages.common.SuccessLoginPageBase;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = SuccessLoginPageBase.class)
public class SuccessLoginPage extends SuccessLoginPageBase {

    @FindBy(id = "flash")
    private ExtendedWebElement successMessage;

    public SuccessLoginPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(successMessage);
//        setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
//        setPageAbsoluteURL("https://the-internet.herokuapp.com/login/secure");
    }

    @Override
    public String getSuccessLoginMessage() {
        return successMessage.getText();
    }

//    @Override
//    public void open() {
//        openURL(Configuration.getRequired("loginSuccess_url"));
//    }
}
