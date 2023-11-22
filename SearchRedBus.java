package com.BusRed.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchRedBus {

	@FindBy(xpath = "//*[@id=\"src\"]")
	WebElement From;

	@FindBy(xpath = "//*[@id=\"dest\"]")
	WebElement To;

	@FindBy(xpath = "//*[@id=\"onwardCal\"]")
	WebElement Date;

	@FindBy(id = "search_button")
	WebElement Searchbtn;

	public SearchRedBus(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

public void SearchRedBus(String from1, String to1) {
	
	From.clear();
	From.sendKeys(from1);
	
	To.clear();
	To.sendKeys(to1);
	
	Date.click();
	
	Searchbtn.click();
	
}
}