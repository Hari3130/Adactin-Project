package Property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws IOException {
		
		File f = new File("C:\\Users\\User\\eclipse-workspace\\Adactin_Hotel\\src\\main\\java\\"
				+ "Property\\configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
				
	}
	
	
			
	
	public  String getUsername() {
		
		 		
		String username = p.getProperty("username");
		
		return username ;
		
	}
	
	public  String getPassword() {
		
				
		String password = p.getProperty("password");
		
		return password;
		
	}
	
	public  String getUrl() {
		
		String url = p.getProperty("url");
		
		return url;
		

	}
		
	public  String getcardnum() {
		String cardnum = p.getProperty("cardnum");
		
		return cardnum;
	}
	
	public String getcvv() {
		
		String cvv = p.getProperty("cvv");
		return cvv;
	}
	
	
}
