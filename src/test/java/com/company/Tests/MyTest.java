package com.company.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {

	@Test(priority = 1)
	public void testMailLogin() {
		WebDriver driver = app.common.getDriver();
//		System.out.println(driver.getWindowHandle());

		app.login.loginValidUser();
//		System.out.println(validUsers);

		String userName = app.home.getUserName();
		Assert.assertEquals(userName, validUser.getUserName(), "com.company.Pages.Users.User is not logged");
	}

	@Test(priority = 2)
	public void testSendMail() {
//		app.home.deleteMails();
		app.home.createNewEmailClick();
		app.newMail.sendNewMail();
	}

	@Test(priority = 3)
	public void testReceivedMails() {
		app.home.allMailsClick();

		String subjectTitle = app.home.getMailsSubject();
		Assert.assertEquals(subjectTitle, incomingMail.getMailSubject(), "Send message is not found");
	}
}
