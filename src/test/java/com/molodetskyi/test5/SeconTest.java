package com.molodetskyi.test5;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeconTest {
  @Test
  public void f() {
	  System.out.println("test2");
	  AssertJUnit.assertEquals(true, false);
  }
}
