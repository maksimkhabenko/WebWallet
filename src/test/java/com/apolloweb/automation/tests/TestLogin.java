package com.apolloweb.automation.tests;

import com.apolloweb.automation.helper.TestWatcherExtension;
import com.apolloweb.automation.model.TestBase;
import com.apolloweb.automation.pages.LoginPage;
import com.apolloweb.automation.pages.MainPage;
import io.qameta.allure.Epic;

import io.qameta.allure.Feature;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Epic("Test")
@ExtendWith(TestWatcherExtension.class)
public class TestLogin extends TestBase {

    @Test
    @Feature("Login")
    public void loginValidUserNameValidPassword () throws InterruptedException {
        page.GetInstance(LoginPage.class).login("1");
        wait.until(ExpectedConditions.visibilityOfElementLocated(page.GetInstance(MainPage.class).acoountRS));
        page.GetInstance(MainPage.class).verifyAccountID("APL-X5JH-TJKJ-DVGC-5T2V8");
    }




}
