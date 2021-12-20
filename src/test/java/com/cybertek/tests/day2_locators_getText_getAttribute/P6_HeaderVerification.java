package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P6_HeaderVerification {
    public static void main(String[] args) {

        // TC: zero bank header verification
        // 1. open chrome browser

        //WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        //WebDriverManager.edgedriver().setup();
        // open browser
       WebDriver driver= new FirefoxDriver();
        //WebDriver driver= new EdgeDriver();


        //2. go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. verify header text
        // expected: "log in to zerobank

        // locate the header
        // get the text of the header
      // WebElement header = driver.findElement(By.tagName("h3"));// find element returns webElement

        String actualText= driver.findElement(By.tagName("h3")).getText(); // return String


        String expectedText= "Log in to ZeroBank";


        if (actualText.equals(expectedText)){
            System.out.println("Header verification passed");
        }else {
            System.out.println("Header verification failed");
        }





    }

}
