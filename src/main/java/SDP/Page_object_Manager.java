package SDP;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Pom_classes.Book_class;
import Pom_classes.Confirmation;
import Pom_classes.Login_page;
import Pom_classes.Search_Hotel;
import Pom_classes.Select_Hotel;

public class Page_object_Manager {
	
	public static WebDriver driver ;
	
	private Login_page a;
	
	private Search_Hotel b;
	
	private Select_Hotel c;
	
	private Book_class d;
	
	private Confirmation e;
	
	
	public Page_object_Manager(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public Login_page getA()
	
	{
		a= new Login_page(driver);
		
		return a;
	}

	public Search_Hotel getB() {
		
		b= new Search_Hotel(driver);
		return b;
	}

	public Select_Hotel getC() {
		c= new Select_Hotel(driver);
		
		return c;
	}

	public Book_class getD() {
		d= new Book_class(driver);
		
		return d;
	}
	public Confirmation getE()
	{
		e= new Confirmation(driver);
		return e;
	}


	

	
	
	

}
