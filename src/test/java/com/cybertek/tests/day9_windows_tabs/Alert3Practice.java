package com.cybertek.tests.day9_windows_tabs;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Alert3Practice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

    @Test
    public void p3_prompt_alert_practice() {
// click promt button  // <button class="btn btn-primary" onclick="jsPrompt()">Click for JS Prompt</button>
        WebElement promptAlertButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        promptAlertButton.click();

        //using alert class to handle alert
        Alert alert = driver.switchTo().alert();
        BrowserUtils.wait(2);
        String input = "hello";
        alert.sendKeys("hello");
        alert.accept();

        //
        //<p id="result" style="color:green">You entered: hello</p>
        WebElement resultText = driver.findElement(By.id("result"));
        Assert.assertTrue(resultText.isDisplayed(), "result displayed on the window.");
        String actual = resultText.getText();

        Assert.assertTrue(actual.contains(input), "the result does not contain the input. verification failed!!!");


    }


}
