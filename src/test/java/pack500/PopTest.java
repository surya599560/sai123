package pack500;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonmethods.ScreenShot;
import commonmethods.TestBase;
import exceldata.Excel;
import objRep.HomePage;

public class PopTest extends TestBase {
	static HomePage hp;
	static Excel ex;
	static ScreenShot sc;
	
	
	@BeforeMethod
	public static void launchobrowser() {
		TestBase tb = new TestBase();
		tb.launchBrowser("chrome");
	}
	@AfterMethod
	
	public static void closebrowser() {
		driver.quit();
		
	}
	@Test
	public static void tabletest() throws InterruptedException, IOException {
		 hp = new HomePage(driver);
		 ex = new Excel();
		 sc = new ScreenShot();
	String expectedtabtext	= ex.readdata(1, 0);
		Thread.sleep(10000);
		hp.popitems().click();
		Thread.sleep(5000);
		hp.tabletlink().click();
		Thread.sleep(5000);
        String actualtabtext = hp.elementtext().getText();
        if(actualtabtext.contains(expectedtabtext)) {
        	System.out.println("****Test is Pass*******");
        	ex.writedata(1, 1, "Valid data");
        	Assert.assertTrue("expected and actual are same", true);
       }else {
    		System.out.println("****Test is Fail*******");
        	ex.writedata(1, 1, "INValid data");
        	sc.shot();
        	Assert.assertTrue("expected and actual are not same",false);
       }
      
	}
	@Test
	public static void laptoptest() throws IOException, InterruptedException {
		
		 hp = new HomePage(driver);
		 ex = new Excel();
		 sc = new ScreenShot();
	String expectedlaptext	= ex.readdata(2, 0);
		Thread.sleep(10000);
		hp.popitems().click();
		Thread.sleep(5000);
		hp.laptoplink().click();
		Thread.sleep(5000);
        String actuallaptext = hp.elementtext().getText();
        if(actuallaptext.contains(expectedlaptext)) {
        	System.out.println("****Test is Pass*******");
        	ex.writedata(2, 1, "Valid data");
        	Assert.assertTrue("expected and actual are  same", true);
       }else {
    		System.out.println("****Test is Fail*******");
        	ex.writedata(2, 1, "INValid data");
        	sc.shot();
        	Assert.assertTrue("expected and actual are not same",false);
       }
      
		
	}
	@Test
	public static void spketest() throws IOException, InterruptedException {
		 hp = new HomePage(driver);
		 ex = new Excel();
		 sc = new ScreenShot();
	String expectedspktext	= ex.readdata(3, 0);
		Thread.sleep(10000);
		hp.popitems().click();
		Thread.sleep(5000);
		hp.spklink().click();
		Thread.sleep(5000);
        String actualspktext = hp.elementtext().getText();
        if(actualspktext.contains(expectedspktext)) {
        	System.out.println("****Test is Pass*******");
        	ex.writedata(3, 1, "Valid data");
        	Assert.assertTrue("expected and actual are  same", true);
       }else {
    		System.out.println("****Test is Fail*******");
        	ex.writedata(3, 1, " INValid data");
        	sc.shot();
        	Assert.assertTrue("expected and actual are not same",false);
       }
      
		
	}

}
