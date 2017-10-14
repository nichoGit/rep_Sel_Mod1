package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumHandsOn5 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";


        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.facebook.com");
        //Verify URL
        System.out.println("URL " + myDriver.getCurrentUrl());
        //Search by Id element
        WebElement myElementEmail = myDriver.findElement(By.id("email"));
        myElementEmail.sendKeys("juan.tester.123@gmail.com");

        WebElement myElementPass = myDriver.findElement(By.id("pass"));
        myElementPass.sendKeys("tester123");


        //WebElement myElement1 =  myDriver.findElement(By.id("_fZl"));
        myElementPass.submit();

        // Wait some seconds
        Thread.sleep(5000);
        WebElement myElement  = myDriver.findElement(By.name("q"));
        myElement.sendKeys("Qa Minds Lab");
        myElement.submit();
        Thread.sleep(5000);
        WebElement myElement1 = myDriver.findElement(By.xpath("//div[text()='QA Minds Lab']"));
        myElement1.click();

        Thread.sleep(10000);
        WebElement myElementText = myDriver.findElement(By.xpath("//*[@name='xhpc_message_text']"));
        myElementText.sendKeys("Hola QA minds Nicho");
        Thread.sleep(3000);
        WebElement myButton = myDriver.findElement(By.xpath("//button[@data-testid='react-composer-post-button']/span"));
        //Thread.sleep(1000);
        myButton.submit();
        Thread.sleep(5000);

        myDriver.close();

        // Quit web driver
        myDriver.quit();
    }
}
