package com.apolloweb.automation.pages.modals;

import org.openqa.selenium.By;

public class CreateAccount {

    public By createButton = By.xpath("//form[2]/div[2]/a");
    public By checkBoxAgree = By.xpath("//div[5]/div/div/input");
    public By nextButton = By.xpath("//div[6]/a");
    public By generatedPassField = By.xpath("//p/span");
    public By generatedAccountRSField = By.xpath("//span[2]");
    public By enterPassField = By.xpath("//input");
    public By createWalletButton = By.xpath("//button[2]");
}
