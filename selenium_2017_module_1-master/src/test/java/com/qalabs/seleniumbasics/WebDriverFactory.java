package com.qalabs.seleniumbasics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;

public class WebDriverFactory {

    public static WebDriver getDriver(String browser) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");
        File rootPath = new File("src/test/resources/lib-thirdparty/driversforwin");
        if(browser.toLowerCase().equals("chrome")) {
            File chromeFilePath = new File(rootPath, "chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
            return new ChromeDriver(options);
        } else if (browser.toLowerCase().equals("firefox")) {
            File firefoxFilePath = new File(rootPath, "geckodriver.exe");
            System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());
            return new FirefoxDriver();
        } else if (browser.toLowerCase().equals("explorer")) {
            File ieFilePath = new File(rootPath, "IEDriverServer.exe");
            System.setProperty("webdriver.ie.driver", ieFilePath.getPath());
            return new InternetExplorerDriver();
        }else {
            return null;
        }
    }


}
