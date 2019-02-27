package com.apolloweb.automation.tests;

import com.apolloweb.automation.helper.TestWatcherExtension;
import com.apolloweb.automation.model.TestBase;
import com.apolloweb.automation.pages.LoginPage;
import com.apolloweb.automation.pages.MainPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


@Epic("Login")
@ExtendWith(TestWatcherExtension.class)
public class TestLogin extends TestBase {

    @Test
    @Story("Login")
    @Feature("Login By Pass")
    public void loginValidUserNameValidPassword () throws InterruptedException {
        page.GetInstance(LoginPage.class).loginByPass(defaultPass);
        page.GetInstance(MainPage.class).verifyAccountID(defaultAccountRS);
        page.GetInstance(MainPage.class).logOut();
    }

    @Test
    @Story("Login")
    @Feature("Login By AccoutnRS")
    public void loginValidAccountRS () throws InterruptedException {
        page.GetInstance(LoginPage.class).loginByAccountRS(defaultAccountRS.substring(4));
        page.GetInstance(MainPage.class).verifyAccountID(defaultAccountRS);
        page.GetInstance(MainPage.class).logOut();
    }

    @Test
    @Story("Create Account")
    @Feature("Standard wallet")
    @Description("Standard wallet with random pass")
    public void createAccountStandard () {
        String accountRS = page.GetInstance(LoginPage.class).createStandartWallet();
        page.GetInstance(MainPage.class).verifyAccountID(accountRS);
        page.GetInstance(MainPage.class).logOut();
    }


    @Test
    @Story("Create Account")
    @Feature("Vault wallet with random pass")
    public void createAccountVault () {
        String accountRS = page.GetInstance(LoginPage.class).createVaultWallet();
         page.GetInstance(MainPage.class).verifyAccountID(accountRS);
         page.GetInstance(MainPage.class).logOut();
    }

    @Test
    @Story("Create Account")
    @Feature("Vault wallet with custom pass")
    public void createAccountVaultWithMyPass () {
        String accountRS = page.GetInstance(LoginPage.class).createVaultWalletWithCustomPass("pass");
        page.GetInstance(MainPage.class).verifyAccountID(accountRS);
        page.GetInstance(MainPage.class).logOut();
    }

    @Test
    @Story("Create Account")
    @Feature("Standart wallet with custom pass")
    public void createAccountStandartWithMyPass () {
        String accountRS = page.GetInstance(LoginPage.class).createStandartWalletWithCustomPass("pass");
        page.GetInstance(MainPage.class).verifyAccountID(accountRS);
        page.GetInstance(MainPage.class).logOut();
    }

    
}
