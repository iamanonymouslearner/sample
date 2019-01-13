package com.example.utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentUtility 
{
	
public static ExtentHtmlReporter htmlReporter;
public static ExtentReports extent;
public static ExtentTest parentTest;
public static ExtentTest ChildTest;

  @AfterMethod
  public void afterMethod(ITestResult result) 
  {
    if(result.getStatus() == ITestResult.FAILURE)
    {
    	ChildTest.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
    	ChildTest.fail(result.getThrowable());
    }
    else if(result.getStatus() == ITestResult.SUCCESS)
    {
    	ChildTest.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
    }
    else
    {
    	ChildTest.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
    	ChildTest.skip(result.getThrowable());
    }	  
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	    htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/extentReport.html");
	    extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);

	    extent.setSystemInfo("OS", "Mac Sierra");
	    extent.setSystemInfo("Host Name", "Test");
	    extent.setSystemInfo("Environment", "QA");
	    extent.setSystemInfo("User Name", "example");

	    htmlReporter.config().setChartVisibilityOnOpen(true);
	    htmlReporter.config().setDocumentTitle("Extent report");
	    htmlReporter.config().setReportName("Final Report");	  
  }

  @AfterSuite
  public void afterSuite() 
  {
	  extent.flush();
  }

}
