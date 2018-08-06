package addToCart;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import configs.Config;
import configs.Constants;

public class CartOperations {
	public static void search(String product) throws Exception {

		Thread.sleep(2000);
		Constants.driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).click();
		Constants.driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"))
				.sendKeys(product);
		Constants.driver.findElement(By.xpath("//div/button[@type='submit']")).click();
		Constants.driver.findElement(By.xpath("//div[text()='Apple iPhone SE (Space Grey, 32 GB)']")).click();
		Set<String> tab = Constants.driver.getWindowHandles();
		Iterator<String> window = tab.iterator();
		String parentWindow = window.next();
		String childWindow = window.next();
		Constants.driver.switchTo().window(childWindow);
		Constants.driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		Constants.driver.close();
		Constants.driver.switchTo().window(parentWindow);

	}

	public static void viewCart(String product) {
		Constants.driver.findElement(By.xpath("//span[text()='Cart']")).click();
		String actual = Constants.driver.findElement(By.xpath("(//div[span[contains(text(),'My Cart')]]//..//a)[3]"))
				.getText();
		Assert.assertEquals(actual, "Apple iPhone SE (Space Grey, 32 GB)");
		System.out.println(actual + "Passed Assert Result");
		Constants.driver.quit();
	}

	public static void viewCartItems() {
		Config.wait("//span[text()='Cart']", 10);
		Constants.driver.findElement(By.xpath("//span[text()='Cart']")).click();
		Constants.driver.findElement(By.xpath("//span[text()='Remove Basket']")).click();
		Constants.driver.findElement(By.xpath("//span[text()='Yes, Continue']")).click();

	}
}