package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	//testng.NewTest
  @Test
  public void f() {
	  System.out.println("this is my test area 1");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is my preconditions area");
  } 
  @Test
  public void G()
  {
	  System.out.println("this is my test area 2");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is my postconditions area");
  }

}
