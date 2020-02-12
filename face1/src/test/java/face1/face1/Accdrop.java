package face1.face1;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Accdrop {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
	  driver =  Method.getdriver("NAN");
	  driver.get("https://www.google.com/");
	   WebElement acc = driver.findElement(By.name("q"));
	   acc.sendKeys("accenture");
	   Actions act = new Actions(driver);
	   act.keyDown(acc, Keys.ALT).sendKeys("accenture").keyUp(Keys.ALT).build().perform();
	   Thread.sleep(2000);
	act.sendKeys( Keys.DOWN).sendKeys( Keys.DOWN).sendKeys( Keys.DOWN);
	Thread.sleep(2000);
	act.sendKeys( Keys.ENTER);
  }
  @Test(enabled=false)
  public void f1() throws Exception {
	  WebDriver driver;
	  driver =  Method.getdriver("NAN");
	  driver.get("https://www.spicejet.com/default.aspx");
	  Thread.sleep(2000);
	   WebElement e12 = driver.findElement(By.xpath("//*[@id=\"highlight-addons\"]"));
	   Actions act2 = new Actions(driver);
	   act2.moveToElement(e12).build().perform();
	   Thread.sleep(3000);
	   WebElement e13 = driver.findElement(By.xpath("//a[text()='MyFlexiPlan']"));
	   e13.click();
	   
	   
}
  @Test(enabled=false)
  public void f2() throws Exception {
	  WebDriver driver;
	  driver =  Method.getdriver("NAN");
	  driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
	  WebElement s=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
	  WebElement d=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00\"]/tbody/tr/td"));
	  Thread.sleep(10000);
	  
	  WebElement d12=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadGrid1_ctl00\"]/tfoot/tr/td[2]"));
	  Actions act12=new Actions(driver);
	  act12.dragAndDrop(s,d).build().perform();
	  String A_value=d12.getText();
	  String E_title="$0";
	  Assert.assertNotSame(A_value, E_title); 
	  System.out.println("Success");
  }
  public void frame() throws InterruptedException {
	  WebDriver driver;
	  driver =  Method.getdriver("NAN");//https://demos.telerik.com/-ajax/treeview/examples/overview/defaultcs.aspx
	  driver.get("https://www.w3schools.com/Js/tryit.asp?filename=tryjs_alert");
	  Thread.sleep(2000);
	  driver.
  }
  
  }

