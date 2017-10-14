package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;

public class SeleniumExercise3 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.google.com.mx");
        System.out.println("URL 0 " + myDriver.getCurrentUrl());
        myDriver.navigate().to("http:\\www.facebook.com");
        System.out.println("URL 1 " + myDriver.getCurrentUrl());
        myDriver.navigate().to("http:\\www.espn.com");
        System.out.println("URL 2 " + myDriver.getCurrentUrl());
        myDriver.navigate().back();
        myDriver.navigate().back();
        System.out.println("URL 2B " + myDriver.getCurrentUrl());
        myDriver.navigate().forward();
        System.out.println("URL 1F " + myDriver.getCurrentUrl());
        myDriver.navigate().refresh();
        System.out.println("URL Refresh " + myDriver.getCurrentUrl());
        // Wait some seconds
        Thread.sleep(5000);

        // Quit web driver
        myDriver.quit();
    }
}
