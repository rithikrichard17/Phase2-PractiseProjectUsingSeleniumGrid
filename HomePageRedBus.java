package com.BusRed.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageRedBus {
	
	@FindBy(id = "bus_tickets_vertical")
	WebElement Bus;
	
	@FindBy(xpath = "//*[@id=\\\"homeV2-root\\\"]/div[1]/div[2]/div/div[1]/div/div[1]/div/div")
	WebElement From;
	
    @FindBy(xpath = "//*[@id=\"homeV2-root\"]/div[1]/div[2]/div/div[3]/div[1]/div/div")
    WebElement To ;
	
	@FindBy(xpath = "//*[@id=\"onwardCal\"]")
	WebElement Date;
	
	//@FindBy(xpath = "//*[@id=\"onwardCal\"]/div/div/text[2]")
	//WebElement desiredDate;
	
	@FindBy(id = "search_button")
	WebElement Searchbtn;
	
	public HomePageRedBus(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	public void clickonbus() {
		Bus.click();
	
	}
	
	public void clickonFrom() {
		From.click();	
		}
	
	public void clickonTo() {
		To.click();;
	}
	
	public void clickonDate() {
		Date.click();
   }
	
	//public void selectdesiredDate() {
		//desiredDate.click();
	//}
	

	public void clickonSearch() {
		Searchbtn.click();
	}

}
