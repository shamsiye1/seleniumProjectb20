package com.cybertek.tests.day9_windows_tabs;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandlingPractices {
    WebDriver driver;


    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("firefox");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");

    }


    @Test
    public void p5_handling_windows(){

        String actTitle=driver.getTitle();

        Assert.assertTrue(actTitle.contains("Practice"));

        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        String titleAfterClick = driver.getTitle();
        System.out.println("title after click = "+titleAfterClick);

        String mainHandle = driver.getWindowHandle();
        System.out.println("main handle: "+mainHandle);

        //Set allows only unique values
        Set<String> windowHandles= driver.getWindowHandles();
        // we loop through the set of window handles so that we can get the window handle of the other windows
        //then using switchTo().window() method we switch to the other windows

        for (String each : windowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current title: "+driver.getTitle());

        }

        //Getting the current(actual) title, and comparing with expected title

        Assert.assertTrue(driver.getTitle().equals("New Window"));

        BrowserUtils.wait(2);
        driver.close(); // driver close will close the current focused window/tab

        //if i want to switch back to main page, to continue with some other actions:
        driver.switchTo().window(mainHandle);

        //driver.quit will close all of the tabs that are opened in that session togather
        driver.quit();








    }

    @Test
    public void p6_handling_more_than_two_windows(){

        driver.get("https://amazon.com");

        //this is basically: we are downcasting our driver type to javaScriptExecutor

        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

        Set<String> windowHandles= driver.getWindowHandles();

        for (String each: windowHandles){
          BrowserUtils.wait(4);
            driver.switchTo().window(each);
            System.out.println("current page title: "+ driver.getTitle());
        }














    }









}
