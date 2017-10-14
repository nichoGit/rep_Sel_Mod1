package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExercise4 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);
        myDriver.get("https://www.youtube.com");

        //WebElement myElement =  myDriver.findElement(By.id("search-container"));
        WebElement myElement =  myDriver.findElement(By.id("search"));

        WebElement myElement1 =  myDriver.findElement(By.id("search-icon-legacy"));
        // Get google home page

        System.out.println(myElement.isDisplayed());
        System.out.println(myElement.isEnabled());

        myElement.sendKeys("Selenium");
        myElement1.click();


        // Wait some seconds
        Thread.sleep(5000);

        // Quit web driver
        myDriver.quit();
    }
}
