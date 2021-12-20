package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    /*
    task: new method creation
    method name: getDriver
    Static method
    accepts string argument: browserType --> will determine what browser opens
       -> if "chrome" opens chrome browser
       -> if "firefox" opens firefox browser

       return type: webDriver <== important
     */

  public static WebDriver getDriver(String browserType){

      if (browserType.equalsIgnoreCase("Chrome")){
          WebDriverManager.chromedriver().setup();
          return new ChromeDriver();
      }else if (browserType.equalsIgnoreCase("firefox")){
          WebDriverManager.firefoxdriver().setup();
          return new FirefoxDriver();
      }else {
          System.out.println("Given browser does not exist. Driver= null!");
          return null;
      }

  }




}
