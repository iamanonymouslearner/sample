package com.example.api;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.example.utilities.ExtentUtility;

public class Service2 extends ExtentUtility
{
	
  @BeforeClass
  public void createTest()
  {
	  parentTest = extent.createTest("Service2");
  }	
  
  @Test
  public void Service2Test1() 
  {
	  ChildTest = parentTest.createNode("Service2Test1");
	  Assert.assertTrue(1 > 0);
  }
  
  @Test
  public void Service2Test2() 
  {
	  ChildTest = parentTest.createNode("Service2Test2");
	  Assert.assertTrue(1 > 0);
  }
  
  @Test
  public void Service2Test3() 
  {
	  ChildTest = parentTest.createNode("Service2Test3");
	  Assert.assertTrue(1 > 0);
  }  
}
