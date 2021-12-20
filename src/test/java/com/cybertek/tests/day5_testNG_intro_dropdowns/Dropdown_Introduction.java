package com.cybertek.tests.day5_testNG_intro_dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Dropdown_Introduction {
   WebDriver driver;

   @BeforeMethod
   public void setUpMethod(){

       WebDriverManager.chromedriver().setup();
       driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

       driver.get("http://practice.cybertekschool.com/dropdown");

   }

    @Test
    public void dropdown_test_1(){
 // we must locate the dropdown then pass it into select constructor

        Select simpleDropdown= new Select(driver.findElement(By.id("dropdown")));

        //simpleDropdown.getFirstSelectedOption(); // return type is web element
        String actSelectedOption =simpleDropdown.getFirstSelectedOption().getText();
        String expSelectedOption="Please select an option";

        Assert.assertEquals(actSelectedOption,expSelectedOption);

          simpleDropdown.selectByVisibleText("Option 2");


    }





}
