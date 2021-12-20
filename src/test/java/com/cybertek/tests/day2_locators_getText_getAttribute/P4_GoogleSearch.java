package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearch {

    public static void main(String[] args) {
        // 1. open a chrome browser
        WebDriverManager.chromedriver().setup();

       // create driver instance and open chrome browser
        WebDriver driver= new ChromeDriver();

        //2. go to: web
        driver.get("https://google.com");

        //3. write "apple" in search box
        // to be able to write anything in the search box
        // i need to locate search box and use sendKeys() method to send "apple"

        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);

        // 4. CLICK google search button
        // 5. verify title:
        // Expected: title should be "apple - google search"

        String expectedTitle= "apple - Google Search";
        String actualTitle= driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Search title verification passed!");
        }else {
            System.out.println("Search title verification failed!!");
        }







      





    }




}
