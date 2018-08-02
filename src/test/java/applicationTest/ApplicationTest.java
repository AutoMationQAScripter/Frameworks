package applicationTest;

import java.io.IOException;

import org.testng.annotations.Test;

import configs.FetchData;
import flipkartHomePage.Login;

public class ApplicationTest {
	@Test
	public void loginTest() throws IOException{
		FetchData.fetchData();
		String userName = FetchData.username;
		String password = FetchData.password;
		Login.login(userName, password);
	}

}
