package applicationTest;

import org.testng.annotations.Test;
import java.io.IOException;

import addToCart.CartOperations;
import configs.FetchData;
import flipkartHomePage.Login;
import flipkartHomePage.SignUp;

public class ApplicationTest {
	@Test(priority = 2)
	public void loginTest() throws IOException {
		FetchData.fetchData();
		String userName = FetchData.username;
		String password = FetchData.password;
		Login.login(userName, password);
	}

	@Test(priority = 3)
	public void addToCartTest() throws Exception {
		CartOperations.search("iphone");
		// AddToCart.search("Samsung 253 L Frost Free Double Door 2 Star
		// Refrigerator");
		CartOperations.viewCart("Apple iPhone SE (Space Grey, 32 GB)");
	}

	@Test(priority = 1)
	public void signUp1() throws Exception {
		SignUp.signUp();
	}
}
