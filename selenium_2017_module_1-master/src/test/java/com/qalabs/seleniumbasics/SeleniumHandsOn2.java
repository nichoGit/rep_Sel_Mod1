package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHandsOn2 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.google.com.mx");
        //Verify URL
        if(myDriver.getCurrentUrl().equals("https://www.google.com.mx/"))
            System.out.println("URL " + myDriver.getCurrentUrl());
        else
            System.out.println("URL No coincide");

        //Search by Id element _fZl
        WebElement myElement =  myDriver.findElement(By.id("lst-ib"));
        //WebElement myElement1 =  myDriver.findElement(By.id("_fZl"));

        myElement.sendKeys("Como tostar cafe");
        myElement.submit();

        // Wait some seconds
        Thread.sleep(5000);
        myDriver.close();

        // Quit web driver
        myDriver.quit();
    }
}
