package com.cybertek.utilities;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    /**
     * accepts a list of web elements
     *
     * @param List<WebElement>
     * @return List<String>
     * Method should be returning a list of Strings
     */

    public static List<String> getElementsText(List<WebElement> list) {

        List<String> webelementsAsString = new ArrayList<>();

        for (WebElement each : list) {

            webelementsAsString.add(each.getText());

        }

        return webelementsAsString;
    }

    /*
    create a utility method named: wait
    static method @param sec
    2return void
    the integer number that i pass as parameter should be accepted as seconds handle checked exception with try/catch

     */

    public static void wait(int sec) {

        try {
            Thread.sleep(1000 * sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
