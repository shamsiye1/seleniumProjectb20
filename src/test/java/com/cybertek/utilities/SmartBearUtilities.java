package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class SmartBearUtilities {
WebDriver driver;
    public static void loginToSmartBear(WebDriver driver) throws InterruptedException {

        WebElement usernameInput= driver.findElement(By.id("ctl00_MainContent_username"));
        usernameInput.sendKeys("Tester");

        //<input name="ctl00$MainContent$password" type="password" id="ctl00_MainContent_password" class="txt" style="width:142px">
        WebElement userPassword= driver.findElement(By.id("ctl00_MainContent_password"));
        userPassword.sendKeys("test");
        Thread.sleep(2000);

        //<input type="submit" name="ctl00$MainContent$login_button" value="Login" id="ctl00_MainContent_login_button" class="button">
        WebElement loginButton= driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();


    }

    @Test
    public void task1_login_page_links_print_test() throws InterruptedException {
// Enter username:"Tester"
        //<input name="ctl00$MainContent$username" type="text" id="ctl00_MainContent_username" class="txt" style="width:142px">
        WebElement usernameInput= driver.findElement(By.id("ctl00_MainContent_username"));
        usernameInput.sendKeys("Tester");

        //<input name="ctl00$MainContent$password" type="password" id="ctl00_MainContent_password" class="txt" style="width:142px">
        WebElement userPassword= driver.findElement(By.id("ctl00_MainContent_password"));
        userPassword.sendKeys("test");
        Thread.sleep(2000);

        //<input type="submit" name="ctl00$MainContent$login_button" value="Login" id="ctl00_MainContent_login_button" class="button">
        WebElement loginButton= driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        //print out count of all the links on landing page
        driver.findElement(By.xpath("//body//a"));
        //  this will return all of the links

        List<WebElement> allLinks= driver.findElements(By.xpath("//body//a"));
        System.out.println("Count of all the links on the page = "+allLinks.size());

        // print out each link text on this page

        for (WebElement eachlinks: allLinks){
            System.out.println("eachLink = "+eachlinks.getText());
        }










    }


    @Test
    public void task2_create_order_with_javafaker(){
        // click on order link
        WebElement orderLink= driver.findElement(By.xpath("//a[.='Order']"));
        orderLink.click();

    }

    public static void verifyOrder(WebDriver driver, String name){

       // List<WebElement> nameList=driver.findElements(By.xpath(""));

    }





}
