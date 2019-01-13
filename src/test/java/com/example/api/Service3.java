package com.example.api;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.example.utilities.ExtentUtility;

public class Service3 extends ExtentUtility
{
	
  @BeforeClass
  public void createTest()
  {
	  parentTest = extent.createTest("Service3");
  }
 
  @Test
  public void Service3Test1() 
  {
	  ChildTest = parentTest.createNode("Service3Test1");  
	  Assert.assertTrue(1 > 0);
  }
  
  @Test
  public void Service3Test2() 
  {
	  ChildTest = parentTest.createNode("Service3Test2");
	  Assert.assertTrue(1 > 2);
  }
  
  @Test
  public void Service3Test3() 
  {
	  ChildTest = parentTest.createNode("Service3Test3");  
	  Assert.assertTrue(1 > 2);

  }  
}
