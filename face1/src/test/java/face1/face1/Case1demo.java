package face1.face1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Case1demo {
  @Test(enabled=false)
  public void demo1() throws InterruptedException {
	  WebDriver driver;
	  driver =  Method.getdriver("NAN");
	  driver.get("http://demowebshop.tricentis.com/");
	   WebElement acc = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
	  
	    Actions com = new Actions(driver);
	    com.keyDown(acc, Keys.ALT).sendKeys("computer").keyUp(Keys.ALT).build().perform();
	    Thread.sleep(2000);
	    com.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
	    Thread.sleep(2000);
	    com.sendKeys(Keys.ENTER).build().perform();
	    driver.close();
	    
  }
  @Test
  public void fa() throws InterruptedException {
	  WebDriver driver;
	  driver =  Method.getdriver("NAN");
	  driver.get("http://172.31.36.202:443/TestMeApp/fetchcat.htm");
	   WebElement acc1 = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span"));
	   Thread.sleep(2000);
	   Actions test = new Actions(driver);
	   test.moveToElement(acc1).build().perform();
	   WebElement ou = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"));
	   test.moveToElement(ou).build().perform();
	   WebElement ban = driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[2]/a/span"));
	   test.moveToElement(ban).build().perform();
	  ban.click();
	  Thread.sleep(2000);
	  Set<String> ad = driver.getWindowHandles();
	  for(String s:ad)
	  {
		  driver.switchTo().window(s);
		 // String na = driver.getWindowHandle();
		  
	  }
	  driver.switchTo().frame(driver.findElement(By.name("main_page")));
	  WebElement n22 = driver.findElement(By.xpath("//*[@id=\"demo3\"]"));
	  String adder = n22.getText();
	  System.out.println(adder);
	  
  }
  

}

