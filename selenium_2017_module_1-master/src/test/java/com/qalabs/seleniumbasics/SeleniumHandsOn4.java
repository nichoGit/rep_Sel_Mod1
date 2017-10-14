package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHandsOn4 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.amazon.com.mx");
        //Verify URL
        System.out.println("URL " + myDriver.getCurrentUrl());
        //Search by Id element
        WebElement myElement =  myDriver.findElement(By.id("twotabsearchtextbox"));
        Thread.sleep(10000);

        myElement.sendKeys("Selenium");
        myElement.submit();

        // Wait some seconds
        Thread.sleep(10000);
        myDriver.close();

        // Quit web driver
        myDriver.quit();
    }
}
