package sampletest12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdactinHotel {
	WebDriver driver;

	public void browserStart() {

		System.setProperty("Webdriver.firefox.driver", "/Users/admin1/eclipse-workspace/sampletest/driver/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");

	}

	public void browserend() {
		driver.quit();

	}

	public void UserNameMandatory() {

		WebElement loginbtn = driver.findElement(By.id("login"));
		loginbtn.click();
		String errorusernametext = driver.findElement(By.xpath("//span[@id='username_span']")).getText();
		System.out.println(errorusernametext);
	}

	public void Passwordmandatory() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("FazilQAINTN");
		WebElement loginbtn = driver.findElement(By.id("login"));
		loginbtn.click();
		String errorpasswordtext = driver.findElement(By.id("password_span")).getText();
		System.out.println(errorpasswordtext);

	}

	public void Invalidpassword() {
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Fazil@1234");
		String errormsg = driver
				.findElement(By.xpath("//*[text()='Invalid Login details or Your Password might have expired. ']"))
				.getText();
		System.out.println(errormsg);
	}

	public void LoginButtonpresent() {
		String loginbtn = driver.findElement(By.id("login")).getText();
		System.out.println(loginbtn);
	}

	public void ValidCredential() {

		WebElement pass = driver.findElement(By.id("password"));
		pass.clear();
		pass.sendKeys("Fazil@123");
		WebElement loginbtn = driver.findElement(By.id("login"));
		loginbtn.click();
		String welcome = driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']")).getText();
		System.out.println(welcome);
	}
	public static void main(String[]args) {
		AdactinHotel a=new AdactinHotel();
		a.browserStart();
		a.UserNameMandatory();
		a.Passwordmandatory();
//		a.Invalidpassword();
//		a.LoginButtonpresent();
		a.ValidCredential();
	}

}
