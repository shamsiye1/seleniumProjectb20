package com.cybertek.tests.day4_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_Checkbox_Practice {
    public static void main(String[] args) throws InterruptedException {

        // open web

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");

        // locating the first checkbox
        WebElement checkbox1= driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));

        // locating the second check box
        WebElement checkbox2= driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));

        // confirm checkbox #1 is NOT selected by default

        if(!checkbox1.isSelected()){
            System.out.println("checkbox is not selected. verification passed!");
        }else {
            System.out.println("failed");
        }

        // confirm checkbox #2 is selected by default
        if (checkbox2.isSelected()){
            System.out.println("checkbox is selected. verification passed!");
        }else {
            System.out.println("checkbox is not selected. verification Failed!!!");
        }

        // click checkbox #1 to select it.
       Thread.sleep(1000);
        checkbox1.click();
        // click checkbox #2 to sedelect it.

        Thread.sleep(1000);
        checkbox2.click();

        //confirm checkbox #1 is selected
        if (checkbox1.isSelected()){
            System.out.println("checkbox 1 is selected, passed");
        }else {
            System.out.println("checkbox 1 is not selected, failed");
        }

        //confirm checkbox #2 is not selected

        if (!checkbox2.isSelected()){
            System.out.println("check2 is not selected, passed");
        }else {
            System.out.println("check2 is selected , failed");
        }





































    }
}
