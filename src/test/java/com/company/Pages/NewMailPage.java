package com.company.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewMailPage extends BasePage {

    @FindBy(xpath = "(//span[@class='field']/textarea)[1]")
    private WebElement emailAddressInputfield;

    @FindBy(xpath = "(//span[@class='field']/input)[1]")
    private WebElement mailSubject;

    @FindBy(xpath = "(//div[@class='text_editor_browser']/textarea)")
    private WebElement mailTextArea;

    @FindBy(xpath = "(//p[@class='send_container clear']/input)[1]")
    private WebElement btnSubmit;

    public void enterMailAddress(String emailAddress, String subject, String text) {
        emailAddressInputfield.sendKeys(emailAddress);
        mailSubject.sendKeys(subject);
        mailTextArea.sendKeys(text);
        btnSubmit.click();
    }
}
