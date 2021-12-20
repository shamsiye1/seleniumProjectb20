package com.cybertek.tests.day10_testbase_properties_driverUtil;

import com.cybertek.utilities.SmartBearUtilities;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearPractice_9_10_11 {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() throws InterruptedException {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtilities.loginToSmartBear(driver);

    }

    @Test
    public void p9_delete_order_task() throws InterruptedException {
        // Delete "Mark Smith" from the list
        WebElement markSmithCheckbox = driver.findElement(By.xpath("//td[.='Mark Smith']/../td[1]"));
        Thread.sleep(1000);
        markSmithCheckbox.click();

        WebElement deleteButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        Thread.sleep(1000);
        deleteButton.click();

        Thread.sleep(1000);

        // assert mark smith is not in the table
        List<WebElement> nameList = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr/td[2]"));
        for (WebElement each : nameList) {

            Assert.assertFalse(each.getText().equals("MarK Smith"));

        }


    }


}
