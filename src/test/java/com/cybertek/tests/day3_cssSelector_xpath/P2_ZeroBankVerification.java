package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_ZeroBankVerification {
    public static void main(String[] args) {
      // TC: zero bank link text verification
        //1.open chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        //2.go to http://zero.webappsecurety.com.login.html

        driver.get("http://zero.webappsecurity.com/login.html");

        // 3. verify link text from top left
        // expected: "zero bank"

        WebElement zeroBankLinkTopLeft=driver.findElement(By.className("brand"));

        String expectedLinkText="Zero Bank";
        String actualLinkText=zeroBankLinkTopLeft.getText();

        if (actualLinkText.equals(expectedLinkText)){
            System.out.println("Link text verification passed!");
        }else {
            System.out.println("failed");
        }

        //4. verify link href attribute value contains:
        // expected: "index.html

        String expectecInHref="index.html";
        String actualHrefValue= zeroBankLinkTopLeft.getAttribute("href");

        if (actualHrefValue.contains(expectecInHref)){
            System.out.println("Href value passed!");
        }else {
            System.out.println("Href value failed");
        }




























    }
}
