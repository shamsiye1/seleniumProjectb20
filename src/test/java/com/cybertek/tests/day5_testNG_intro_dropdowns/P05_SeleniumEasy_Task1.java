package com.cybertek.tests.day5_testNG_intro_dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class P05_SeleniumEasy_Task1 {
    public static void main(String[] args) {

     // TC 1.OPEN browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // verify"Success check box is checked message is not displayed

        WebElement successCheckBox= driver.findElement(By.xpath("//input[@if='isAgeSelected']"));

        //locate the success message
        // create a locator to success message and share it in class chat
        WebElement successMessage= driver.findElement(By.xpath("//dive[@id='textAge']"));

        // verify "success check box is checked message is not displayed
        if (!successMessage.isSelected() && !successMessage.isDisplayed()){
            System.out.println("Success message is not displayed. verification passed!");
        }else {
            System.out.println("FAILED!!");
        }

        // CLICK TO CHECKBOX UNDER SINGLE CHECBOX DEMO SECTION
        successCheckBox.click();

        // verify success check box is checked message is displayed
        if (successMessage.isSelected()&& successMessage.isDisplayed()){
            System.out.println("Success message is not displayed. verification passed!");
        }else {
            System.out.println("FAILED!!");
        }

        driver.close();





















    }
}
