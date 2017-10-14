package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumHandsOn3 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.facebook.com");
        //Verify URL
        System.out.println("URL " + myDriver.getCurrentUrl());
        //Search by Id element
        WebElement myElementEmail =  myDriver.findElement(By.id("email"));
        myElementEmail.sendKeys("juan.tester.123@gmail.com");

        WebElement myElementPass =  myDriver.findElement(By.id("pass"));
        myElementPass.sendKeys("tester123");


        //WebElement myElement1 =  myDriver.findElement(By.id("_fZl"));
        myElementPass.submit();

        // Wait some seconds
        Thread.sleep(5000);
        myDriver.close();

        // Quit web driver
        myDriver.quit();
    }




}
