package com.solvd.carina.example;
import com.solvd.carina.example.mobile.apps.CalculatorHomePage;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.android.IAndroidUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AndroidBuiltInAppCalculatorDemoTest implements IAbstractTest, IAndroidUtils {
    @Test(description = "Get list of options and show them")
    @MethodOwner(owner = "Edgar")
    public void getMenuElementList(){
        CalculatorHomePage calculatorHomePage=new CalculatorHomePage(getDriver());
        String result= calculatorHomePage.makeASum();
        Assert.assertEquals(result,"334","Sum invalid");
    }
}
