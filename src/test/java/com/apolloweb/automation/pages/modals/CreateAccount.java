package com.apolloweb.automation.pages.modals;

import org.openqa.selenium.By;

public class CreateAccount {

    public By customPassFieldVaultWallet = By.cssSelector("div.form-tabulator:nth-child(3) > form:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)");
    public By customPassFieldStandartWallet = By.cssSelector("form.active:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > textarea:nth-child(1)");

    public By createStandartWalletButton = By.xpath("//form[2]/div[2]/a");
    public By createStandartVaultButton = By.linkText("Create account");;

    public By checkBoxCreateCustomPassStandartWallet = By.xpath("(//input[@type='checkbox'])[2]");
    public By checkBoxCreateCustomPassVaultWallet = By.xpath("(//input[@type='checkbox'])");

    public By checkBoxSavePass = By.xpath("//div[5]/div/div/input");

    public By nextButton = By.xpath("//div[6]/a");
    public By generatedPassField = By.xpath("//p/span");
    public By generatedAccountRSField = By.xpath("//span[2]");

    public By enterPassField = By.xpath("//input");
    public By createWalletButton = By.xpath("//button[2]");
    public By vaultValletTab = By.cssSelector(".no-padding .form-tab:nth-child(2) > p");


}
