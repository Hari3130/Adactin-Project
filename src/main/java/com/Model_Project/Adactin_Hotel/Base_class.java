package com.Model_Project.Adactin_Hotel;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Base_class {
	
	public static WebDriver driver;

	public static WebDriver get_Driver(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\User\\eclipse-workspace\\Adactin_Hotel\\Driver\\chromedriver.exe");
			// System.getProperty("user.dir" + "//Drivers//chromedriver.exe"));

			driver = new ChromeDriver();

		}

		else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir" + "//Drivers//geckodriver.exe"));

			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		return driver;
	}

	public static void clickOnElement(WebElement element) {

		element.click();

	}

	public static void selectvalue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);

	}

	public static void inputvalueElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void geturl(String url) {

		driver.get(url);

	}

	public static void movetoelement(WebElement element) {

		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	public static void scrollby(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File("C:\\Users\\User\\eclipse-workspace\\Adactin_Hotel\\screenshot\\Hotelbooking.png");
		FileUtils.copyFile(srcfile, destfile);

	}

	public static void movetoframe(WebElement element) {

		driver.switchTo().frame(element);

	}

	public static void switchtodefault() {

		driver.switchTo().defaultContent();

	}

	public static void imwait(int value) {

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	public static void close() {

		driver.close();

	}
	
	public  static void  sleep(int value) throws InterruptedException {
		
		Thread.sleep(value);
		
	
		}
	
	public static  void simpleAlert() {
	
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
			
	}
}





