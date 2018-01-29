package com.company.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(xpath = "//span[@class='user_name']")
	private WebElement lableUserName;

	@FindBy(xpath = "//p[@class='make_message']/a")
	private WebElement createNewEmail;

	@FindBy(xpath = "//span[@class='button l_r']/input")
	private WebElement selectAllmailsCheckbox;

	@FindBy(xpath = "(//span[@class='button l_r del'])[2]")
	private WebElement deleteMails;

	@FindBy(xpath = "(//ul[@class='list_line']/li)[2]")
	private WebElement checkMailBoxLink;

	@FindBy(xpath = "(//span[@class='sbj'])[1]")
	private WebElement subjectOfMails;

	public String getUserName() {
		return lableUserName.getText().trim();
	}

	public void createNewEmailClick() {
		createNewEmail.click();
	}

	public void deleteMails() {
		selectAllmailsCheckbox.click();
		deleteMails.click();
	}

	public void allMailsClick() {
		checkMailBoxLink.click();
	}

	public String getMailsSubject() {
		return subjectOfMails.getText().trim();
	}
}
