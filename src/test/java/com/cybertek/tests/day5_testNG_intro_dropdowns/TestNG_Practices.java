package com.cybertek.tests.day5_testNG_intro_dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Practices {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // go to google
        driver.get("https://google.com");
        driver.manage().window().maximize();

        // waits until the page is loaded for the given time.
        // it will wait up to 15seconds. if page is loaded before that will continue
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void google_title_verification() {
        System.out.println("google_title_verification is running");

        // verify title is google
        String expTitle = "Google";
        String actTitle = driver.getTitle();

        Assert.assertEquals(actTitle, expTitle, "Titles are not matching");
    }

    @Test
    public void google_search_title_verification() {
        System.out.println("google_search_title_verification is RUN");
        // search apple
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple" + Keys.ENTER);
        //make sure title contains apple

        String expTitle = "apple";
        String actTitle = driver.getTitle();

        Assert.assertTrue(actTitle.contains(expTitle), "title does not contain search value.");

    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }



}
