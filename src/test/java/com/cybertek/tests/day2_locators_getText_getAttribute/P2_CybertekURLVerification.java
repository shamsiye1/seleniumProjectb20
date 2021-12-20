package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {
    public static void main(String[] args) {



        //1. need to setup my browser driver.
        WebDriverManager.chromedriver().setup();

        //2. tocreate instance of chrome browser from webdriver
        WebDriver driver= new ChromeDriver();

        // this line will maximize the newly opended browser page
        driver.manage().window().maximize();

        // go to https://practice.cybertekshcool.com
        driver.get("http://practice.cybertekshcool.com");

        // 3. verify URL contains
        // expected: cybertekschool
        String expectedInUrl="cybertekshcool";
        String actualInUrl= driver.getCurrentUrl();

        if (actualInUrl.contains(expectedInUrl)){
            System.out.println("URL verification passed");

        }else{
            System.out.println("URL verification FAILED!!!");
        }

         // 4. verify title:
        // expected: practice
      // --->actual titile<---     -->expected title<--
        if(driver.getTitle().equals("Practice")){
            System.out.println("Title verification Passed!");
        }else {
            System.out.println("Title verification Failed!!!!!");
        }


































    }
}
