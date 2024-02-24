package com.solvd.carina.example.gui.pages.android;

import com.solvd.carina.example.gui.pages.common.DragAndDropPageBase;
import com.zebrunner.carina.utils.android.IAndroidUtils;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE,parentClass = DragAndDropPageBase.class)
public class DragAndDropPage extends DragAndDropPageBase implements IAndroidUtils {

    @FindBy(id = "io.appium.android.apis:id/drag_dot_1")
    private ExtendedWebElement circle1;

    @FindBy(id = "io.appium.android.apis:id/drag_dot_2")
    private ExtendedWebElement circle2;

    @FindBy(id = "io.appium.android.apis:id/drag_dot_3")
    private ExtendedWebElement circle3;

    @FindBy(id = "io.appium.android.apis:id/drag_result_text")
    private ExtendedWebElement resultText;
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void dragCircle() {
        dragAndDrop(circle1,circle2, Duration.ofSeconds(3),Duration.ofSeconds(3));
    }

    @Override
    public String getResultText() {
        return resultText.getText();
    }
}

