package com.apolloweb.automation.pages;


import com.apolloweb.automation.model.BasePage;
import com.apolloweb.automation.pages.modals.CurrentAccount;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class MainPage extends BasePage {
    public By acoountRS = By.className("user-account-rs");

    private CurrentAccount currentAccount = new CurrentAccount();

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void verifyAccountID (String verifyAccountID){
        Assert.assertEquals(readText(acoountRS),verifyAccountID);
    }

    public void logOut()
    {
       click(currentAccount.openModal);
       click(currentAccount.logout);
    }

}
