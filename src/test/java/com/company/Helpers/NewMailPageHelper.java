package com.company.Helpers;

import com.company.Mails.Mail;
import com.company.Mails.MailFactory;
import com.company.Pages.NewMailPage;

public class NewMailPageHelper extends NewMailPage {

	public void sendNewMail() {
		Mail incomingMail = MailFactory.getIncomingMail();
		enterMailAddress(incomingMail.getEmailAddressInputfield(), incomingMail.getMailSubject(), incomingMail.getMailTextArea());
	}
}
