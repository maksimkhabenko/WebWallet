package com.apolloweb.automation.model;

import com.apolloweb.automation.helper.TestConfiguration;
import com.apolloweb.automation.helper.TestWatcherExtension;
import com.apolloweb.automation.helper.WebDriverManager;
import com.apolloweb.automation.helper.WebDrivers;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(TestWatcherExtension.class)
public class TestBase {
    public WebDriver driver;
    public String baseUrl;
    public WebDriverWait wait;
    public PageGenerator page;
    public String defaultAccountRS;
    public String defaultPass;


    @BeforeAll
    public void setUp() {
        this.baseUrl = TestConfiguration.getTestConfiguration().getBaseURL();
        this.defaultAccountRS = TestConfiguration.getTestConfiguration().getPropertyDefaultAccountRS();
        this.defaultPass = TestConfiguration.getTestConfiguration().getPropertyDefaultPass();
        driver = WebDriverManager.getWebDriver(WebDrivers.ChromeDriverForWindows);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,15);
        page = new PageGenerator(driver);
        driver.manage().window().maximize();
    }


    @BeforeEach
    void BeforEachTest() {
        driver.get(baseUrl);
        System.out.println("Start Page");
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }


    @Attachment(value = "{testName} - screenshot", type = "image/png")
    public byte[] makeScreenshotOnFailure(String testName) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    /*
    @Attachment(value = "{elemetnt} - screenshot", type = "image/png")
    public byte[] makeScreenshotOnFailureElement(By element) {

        return ((TakesScreenshot) driver.findElement(element)).getScreenshotAs(OutputType.BYTES);
    }
    */


}
