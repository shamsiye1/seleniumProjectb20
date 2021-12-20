package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        // 1. setup the driver
        WebDriverManager.chromedriver().setup();

        //2. create instance of the driver
        WebDriver driver= new ChromeDriver(); // this line is opening me browser
        driver.manage().window().maximize();

        //3. use the driver instance to test selenium
        driver.get("https://www.google.com");

        driver.getTitle(); // need to print

        System.out.println("The tile of the page is: "+driver.getTitle());

        String actualTitle = driver.getTitle();
        System.out.println("Actual title string: "+actualTitle);

        String actualUrl= driver.getCurrentUrl();  // does not accept any arguement
        System.out.println("actualUrl = "+actualUrl);


        Thread.sleep(2000); // it means waitng 2seconds and go back to previous page
        driver.navigate().back(); // kayniga kaytix balgisi ni bisix komandisi, basic navigations contains: back(), forward(), refresh(), and to() methods.
        // these methods are doing simple actions as if the user has clicked the bottons on the browser.

        Thread.sleep(3000);
        driver.navigate().forward();

        Thread.sleep(3000);
        driver.navigate().refresh();

        Thread.sleep(3000);
        driver.navigate().to("https://www.facebook.com");

        String pageSource= driver.getPageSource();

        System.out.println("pageSource = "+ pageSource);

        driver.close();




    }
}
