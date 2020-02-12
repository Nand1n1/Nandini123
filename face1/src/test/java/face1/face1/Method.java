package face1.face1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Method {

	public static WebDriver getdriver(String ba) {
		// TODO Auto-generated method stub
		if(ba.equals("NAN")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\chromedriver.exe");
			return new ChromeDriver();
		}
		else if(ba.equals("MAN")) {
			System.setProperty("webdriver.ie.driver","C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		}
		else {
			return null;
		}

	}

}
