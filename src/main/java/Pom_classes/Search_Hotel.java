package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(name = "hotels")
	private WebElement Hotels;
	
	@FindBy(xpath="(//select[@class='search_combobox'])[3]")
	private WebElement Roomtype;
	
	@FindBy(id="room_nos")
	private WebElement Qty;
	
	@FindBy(id="datepick_in")
	private WebElement checkin_date;
	
	@FindBy(id="datepick_in")
	private WebElement checkout_date;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement children;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	
	public Search_Hotel(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getQty() {
		return Qty;
	}

	public WebElement getCheckin_date() {
		return checkin_date;
	}

	public WebElement getCheckout_date() {
		return checkout_date;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
}
