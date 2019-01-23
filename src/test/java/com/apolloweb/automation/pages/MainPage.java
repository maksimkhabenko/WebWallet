package com.apolloweb.automation.pages;


import com.apolloweb.automation.model.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage extends BasePage {
    public By acoountRS = By.className("user-account-rs");

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void verifyAccountID (String verifyAccountID){
        Assert.assertEquals(readText(acoountRS),verifyAccountID);
    }

}
