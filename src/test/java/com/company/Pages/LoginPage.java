package com.company.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	@FindBy(name = "login")
	private WebElement inputLogin;

	@FindBy(name = "pass")
	private WebElement inputPassword;

	@FindBy(xpath = "//form[@name='lform']//input[@type = 'submit']")
	private WebElement btnSubmit;

	@FindBy(name = "domn")
	private WebElement domen;

	public void login(String name, String password) {
//		System.out.println(new Select(domen).getAllSelectedOptions());

		log.info(String.format("Login user name -%s, password -%s", name, password));
		inputLogin.sendKeys(name);
		inputPassword.sendKeys(password);
		btnSubmit.click();
	}
}
