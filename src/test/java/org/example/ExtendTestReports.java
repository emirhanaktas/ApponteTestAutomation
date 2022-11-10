package org.example;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ExtendTestReports {

    ExtentHtmlReporter htmlReporter;
    ExtentHtmlReporter htmlReporter2;
    ExtentHtmlReporter htmlReporter3;


    ExtentReports extent;
    ExtentReports extent2;

    ExtentReports extent3;
    @BeforeSuite
    public void reportSetup(){

        htmlReporter = new ExtentHtmlReporter("logintest.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }
    @BeforeSuite


    public void reportSetup2(){

        htmlReporter2 = new ExtentHtmlReporter("addAppoint.html");
        extent2 = new ExtentReports();
        extent2.attachReporter(htmlReporter2);
    }

    @BeforeSuite

    public  void reportSetup3(){

        htmlReporter3 = new ExtentHtmlReporter("loginDeneme.html");

        extent3 = new ExtentReports();
        extent3.attachReporter(htmlReporter3);

    }


   /* @Test
    public void reportTest(){

    } */

    @AfterSuite
    public void reportTeardown(){
        extent.flush();
    }

}
