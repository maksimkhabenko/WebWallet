package com.apolloweb.automation.pages;


import com.apolloweb.automation.model.BasePage;
import com.apolloweb.automation.pages.modals.CurrentAccount;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MainPage extends BasePage {
    public By acoountRS = By.className("user-account-rs");

    private CurrentAccount currentAccount = new CurrentAccount();

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void verifyAccountID (String verifyAccountID){
        assertEquals(readText(acoountRS),verifyAccountID);
    }

    public void logOut()
    {
       clickJS(currentAccount.openModal);
       clickJS(currentAccount.logout);
    }

}
