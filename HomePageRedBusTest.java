package com.BusRed.qa.TestPages;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.BusRed.qa.Base.TestBaseRedBus;
import com.BusRed.qa.Pages.HomePageRedBus;

@Listeners(ItestListenerClass.class)
public class HomePageRedBusTest extends TestBaseRedBus{
	
	
	HomePageRedBus hp;
	
	@BeforeClass
	public void OpenApp() throws MalformedURLException {

	   OpenBrowser("Chrome");
		hp = new HomePageRedBus(driver);
	}
	
	@Test
	public void HomePage() throws InterruptedException {

		Thread.sleep(2000);
		hp.clickonbus();
		//Thread.sleep(2000);
		//hp.sendFrom();
		//Thread.sleep(2000);
		//hp.sendTo();
		//Thread.sleep(2000);
		//hp.clickonDate();
		//Thread.sleep(2000);
		//hp.selectdesiredDate();
		//Thread.sleep(2000);
		//hp.clickonSearch();
		
		

	}
	
	
}
