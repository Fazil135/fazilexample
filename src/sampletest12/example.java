package sampletest12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver", "/Users/admin1/eclipse-workspace/sampletest/driver/geckodriver");

	      // Create a new instance of the Firefox Driver
	      WebDriver driver = new FirefoxDriver();

	      // Navigate to Google Homepage
	      driver.get("https://adactinhotelapp.com/");
	      WebElement username=   driver.findElement(By.id("username"));
	      username.sendKeys("FazilQAINTN");
	      WebElement pass=driver.findElement(By.id("password"));
	      pass.sendKeys("Fazil@123");
	      WebElement loginbtn=driver.findElement(By.id("login"));
	      loginbtn.click();
	      WebElement text=driver.findElement(By.xpath("//*[@id=\'search_form\']/table/tbody/tr[1]/td"));
	     String a=text.getText();
	     System.out.println(a);
	     WebElement location=driver.findElement(By.id("location"));
	     Select select=new Select(location);
	     select.selectByIndex(4);
	     WebElement hotel=driver.findElement(By.id("hotels"));
	     Select drp=new Select(hotel);
	     drp.selectByIndex(3);
	     WebElement room=driver.findElement(By.id("room_type"));
	     Select room1=new Select(room);
	     room1.selectByValue("Standard");
	     WebElement roomno=driver.findElement(By.id("room_nos"));
	     Select no=new Select(roomno);
	     no.selectByValue("4");
	     WebElement date=driver.findElement(By.id("datepick_in"));
	     date.sendKeys("09/01/2024");
	     WebElement out=driver.findElement(By.id("datepick_out"));
	     out.sendKeys("25/01/2024");
	     WebElement adult=driver.findElement(By.id("adult_room"));
	     Select adu=new Select(adult);
	     adu.selectByIndex(2);
	     WebElement children=driver.findElement(By.id("child_room"));
	     Select chi=new Select(children);
	     chi.selectByIndex(3);
	     driver.findElement(By.id("Submit")).click();
	     WebElement txt=driver.findElement(By.xpath("//*[@class='login_title']"));
	     String b=txt.getText();
	     System.out.println(b);
	     WebElement radio=driver.findElement(By.id("radiobutton_0"));
	     radio.click();
	     WebElement nxt=driver.findElement(By.id("continue"));
	     nxt.click();
	     WebElement hea=driver.findElement(By.xpath("//td[text()='Book A Hotel ']"));
	     String c=hea.getText();
	     System.out.println(c);
	      WebElement fna=driver.findElement(By.id("first_name"));
	     fna.sendKeys("faz");
	     WebElement lna=driver.findElement(By.id("last_name"));
	     lna.sendKeys("aha");
	     //address
	     WebElement address=driver.findElement(By.id("address"));
	     address.sendKeys("123 nw1273737338383838383838");
	     WebElement crediy=driver.findElement(By.id("cc_num"));
	     crediy.sendKeys("1234567891234567 ");
	     //credit type
	     WebElement ctype=driver.findElement(By.id("cc_type"));
	     Select ct=new Select(ctype);
	     ct.selectByIndex(2);
	     //credit mnt
	     WebElement ctypemnt=driver.findElement(By.id("cc_exp_month"));
	     Select mnt=new Select(ctypemnt);
	     mnt.selectByIndex(4);
	     //credit yr
	     WebElement cyr=driver.findElement(By.id("cc_exp_year"));
	     Select yr=new Select(cyr);
	     yr.selectByIndex(5);
	     WebElement cvv=driver.findElement(By.id("cc_cvv"));
	     cvv.sendKeys("234444");
	     WebElement booknow=driver.findElement(By.id("book_now"));
	     booknow.click();
	     Thread.sleep(10000);
	     WebElement ordno=driver.findElement(By.id("order_no"));
	    String value= ordno.getAttribute("value");
	     System.out.println(value);
	     


	     

	     

	     

	     
	     



	     



	     
	     
	     
	     		

	     
	     
	     
	    		  

	      // Close the browser
//	      driver.quit();//

	}

}
