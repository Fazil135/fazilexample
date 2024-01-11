package sampletest12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MethodCalling {
	WebDriver driver;
	public void BrowserStart() {
		System.setProperty("WebDriver.firefox.driver","/Users/admin1/eclipse-workspace/sampletest/driver/geckodriver");
		 driver=new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");

}
	public void BrowserEnd() {
		driver.close();
	}
	public void usernameMandatory() {
		WebElement loginbtn = driver.findElement(By.id("login"));
		loginbtn.click();
	String usernametext=driver.findElement(By.id("username_span")).getText();
	System.out.println(usernametext);
	}
	public void PasswordMadatory() {
		WebElement username=   driver.findElement(By.id("username"));
	      username.sendKeys("FazilQAINTN");
	      WebElement loginnametext=driver.findElement(By.id("login"));
	  	loginnametext.click();
	  	String passwordtext=driver.findElement(By.id("password_span")).getText();
	  	System.out.println(passwordtext);
	}
	public void Invalidpassword() {
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Fazil@1234");
		WebElement clicklogin=driver.findElement(By.id("login"));
		clicklogin.click();
		String errormsg = driver
				.findElement(By.xpath("//*[text()='Invalid Login details or Your Password might have expired. ']"))
				.getText();
		System.out.println(errormsg);
		
		
	}
	public void LoginButtonPresent() {
	String logintext=	driver.findElement(By.id("login")).getText();
	System.out.println(logintext);	
	}
	public void ValidCredential() {
		WebElement pass=driver.findElement(By.id("password"));
		pass.clear();
		pass.sendKeys("Fazil@123");
		WebElement username=   driver.findElement(By.id("username"));
	      username.sendKeys("FazilQAINTN");
		WebElement loginnametext=driver.findElement(By.id("login"));
		loginnametext.click();
		String usernametext=driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']")).getText();
		System.out.println(usernametext);
		
	}
	public void location() {
		WebElement hloc=driver.findElement(By.id("location"));
		Select hotellocation=new Select(hloc);
		hotellocation.selectByIndex(2);
		
	}
	public void Hotels() {
		WebElement hotl=driver.findElement(By.id("hotels"));
		Select hotlname=new Select(hotl);
		hotlname.selectByIndex(2);
	}
	public void RoomTyp() {
		WebElement rmtype=driver.findElement(By.id("room_type"));
		Select roomtype=new Select(rmtype);
		roomtype.selectByIndex(2);
		
	}
	public static void main(String args[]) {
		MethodCalling mt=new MethodCalling();
		mt.BrowserStart();
		mt.usernameMandatory();
		mt.PasswordMadatory();
		mt.Invalidpassword();
		mt.ValidCredential();
		mt.BrowserEnd();
		mt.location();
		mt.Hotels();
	}
	
	
	
	
	
}
