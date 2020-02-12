package face1.face1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Smart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver nandini;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\chromedriver.exe");
		nandini = new ChromeDriver();
		nandini.get("http://172.31.36.202:443/TestMeApp/RegisterUser.htm");
		nandini.manage().window().maximize();
		 WebElement s= nandini.findElement(By.xpath("//select[@id=\"securityQuestion\"]"));
		 Select b= new Select(s);
		 b.selectByIndex(2);
				
	}		

}
