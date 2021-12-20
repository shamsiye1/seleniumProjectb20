package com.cybertek.tests.day4_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P0_FindElements_Practice1 {
    public static void main(String[] args) {

        //1.open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        // go to the required web
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3.print out the texts of all links
        List<WebElement> listOfLinks= driver.findElements(By.xpath("//body//a"));

        // looping through the list of webelements we just created above

        for (WebElement eachLink: listOfLinks){
            // getting the text of each elements in each iteration, and printing the values
            System.out.println(eachLink.getText());
        }

        //4.print out how many total link

        int numberOfLinks= listOfLinks.size();
        System.out.println("numberOfLinks= "+numberOfLinks);


















    }
}
