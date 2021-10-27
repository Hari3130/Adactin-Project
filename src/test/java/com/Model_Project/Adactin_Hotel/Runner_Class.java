package com.Model_Project.Adactin_Hotel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Sleeper;

import Property.File_Reader_Manager;
import SDP.Page_object_Manager;

public class Runner_Class extends Base_class {
	
	public static WebDriver driver = Base_class.get_Driver("chrome");
	
	public static Page_object_Manager pom = new Page_object_Manager(driver);
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		
		geturl(url);
		
		imwait(2);
		
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		
		inputvalueElement(pom.getA().getUsername(), username);
		
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
	
		inputvalueElement(pom.getA().getPassword(), password);
		
		clickOnElement(pom.getA().getLogin());
		
		imwait(5);
		
		selectvalue(pom.getB().getLocation(), "Sydney");
		
		selectvalue(pom.getB().getHotels(), "Hotel Cornice");
		
		selectvalue(pom.getB().getRoomtype(), "Super Deluxe");
		
		selectvalue(pom.getB().getQty(), "2 - Two");
		
		inputvalueElement(pom.getB().getCheckin_date(), "11/11/2021");
		
		sleep(3000);
		
		
		inputvalueElement(pom.getB().getCheckout_date(), "15/11/2021");
		
		sleep(2000);
		
		selectvalue(pom.getB().getAdult(), "3 - Three");
		
		selectvalue(pom.getB().getChildren(), "1 - One");
		
		sleep(3000);
		
		clickOnElement(pom.getB().getSubmit());
		
		imwait(5);
		
		clickOnElement(pom.getC().getRadio());
		
		clickOnElement(pom.getC().getContin());
		
		imwait(2);
		
		inputvalueElement(pom.getD().getFirstname(), "Hari");
		
		inputvalueElement(pom.getD().getLastname(), "Haran");
		
		inputvalueElement(pom.getD().getAddress(), "123,chennai");
		
		sleep(3000);
		String cardnum = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcardnum();
		
		sleep(3000);
		
		inputvalueElement(pom.getD().getCcnum(), cardnum);
		
		sleep(3000);
		
		selectvalue(pom.getD().getCctype(), "Master Card");
		
		selectvalue(pom.getD().getExpmonth(),"October");
		
		selectvalue(pom.getD().getExpyear(), "2022");
		
		sleep(3000);
		
		String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcvv();
		
		inputvalueElement(pom.getD().getCvv(), cvv);
		
		sleep(3000);
		
		clickOnElement(pom.getD().getBook());
		
		sleep(3000);
		
		clickOnElement(pom.getE().getMyitinerary());
		
		sleep(2000);
		
		clickOnElement(pom.getE().getCan());
		
		sleep(2000);
		
		clickOnElement(pom.getE().getCancel());
		
		sleep(2000);
		
		simpleAlert();
		
		screenshot();
		
		sleep(2000);
		
		clickOnElement(pom.getE().getLogout());
		
		sleep(2000);
		
		close();
		
			
	}	
	
	}
