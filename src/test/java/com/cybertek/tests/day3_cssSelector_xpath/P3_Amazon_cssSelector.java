package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Amazon_cssSelector {
    public static void main(String[] args) {
        // TC: Amazon link number verification
        //1.open chrome browser
        //2. go to http://amazon.com
        WebDriver driver= WebDriverFactory.getDriver("firefox");
        driver.get("http://amazon.com");


        //Enter the search term( use cssSelector to locate search box)
        WebElement searchBox=driver.findElement(By.cssSelector("input=[id='twotabsearchtextbox']"));

        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);

        //4. verify title contains search term
        //expected
        //actual
        //create if condition

     
    }
}
