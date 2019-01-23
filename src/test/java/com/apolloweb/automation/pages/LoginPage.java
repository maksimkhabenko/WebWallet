package com.apolloweb.automation.pages;

import com.apolloweb.automation.model.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public By loginwithAccountIDTab = By.xpath("//a/p");
    public By loginByPassTab = By.xpath("//a[2]/p");
    public By passField = By.xpath("//div[2]/div/input");
    public By accountRSField = By.xpath("//input");
    public By submitButtonForPassLogining = By.xpath("//div[3]/button");
    public By submitButtonForAccountRSLogining = By.xpath("//button");




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



    public void verifyLoginUserName (String user){
       // Assert.assertEquals(readText(loginByPass),user);
    }



}
