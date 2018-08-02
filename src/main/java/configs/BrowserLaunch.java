package configs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void chrome(String url) {
		System.setProperty("webdriver.chrome.driver", Constants.driverLoaction);
		Constants.driver = new ChromeDriver();
		Constants.driver.manage().window().maximize();
		Constants.driver.get(url);
		Constants.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
