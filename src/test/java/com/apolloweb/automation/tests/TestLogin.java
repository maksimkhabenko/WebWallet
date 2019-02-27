package com.apolloweb.automation.tests;

import com.apolloweb.automation.helper.TestWatcherExtension;
import com.apolloweb.automation.model.TestBase;
import com.apolloweb.automation.pages.LoginPage;
import com.apolloweb.automation.pages.MainPage;
import io.qameta.allure.Epic;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Epic("Test")
@ExtendWith(TestWatcherExtension.class)
public class TestLogin extends TestBase {

    @Test
    @Story("Login")
    @Feature("Login By Pass")
    public void loginValidUserNameValidPassword () throws InterruptedException {
        page.GetInstance(LoginPage.class).loginByPass(defaultPass);
        wait.until(ExpectedConditions.visibilityOfElementLocated(page.GetInstance(MainPage.class).acoountRS));
        page.GetInstance(MainPage.class).verifyAccountID(defaultAccountRS);
        page.GetInstance(MainPage.class).logOut();
    }

    @Test
    @Story("Login")
    @Feature("Login By AccoutnRS")
    public void loginValidAccountRS () throws InterruptedException {
        page.GetInstance(LoginPage.class).loginByAccountRS(defaultAccountRS.substring(4));
        wait.until(ExpectedConditions.visibilityOfElementLocated(page.GetInstance(MainPage.class).acoountRS));
        page.GetInstance(MainPage.class).verifyAccountID(defaultAccountRS);
        page.GetInstance(MainPage.class).logOut();
    }

    @Test
    @Story("Create Account")
    @Feature("Standard wallet")
    public void createAccount () throws InterruptedException {
        String accountRS = page.GetInstance(LoginPage.class).createStandartWallet();
        wait.until(ExpectedConditions.visibilityOfElementLocated(page.GetInstance(MainPage.class).acoountRS));
        page.GetInstance(MainPage.class).verifyAccountID(accountRS);
        page.GetInstance(MainPage.class).logOut();
    }

    
}
