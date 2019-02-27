package com.apolloweb.automation.pages;

import com.apolloweb.automation.model.BasePage;
import com.apolloweb.automation.pages.modals.CreateAccount;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By loginwithAccountIDTab = By.xpath("//a/p");
    private By loginByPassTab = By.xpath("//a[2]/p");

    private By passField = By.xpath("//div[2]/div/input");
    private By accountRSField = By.xpath("//input");

    private By submitButtonForPassLogining = By.xpath("//div[3]/button");
    private By submitButtonForAccountRSLogining = By.xpath("//button");

    private By createAccountModal = By.xpath("//div[2]/a");
    private CreateAccount createAccount = new CreateAccount();





    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginByPass(String pass){
        click(loginByPassTab);
        click(passField);
        writeText(passField,pass);
        click(submitButtonForPassLogining);
    }

    public void loginByAccountRS(String accountRS){
        click(loginwithAccountIDTab);
        click(accountRSField);
        writeText(accountRSField,accountRS);
        click(submitButtonForAccountRSLogining);
    }

    public String createStandartWallet(){
        click(createAccountModal);
        click(createAccount.createStandartWalletButton);
        String pass = readText(createAccount.generatedPassField);
        String account = readText(createAccount.generatedAccountRSField);
        click(createAccount.checkBoxSavePass);
        click(createAccount.nextButton);
        click(createAccount.enterPassField);
        writeText(createAccount.enterPassField,pass);
        click(createAccount.createWalletButton);
        return  account;
    }

    public String createStandartWalletWithCustomPass(String customPass){
        click(createAccountModal);
        click(createAccount.checkBoxCreateCustomPassStandartWallet);
        writeText(createAccount.customPassFieldStandartWallet,customPass);
        click(createAccount.createStandartWalletButton);
        String pass = readText(createAccount.generatedPassField);
        String account = readText(createAccount.generatedAccountRSField);
        click(createAccount.checkBoxSavePass);
        click(createAccount.nextButton);
        click(createAccount.enterPassField);
        writeText(createAccount.enterPassField,pass);
        click(createAccount.createWalletButton);
        return  account;
    }



    public String createVaultWallet()  {
        click(createAccountModal);
        click(createAccount.vaultValletTab);
        click(createAccount.createStandartVaultButton);
        String pass = readText(createAccount.generatedPassField);
        String account = readText(createAccount.generatedAccountRSField);
        click(createAccount.checkBoxSavePass);
        click(createAccount.nextButton);
        click(createAccount.enterPassField);
        writeText(createAccount.enterPassField,pass);
        click(createAccount.createWalletButton);
        return  account;
    }

    public String createVaultWalletWithCustomPass(String customPass)  {
        click(createAccountModal);
        click(createAccount.vaultValletTab);
        clickJS(createAccount.checkBoxCreateCustomPassVaultWallet);
        writeText(createAccount.customPassFieldVaultWallet,customPass);
        click(createAccount.createStandartVaultButton);
        String pass = readText(createAccount.generatedPassField);
        String account = readText(createAccount.generatedAccountRSField);
        click(createAccount.checkBoxSavePass);
        click(createAccount.nextButton);
        click(createAccount.enterPassField);
        writeText(createAccount.enterPassField,pass);
        click(createAccount.createWalletButton);
        return  account;
    }






}
