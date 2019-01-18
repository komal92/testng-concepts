package simplyautomation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApplicationTest2 {

	@BeforeTest
	public void initializeTest() {
		System.out.println("------------------------");
		System.out.println();
		System.out.println("---Before Test---");
		System.out.println("Executed once before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("---After Test---");
		System.out.println("Executed once after test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("---Before Method---");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("---After Method---");
	}

	@Test(priority = 0)
	public void doLogin() {
		// webdriver code
		System.out.println("Login Test Execution");
	}

	@Test(priority = 1)
	public void changePassword() {
		// webdriver code
		System.out.println("Change Password");
	}

	@Test(priority = 2)
	public void doLogout() {
		// webdriver code
		System.out.println("Log out Test");
	}

}
