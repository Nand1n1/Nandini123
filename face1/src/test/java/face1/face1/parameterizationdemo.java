package face1.face1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class parameterizationdemo {
  @Test(dataProvider = "credential")
  public void login(String name, String password) {
	  WebDriver nandini;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\chromedriver.exe");
		nandini = new ChromeDriver();
		nandini.get("http://172.31.36.202:443/TestMeApp/login.htm");
		nandini.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(name);
		nandini.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		nandini.findElement(By.name("Login")).click();
		
		String E_title = "Home";
		String A_title = nandini.getTitle();
		if(A_title.equals(E_title)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
			
		}
  }

  @DataProvider
  public Object[][] credential() {
    return new Object[][] {
      new Object[] { "lalitha", "password123" },
      new Object[] { "nandu", "password23" },
    };
  }
}
