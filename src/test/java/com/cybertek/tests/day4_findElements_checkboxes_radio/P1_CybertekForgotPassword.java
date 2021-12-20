package com.cybertek.tests.day4_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_CybertekForgotPassword {
    public static void main(String[] args) {

        // 1.open chrome browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        //2. go to target url link
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH/ CSS locator only
        // a."home" link
        WebElement homeLink= driver.findElement(By.xpath("//a[.='Home']"));

        //if i want to locate the same web element using href attribute value
        //WebElement homeLink=driver.findElement(By.xpath("//a[@href='/']))

        //b. "forgot password" header
        WebElement header= driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        //c."E-mail" text
        WebElement emailLabel= driver.findElement(By.xpath("//label[@for='email']"));

        // d. Email input box
        WebElement emailInput= driver.findElement(By.xpath("//input[@name='email']"));

        //e. retrieve password button
        //Using css selector to locate this button
        //Option #1: using this syntax --> button#form_submit
        //Option #2: using this syntax --> button[id='form_submit']
        //Option #3:using this syntax --> button[class='radius']
        // Option #4
        WebElement retrievePasswordButton= driver.findElement(By.cssSelector("button.radius"));

        // f. "powered by cybertek school" text
        WebElement linkText= driver.findElement(By.xpath("//a[.='Cybertek School']"));
        WebElement poweredByDiv= driver.findElement(By.xpath("//dive[@style='text-align: center;']"));

        System.out.println("linkText= "+linkText.getText());
        System.out.println("poweredByDiv= "+poweredByDiv.getText());

        // 4. verify all WebElements are displayed.
        // .isDisplayed --> returns true if given web element is displayed, vice versa
        if (homeLink.isDisplayed() && emailLabel.isDisplayed()&& retrievePasswordButton.isDisplayed()&& poweredByDiv.isDisplayed()&& header.isDisplayed() && emailInput.isDisplayed()){
            System.out.println("All web elements are displayed. verification passed!");
        }else {
            System.out.println("failed");
        }


















    }
}
