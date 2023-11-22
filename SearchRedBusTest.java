package com.BusRed.qa.TestPages;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.BusRed.qa.Base.TestBaseRedBus;
import com.BusRed.qa.Pages.HomePageRedBus;
import com.BusRed.qa.Pages.SearchRedBus;

public class SearchRedBusTest extends TestBaseRedBus {
	
	HomePageRedBus hp;
	SearchRedBus sp;
	
	@BeforeMethod
	public void openApplication() throws MalformedURLException {
		
		OpenBrowser("Chrome");

		hp = new HomePageRedBus(driver);
		sp = new SearchRedBus(driver);
	}
	
	@Test(priority = '1', dataProvider = "testdata")
	public void RegisterUser(String from1, String to1) {

		//hp.clickonFrom();
		//hp.clickonTo();
		sp.SearchRedBus(from1, to1);

	}
	
	@DataProvider(name = "testdata")
	public Object[][] datasupplier() throws IOException {

		Object[][] input = com.BusRed.qa.Utilities.Xls_DataProvider.getTestData("Sheet1");
		return input;
	}

}