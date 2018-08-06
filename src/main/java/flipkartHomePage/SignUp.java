package flipkartHomePage;

import org.openqa.selenium.By;

import configs.BrowserLaunch;
import configs.Constants;

public class SignUp {

	public static void signUp() throws Exception
	{
		BrowserLaunch.chrome(Constants.URL);
		//Constants.driver.findElement(By.xpath("//div[text()='Login & Signup']")).click();
		Constants.driver.findElement(By.xpath("//span[contains(text(),'New to Flipkart?')]")).click();
		Thread.sleep(2000);
		Constants.driver.findElement(By.xpath("//span[contains(text(),'Enter Mobile')]//..//..//input")).click();
		Constants.driver.findElement(By.xpath("//span[contains(text(),'Existing User?')]")).click();
		
		
		
	}
}
