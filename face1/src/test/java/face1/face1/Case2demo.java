package face1.face1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class Case2demo {
  @Test(dataProvider = "dp")
  public void f( String fn , String ln, String nandini, String qwertyuio , String qwertyu1 ) {
	  WebDriver driver;
	  driver =  Method.getdriver("NAN");
	  driver.get("http://demowebshop.tricentis.com/");
	   driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
	   driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys(fn);
	   driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys(ln);
	   driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(nandini);
	   driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(qwertyuio);
	   driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys(qwertyu1);
	   driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();

  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "nandini", "bandaru" ,"mnbvcxz@gmail.com" , "mnbvcx" ,"mnbvcx"},
      new Object[] { "srija", "chinthanippu", "asdfg@gmail.com" , "qwert" ,"qwert"},
      new Object[] { "raji", "bandh" ,"lkjhg@gmail.com" ,"asdfg" ,"asdfg" },
    };
  }
}
