package face1.face1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class web1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver nandini;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\chromedriver.exe");
		nandini = new ChromeDriver();
		nandini.get("http://demowebshop.tricentis.com/");
		nandini.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait1= new WebDriverWait(nandini,60);//60 seconds
		wait1.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("")));
		nandini.manage().window().maximize();
		 List<WebElement> t_links = nandini.findElements(By.tagName("a"));
		 int n_links= t_links.size();
		 System.out.println(n_links);
		 for(int i=0;i<n_links;i++)
		 {
			 String l_linkname = t_links.get(i).getText();
			 System.out.println("The " +i +"th" + "link is:"+l_linkname);
		 }
	}

}
