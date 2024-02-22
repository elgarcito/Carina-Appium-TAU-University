package com.solvd.carina.example.mobile.apps;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CalculatorHomePage extends AbstractPage{

    @FindBy(id = "com.google.android.calculator:id/digit_0")
    private ExtendedWebElement digit0;
    @FindBy(id = "com.google.android.calculator:id/digit_1")
    private ExtendedWebElement digit1;

    @FindBy(id = "com.google.android.calculator:id/digit_2")
    private ExtendedWebElement digit2;

    @FindBy(id = "com.google.android.calculator:id/digit_3")
    private ExtendedWebElement digit3;

    @FindBy(id = "com.google.android.calculator:id/digit_4")
    private ExtendedWebElement digit4;

    @FindBy(id = "com.google.android.calculator:id/op_add")
    private ExtendedWebElement sumSign;

    @FindBy(id = "com.google.android.calculator:id/eq")
    private ExtendedWebElement equalSign;

    @FindBy(id = "com.google.android.calculator:id/result_final")
    private ExtendedWebElement result;
    public CalculatorHomePage(WebDriver driver) {
        super(driver);
    }
    public String makeASum(){
        digit1.click();
        digit0.click();
        digit0.click();
        sumSign.click();
        digit2.click();
        digit3.click();
        digit4.click();
        equalSign.click();
        return result.getText();
    }
}
