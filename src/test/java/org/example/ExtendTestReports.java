package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExtendTestReports {

    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;

    @BeforeSuite
    public void reportSetup(){

        htmlReporter = new ExtentHtmlReporter("logintest.html");

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

   /* @Test
    public void reportTest(){

    } */

    @AfterSuite
    public void reportTeardown(){
        extent.flush();
    }

}
