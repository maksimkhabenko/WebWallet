package com.apolloweb.automation.helper;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaOptions;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;
import static io.github.bonigarcia.wdm.DriverManagerType.FIREFOX;


public class DriverManager {
    private static WebDriver webDriver;
    private static OperaOptions options;

    public DriverManager() {

    }

    public static WebDriver getWebDriver(WebDrivers webDriverType) {
        if (webDriver == null) {
            WebDriverManager.getInstance(CHROME).setup();
            WebDriverManager.getInstance(FIREFOX).setup();

            switch (webDriverType) {
                case ChromeDriverForWindows:
                    webDriver = new ChromeDriver();
                    break;
                case FireFoxDriverForWindows:
                    webDriver = new FirefoxDriver();
                    break;
                default:
                    throw new NullPointerException("com.firstbrige.testing.WebDriver don't exist in " + WebDrivers.class);
            }
        }
        return webDriver;
    }

}
