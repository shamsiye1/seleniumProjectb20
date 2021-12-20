package com.cybertek.tests.day7_webtables;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WebTablesTask {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod() throws InterruptedException {
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.loginToSmartBear(driver);


    }

    @Test
    public void p3_verify_susans_order_date(){

        WebElement susanDate= driver.findElement(By.xpath("//td[.='Susan McLaren']/following-sibling::td[3]"));

        System.out.println("susansDate = "+susanDate.getText());

        String expDate="01/05/2010";
        String actDate=susanDate.getText();

        Assert.assertTrue(actDate.equals(expDate),"Actual date is not equal to expected date");

        Assert.assertEquals(actDate,expDate,"Actual date is not equal to expected date");

     //   Assert.fail("I am failing this test here on purpose");

    }














}
