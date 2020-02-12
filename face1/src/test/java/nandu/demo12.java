package nandu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver nandini;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Public\\Documents\\Selenium\\BrowserDrivers\\chromedriver.exe");
		nandini = new ChromeDriver();
		nandini.get("https://www.facebook.com/");
		 nandini.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("nandini");
		 nandini.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("bandaru");
		 nandini.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys("9398573602");
		 nandini.findElement(By.xpath("//*[@id=\"u_0_w\"]")).sendKeys("qwert");
		 nandini.findElement(By.xpath("//*[@id=\"month\"]")).sendKeys("Aug");
		 nandini.findElement(By.xpath("//*[@id=\"day\"]")).sendKeys("02");
		 nandini.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("1998");
		 nandini.findElement(By.xpath("//*[@id=\"u_0_z\"]")).click();
	}

}
