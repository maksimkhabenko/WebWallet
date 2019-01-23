package com.apolloweb.automation.pages;

import com.apolloweb.automation.model.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public By loginByPassTab = By.xpath("//a[2]/p");
    public By passField = By.xpath("//div[2]/div/input");
    public By submitButton = By.xpath("//div[3]/button");



    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String pass){
        click(loginByPassTab);
        click(passField);
        writeText(passField,pass);
        click(submitButton);
    }

    public void verifyLoginUserName (String user){
       // Assert.assertEquals(readText(login),user);
    }



}
