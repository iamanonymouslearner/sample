package com.example.api;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.example.utilities.ExtentUtility;

public class Service1 extends ExtentUtility
{
	
	  @BeforeClass
	  public void createTest()
	  {
		  parentTest = extent.createTest("Service1");
		  
	  }	
	  
	
	  @Test
	  public void Service1Test1() 
	  {
		  ChildTest = parentTest.createNode("Service1Test1");
		  Assert.assertTrue(1 > 0);
		  
	  }
	  
	  @Test
	  public void Service1Test2() 
	  {
		  ChildTest = parentTest.createNode("Service1Test2");
		  Assert.assertTrue(1 > 2);
	  }
	  
	  @Test
	  public void Service1Test3() 
	  {
		  ChildTest = parentTest.createNode("Service1Test3");
		  Assert.assertTrue(1 > 0);
	  } 
}
