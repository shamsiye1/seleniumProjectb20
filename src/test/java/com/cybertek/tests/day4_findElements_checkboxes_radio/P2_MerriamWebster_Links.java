package com.cybertek.tests.day4_findElements_checkboxes_radio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P2_MerriamWebster_Links {
    public static void main(String[] args) {

        //open browser and web
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.merriam-webster.com");

        // print out the text of all links
        // locating all of the web elements on the page and storing in a list of webelements

        List<WebElement> listOfLinks= driver.findElements(By.xpath("//body//a"));

        int linksWithoutText=0;
        int linkWithText=0;

        for (WebElement eachLink: listOfLinks){
            System.out.println(eachLink.getText());

            if(eachLink.getText().isEmpty()){
                linksWithoutText++;

            }else {
                linkWithText++;
            }
        }
        System.out.println("The number of links does not have text= "+linksWithoutText);
        System.out.println("The number of links does not have text= "+linkWithText);
        System.out.println("The number of Total links on this page= "+listOfLinks.size());
        // print out how many link is missing text































    }

}
