package com.cybertek.tests.day8_alerts_iframes_windows;

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

public class AlertsPractices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

    }

    @Test
    public void p1_information_alert_practice() {

        //<button class="btn btn-primary" onclick="jsAlert()">Click for JS Alert</button>
        WebElement warningAlertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        //click the button
        warningAlertButton.click();

        //1. create alert instance and switch to alert
        Alert alert = driver.switchTo().alert();
        BrowserUtils.wait(2);
        //2. use "alert" instance to accept the javascript alert(popup)
        alert.accept();

//<p id="result" style="color:green">You successfuly clicked an alert</p>
        WebElement resultText = driver.findElement(By.id("result"));


        //assert "resultText" is displayed
        Assert.assertTrue(resultText.isDisplayed(), "result text is not displayed. verification failed!!!");


    }

    @Test
    public void p2_confirmation_alert_practice() {
        // Locating the warning/information alert button to click it
        WebElement warningAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));

        //click to the button
        warningAlertButton.click();

        //create alert instance
        Alert alert = driver.switchTo().alert();

        //we can either accept(), or dismiss() the confirmation alert
        //alert.dismiss();
        alert.accept();

        //licationg the result text web element
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //Assert
        Assert.assertTrue(resultText.isDisplayed(), "Text is not displayed, verification FAILED!!!");

        //

    }


}
