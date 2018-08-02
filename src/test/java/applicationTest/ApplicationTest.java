package applicationTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import addToCart.AddToCart;
import configs.FetchData;
import flipkartHomePage.Login;

public class ApplicationTest {
	@Test(priority=1)
	public void loginTest() throws IOException {
		FetchData.fetchData();
		String userName = FetchData.username;
		String password = FetchData.password;
		Login.login(userName, password);
	}

	@Test(priority= 2)
	public void addToCartTest() throws Exception {
		AddToCart.search("iphone");
		//AddToCart.search("Samsung 253 L Frost Free Double Door 2 Star Refrigerator");
		AddToCart.viewCart("Apple iPhone SE (Space Grey, 32 GB)");
	}
	
}
