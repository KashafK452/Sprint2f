package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser {
	
	public static WebDriver driver;
	public static void gotourl(String url){
		
		String datapath = System.getProperty("user.dir")+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",datapath);
		
		
	    driver= new ChromeDriver();
	    driver.get(url);//orangeHrm
	    driver.manage().window().maximize();  
	    }
	
	

}
