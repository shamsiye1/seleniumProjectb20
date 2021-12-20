package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_GoogleTitleVerification {
    public static void main(String[] args) {

       /*
          google titile verification
          open chrome browser
          go to https://www.google.com
          verify titile:
          expected: google

         */
         // this code means set up the browser driver
        WebDriverManager.chromedriver().setup();
        // if you are using browser drivers locally, you need to use System.setproperty everytiem
        // we use webdrivermanager

        // open a chrome browser
        // we create an instance of the chromedriver, which also opens an empty browser for us
        WebDriver driver=new ChromeDriver();

        //go to https://www.google.com
        driver.get("https://www.google.com");

        // test title
        String expectedTitle="Google";
        String actualTitle= driver.getTitle();

        if (actualTitle.equals(expectedTitle)){


            System.out.println("Title verification Passed!");
        }else {
            System.out.println("Titile verification Failed!");
        }










    }
}
