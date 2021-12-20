package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WT_CybertekLinkVerification {
    public static void main(String[] args) {
        //TC #3: PracticeCybertek / forgot password url verification
        //1. open chrome browser

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver= new FirefoxDriver();

        //2. go to http://practice.cybertekschool.com/forgotpassword

        driver.get("https://www.facebook.com/");

        //3. Enter any email into input box
        driver.findElement(By.name("email")).sendKeys("goole@domain.com");

        //4. click on retrieve password
        driver.findElement(By.id("u_0_d_f7")).click();

         String actualText= driver.findElement(By.name("confirmation_message")).getText();
         String expectedText="your emails been sent!";

         if (actualText.equals(expectedText)){
             System.out.println("passed");
         }else {
             System.out.println("failed");
         }















































    }
}
