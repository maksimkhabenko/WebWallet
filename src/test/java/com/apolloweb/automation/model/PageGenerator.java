package com.apolloweb.automation.model;

import com.apolloweb.automation.helper.TestConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageGenerator {
    public String baseUrl;
    public WebDriver driver;

    public PageGenerator(WebDriver driver){
        this.driver = driver;
        this.baseUrl = TestConfiguration.getTestConfig().getHost();
    }

    //JAVA Generics to Create and return a New Page
    public  <TPage extends BasePage> TPage GetInstance (Class<TPage> pageClass) {
        try {
            //Initialize the Page with its elements and return it.
            return PageFactory.initElements(driver,  pageClass);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
