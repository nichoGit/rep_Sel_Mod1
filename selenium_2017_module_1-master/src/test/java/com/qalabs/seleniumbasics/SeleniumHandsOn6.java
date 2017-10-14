package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHandsOn6 {
    public static void main (String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.wikipedia.org/");
        //Verify URL
        System.out.println("URL " + myDriver.getCurrentUrl());
        WebElement mySearch =  myDriver.findElement(By.id("searchInput"));
        mySearch.sendKeys("Selenium");
        mySearch.submit();
        WebElement elementBody =  myDriver.findElement(By.tagName("body"));
        String findStr = "Selenium";
        int lastIndex = 0;
        int count =0;
        while(lastIndex != -1){
            lastIndex = elementBody.getText().indexOf(findStr,lastIndex);
            if(lastIndex != -1){
                count ++;
                lastIndex += findStr.length();
            }
        }
        System.out.println(count);
        // Wait some seconds
        Thread.sleep(10000);
        myDriver.close();

        // Quit web driver
        myDriver.quit();

    }
}
