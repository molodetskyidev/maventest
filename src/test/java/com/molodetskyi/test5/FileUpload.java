package com.molodetskyi.test5;

import org.testng.annotations.Test;

import general.TestBase;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;

public class FileUpload extends TestBase {
	IOSDriver<IOSElement> driver;
  @Test
  public void f() throws IOException {
	  // com.apple.mobileslideshow.photos
	 driver.pushFile("@com.apple.mobileslideshow:All Photos/2.jpg", new File("/Users/alexander/Desktop/testimages/2.jpg"));


  }
  @BeforeTest
	 public void initiateDriver() throws MalformedURLException {
			driver =mycapabilities();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}

}
