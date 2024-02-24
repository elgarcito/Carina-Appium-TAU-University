package com.solvd.carina.example.gui.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class DragAndDropPageBase extends AbstractPage {
    public DragAndDropPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void dragCircle();
    public abstract String getResultText();

}
