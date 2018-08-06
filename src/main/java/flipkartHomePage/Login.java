package flipkartHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import configs.BrowserLaunch;
import configs.Constants;

public class Login {
	public static void login(String userName, String password) {
		try{
		//BrowserLaunch.chrome(Constants.URL);
		//Constants.driver.findElement(By.xpath("//a[text()='Login & Signup']")).click();
			
		Constants.driver.findElement(By.xpath("//label[span[text()='Enter Email/Mobile number']]/../input")).click();
		Constants.driver.findElement(By.xpath("//label[span[text()='Enter Email/Mobile number']]/../input")).sendKeys(userName);
		Constants.driver.findElement(By.xpath("//label[span[text()='Enter Password']]/../input")).click();
		Constants.driver.findElement(By.xpath("//label[span[text()='Enter Password']]/../input")).sendKeys(password,Keys.ENTER);
		
		String loggedUserName = Constants.driver.findElement(By.xpath("//header/div[1]//..//span/div")).getText();
		Assert.assertEquals(loggedUserName, "santosh");
				
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		
		

	}

}
