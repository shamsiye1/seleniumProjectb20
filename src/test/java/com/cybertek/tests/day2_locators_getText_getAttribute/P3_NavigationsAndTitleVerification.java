package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationsAndTitleVerification {

    public static void main(String[] args) {

        // TC #3: back and forth navigation
        //1_ open a chrome browser
        WebDriverManager.chromedriver().setup();

        //open browser
        WebDriver driver=new ChromeDriver();

        //2_ go to: https://google.com || https://www.google.com
        driver.get("https://google.com");

        //3_ click to gmail from top right
        // we are locating the "gmail" link web element using find Element method and linktext locator
        driver.findElement(By.linkText("Gmail")).click();

        //4_ verify title contains:
        //Expected: Gmail
        String expectedInTitle = "Gmail";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification passed!");
        }else {
            System.out.println("Title verification failed!!!");
        }

        //5_ go back to google by using the .back();
        driver.navigate().back();

        //6_ verify title equals:
        //Expected: google

        String expectedGoogleTitle="Google";
        String actualGoogleTitle=driver.getTitle();

        if (actualGoogleTitle.contains(expectedGoogleTitle)){
            System.out.println("Title verification passed!");
        }else {
            System.out.println("Title verification failed!!!");
        }



    }


}
