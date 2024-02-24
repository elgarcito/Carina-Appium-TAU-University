package com.solvd.carina.example.gui.pages.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

import java.util.List;

public abstract class ViewPageBase extends AbstractPage {

    public ViewPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract ListPageBase clickListPage();
    public abstract DragAndDropPageBase clickDragAndDropPage();

    public abstract void scrollDownToObject();

    public abstract String getListOptionText();

}
