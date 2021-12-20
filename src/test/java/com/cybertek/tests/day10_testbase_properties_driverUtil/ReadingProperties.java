package com.cybertek.tests.day10_testbase_properties_driverUtil;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file() throws IOException {

        //properties: use properties class object
        //we create properties object to be able to read configuration.properties file , it import from java.util
        Properties properties = new Properties();

        //fileInputStream: open the file
        String path = "configuration.properties";

        //we need to pass the path of the file we want to open in JVM
        FileInputStream file = new FileInputStream(path);

        //we will load the file
        properties.load(file);

        //we read from the file
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));

        // close the file


    }





}
