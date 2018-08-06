package configs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Config {
	public static void wait(String items, Integer time) {

		WebDriverWait wait = new WebDriverWait(Constants.driver, time);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(items)));

	}

}
