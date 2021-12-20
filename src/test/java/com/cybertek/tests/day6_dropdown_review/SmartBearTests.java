package com.cybertek.tests.day6_dropdown_review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class SmartBearTests {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
     driver = WebDriverFactory.getDriver("chrome");
      driver.manage().window().maximize();

      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

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


















}
