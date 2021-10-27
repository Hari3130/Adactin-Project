package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation {
	
	public  WebDriver driver;
	
	

	@FindBy(id="my_itinerary")
	private WebElement myitinerary;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement can;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	private WebElement cancel;

	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")
	private WebElement logout;
	
	public Confirmation(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getMyitinerary() {
		return myitinerary;
	}
	
	public WebElement getCan() {
		return can;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getCancel() {
		return cancel;
	}

}
