package com.cybertek.tests.day6_dropdown_review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownTasks {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //open a new browser
        //maximize the page
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(14, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @Test
    public void test2_verify_state_dropdown() throws InterruptedException {
        // we need to locate the drop down


        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Illinois");

        // Select Virginia
        Thread.sleep(2000);
        stateDropdown.selectByValue("VA");

        Thread.sleep(2000);
        stateDropdown.selectByIndex(5);

        String expectedResult = "California";
        String actualResult = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualResult, expectedResult, "Actual vs expected is not equal!");


        Thread.sleep(5000);
        driver.quit();


    }


    @Test
    public void test3_date_dropdown_verification() {

        // locate all webelement(dropdown)

        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        // creating expected Value in one place
        String expYear = "1922";
        String expMonth = "December";
        String expDay = "1";

        yearDropdown.selectByVisibleText("1922");

        monthDropdown.selectByValue("11");

        dayDropdown.selectByIndex(0);

        String actYear = yearDropdown.getFirstSelectedOption().getText();
        String actMonth = monthDropdown.getFirstSelectedOption().getText();
        String actDay = dayDropdown.getFirstSelectedOption().getText();

        // creating assert lines to compare actual vs expected

        Assert.assertEquals(actDay, expDay, "actual day expected day not equal");
        Assert.assertEquals(actMonth, expMonth, "actual month expected month not equal");

        Assert.assertTrue(actYear.equals(expYear), "actual year expected year not equal");


    }

    @Test
    public void test4_multiple_value_select_dropdown() {

        // select all the options from multiple select dropdown

        Select multipleSelectDropdown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

        // creating a list of web elements to store all of the options inside of this dropdown

        List<WebElement> allOptions = multipleSelectDropdown.getOptions();

        //Loop through the options to select all of them

        for (WebElement eachOption : allOptions) {
            eachOption.click();  // this will click each option with every iteration

            // print out all selected values

            System.out.println("Selected: " + eachOption.getText());

            //Asserting the option is actually selected or not
            Assert.assertTrue(eachOption.isSelected(), "the option: " + eachOption.getText() + " is not selected!");


        }

        // deselect all values.
        multipleSelectDropdown.deselectAll();

        for (WebElement eachOption : allOptions) {
            Assert.assertTrue(!eachOption.isSelected()); // it will be false boolean value, with ! we make it "true"

            Assert.assertFalse(eachOption.isSelected());
        }


    }

    @Test
    public void test5_html_dropdown_handling(){

        // click to non-select dropdown
        // locate the HTML dropdown as regular web element
        WebElement websiteDropdown= driver.findElement(By.xpath("//div[@class='dropdown']"));
        websiteDropdown.click();

        WebElement facebookLink= driver.findElement(By.xpath("//a[.='Facebook']"));
        facebookLink.click();

        // verify title is "facebook lig in or sign up
        String actTitle=driver.getTitle();
        String expTitle="Facebook - Log In or Sign Up";

        Assert.assertEquals(actTitle,expTitle,"Actual title does not match expected title!");





    }



}
