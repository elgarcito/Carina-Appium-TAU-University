package com.solvd.carina.example.gui.pages.android;

import com.solvd.carina.example.gui.pages.common.AppPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = AppPageBase.class)
public class AppPage extends AppPageBase {
    private static final Logger LOGGER= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//android.widget.TextView[@content-desc]")
    private List<ExtendedWebElement> elements;
    public AppPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public List<String> getMenuList() {
        List<String> optionsName=new ArrayList<>();
        for (ExtendedWebElement element:elements){
            optionsName.add(element.getAttribute("content-desc"));
            LOGGER.info(element.getAttribute("content-desc"));
        }
        return optionsName;
    }
}
